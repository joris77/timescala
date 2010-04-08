var years = function(){
    var curr_year = new Date().getFullYear();
    var start_year = curr_year - 15
    var end_year = curr_year + 15
    years_to_return = []
    for(; start_year < end_year ; start_year++){
        years_to_return.push(start_year)
    }
    return years_to_return
};

var options = function(p_options, value){
    ret_options = '';
    for(var option in p_options){
        ret_options = ret_options + '<option value="' + p_options[option] +'"';

        if((value + '') === (p_options[option] + '')){
            ret_options = ret_options + 'selected="true"'
        }

        ret_options = ret_options + '>' + p_options[option] + '</option>';
    }
    return ret_options
}

Date.prototype.getWeek = function() {
    var determinedate = new Date();
    determinedate.setFullYear(this.getFullYear(), this.getMonth(), this.getDate());
    var D = determinedate.getDay();
    if(D == 0) D = 7;
    determinedate.setDate(determinedate.getDate() + (4 - D));
    var YN = determinedate.getFullYear();
    var ZBDoCY = Math.floor((determinedate.getTime() - new Date(YN, 0, 1, -6)) / 86400000);
    var WN = 1 + Math.floor(ZBDoCY / 7);
    return WN;
}


