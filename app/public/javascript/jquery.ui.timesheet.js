(function($) {
    $.widget("ui.timesheet", {
        timeForm : '<form><fieldset><label for="name">Time</label><input type="text" name="time" id="time" /></fieldset></form>',
        month : null,
        year : null,
        dayTable : null,
        _init: function() {
            var currentDate = new Date()

            this.month = currentDate.getMonth();

            this.year = currentDate.getFullYear();

            var dialog = $('<div></div>')
            .html(this.timeForm)
            .dialog({
                autoOpen: false,
                title: 'Create time',
                buttons: {
                    'Create': function(){
                        $(dayTable).append('<tr>' +
                            '<td>' +  $("#time").val() + '</td>' +
                            '</tr>')
                        $(this).dialog('close');
                    }
                },
                close : function(){
                    $('#time').val('');
                }
            });

        
            var html = '<table class="calendarTable" width="80%" border="3" cellspacing="3" cellpadding="3" class="ui-widget ui-widget-content"><thead>' +
            '<tr><td colspan="7" align="center">' +
            '<select id="select_month">' + options(['1','2','3','4','5','6','7','8','9','10','11','12'],this.month +1)+'</select>' +
            '<select id="select_year">' + options(years(),this.year) + '</select>' +
            '</td></tr>'  +
            '<tr><td align=center>Sun</td><td align=center>Mon</td><td align=center>Tue</td><td align=center>Wed</td>' +
            '<td align=center>Thu</td><td align=center>Fri</td><td align=center>Sat</td></tr></thead><tbody>';
            
            var weeks = this.getWeeks();

            var dataCallback = this.options.data;

            if($.isFunction(dataCallback)){
                var data = dataCallback(this.year,this.month)
            }

            var last_day_of_the_month = this.last_day().getDate();
            var first_day_of_the_month = this.getFirstOfTheMonth().getDay()
            var day = 1;
            for(var i in weeks){
                var week = weeks[i]
                html += '<tr>';
                for (var j = 0; j <= 6; j++) {
                    html += '<td>';

                    if (day <= last_day_of_the_month && (week > this.getFirstWeekOfTheMonth() || j >= first_day_of_the_month)) {
                        html += '<table id="day'+ day + 'Table"><tr><td>'
                        html += day;
                        day++;
                        html += '</td></tr></table>'
                    }

                    html += '</td>';
                }
                html += '</tr>';
            }
            html +='</tbody></table>';
            $(this.element).html(html);

            // add the listeners

            for(var k = first_day_of_the_month; k <= last_day_of_the_month; k++){
                $('#day' + k + "Table").click(function() {
                    dayTable = $(this);
                    dialog.dialog('open');
                });
            }
        },
        years : function(){
            var curr_year = new Date().getFullYear();
            var start_year = curr_year - 15;
            var end_year = curr_year + 15;
            var years_to_return = [];
            for(; start_year < end_year ; start_year++){
                years_to_return.push(start_year);
            }
            return years_to_return
        },
        options : function(p_options, value){
            var ret_options = '';
            for(var option in p_options){
                ret_options = ret_options + '<option value="' + p_options[option] +'"';

                if((value + '') === (p_options[option] + '')){
                    ret_options = ret_options + 'selected="true"';
                }

                ret_options = ret_options + '>' + p_options[option] + '</option>';
            }
            return ret_options
        },
        getWeeks : function(){
            var first_day_of_the_month = new Date(this.year,this.month,1);
            var last_day_of_the_month = this.last_day();
            var weeks = []
            for(var i = (first_day_of_the_month.getWeek());i <= (last_day_of_the_month.getWeek());i++){
                weeks.push(i);
            }
            return weeks;
        },
        last_day : function(){
            return new Date(this.year, this.month + 1, 0);
        },
        getFirstOfTheMonth : function(){
            return new Date(this.year, this.month, 1);
        },
        getFirstWeekOfTheMonth : function(){
            return this.getWeeks()[0];
        },
        day : function(p_date){
            return {
                date : p_date
            }
        }
    });
})(jQuery);