var Modal = (function () {
    var modalOpen = function () {
        var title = $(this).data('title');
        var msg = $(this).data('msg');
        $('.modal-title').text(title);
        $('.modal-msg').text(msg);
        $('.modal').addClass('in');
    };

    var modalClose = function () {
        $('.modal').removeClass('in');
    };

    $('.button').click(modalOpen);
    $('.-close').click(modalClose);
})();