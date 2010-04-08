(function($) {
    $.widget("ui.simpleButton", {
        _init: function() {
            var html = '<button id="testButton">test</button>';
            $(this.element).html(html);
            $('#testButton').click(function(event){alert('hi')});
        }
    });
})(jQuery);


