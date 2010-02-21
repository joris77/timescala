
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

var options = function(p_options){
    ret_options = '';
    for(var option in p_options){
        ret_options = ret_options + '<option>' + p_options[option] + '</option>';
    }
    return ret_options
}

