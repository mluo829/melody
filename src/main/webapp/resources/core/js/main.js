$(document).ready(function ($) {
    $.ajax({
        url: "http://localhost:8080/spring4/trash"
    }).then(function (data) {
        $('.song-id').append(data.id);
        $('.song-title').append(data.title);
    });
});