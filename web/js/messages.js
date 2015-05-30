/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function () {

    $("#emailCompose").hide();

    $.ajax({
        url: "/SmartEx/messages/inbox",
        type: "POST",
        success: function (response) {
            var messages = response;
            for (var i = 0; i < messages.length; i++) {
                var message = '<tr>' +
                        '<td>' + messages[i]['name'] + '</td>' +
                        '<td>' + messages[i]['subject'] + ' - ' + messages[i]['body'] + '</td>' +
                        '<td>' + messages[i]['date'] + '</td>' +
                        '</tr>';

                $("#inboxPanel tbody").append(message);
            }
        },
        error: function (e) {
        }
    });

    $.ajax({
        url: "/SmartEx/messages/sent",
        type: "POST",
        success: function (response) {
            var messages = response;
            for (var i = 0; i < messages.length; i++) {
                var message = '<tr>' +
                        '<td>' + messages[i]['name'] + '</td>' +
                        '<td>' + messages[i]['subject'] + ' - ' + messages[i]['body'] + '</td>' +
                        '<td>' + messages[i]['date'] + '</td>' +
                        '</tr>';

                $("#sentPanel tbody").append(message);
            }
        },
        error: function (e) {
        }
    });

    $.ajax({
        url: "/SmartEx/messages/draft",
        type: "POST",
        success: function (response) {
            var messages = response;
            for (var i = 0; i < messages.length; i++) {
                var message = '<tr>' +
                        '<td>' + messages[i]['name'] + '</td>' +
                        '<td>' + messages[i]['subject'] + ' - ' + messages[i]['body'] + '</td>' +
                        '<td>' + messages[i]['date'] + '</td>' +
                        '</tr>';

                $("#draftPanel tbody").append(message);
            }
        },
        error: function (e) {
        }
    });

    inbox();

});

$(document).on('click', '#saveButton', function () {
    
    var message =  {subject: $("#messageSubject").val(), body: $("#messageBody").val()};

    $.ajax({
        url: "/SmartEx/messages/saveMessage",
        contentType: 'application/json',
        data: JSON.stringify(message),
        dataType: 'json',
        type: "POST",
        success: function (response) {
        },
        error: function (error) {
        }
    });
});

$(document).on('click', '#sendButton', function () {
    
    var message =  {subject: $("#messageSubject").val(), body: $("#messageBody").val()};
    
    $.ajax({
        url: "/SmartEx/messages/sendMessage",
        contentType: 'application/json',
        data: JSON.stringify(message),
        dataType: 'json',
        type: "POST",
        success: function (response) {
            $( "#cancelButton" ).click();
        },
        error: function (error) {
        }
    });
});


function dashboard() {

    window.location.assign('/SmartEx/dashboard');
}

function inbox() {
    $("#inbox").addClass("active");
    $("#sent").removeClass("active");
    $("#draft").removeClass("active");
    $("#inboxPanel").show();
    $("#sentPanel").hide();
    $("#draftPanel").hide();
}

function sent() {
    $("#inbox").removeClass("active");
    $("#sent").addClass("active");
    $("#draft").removeClass("active");
    $("#inboxPanel").hide();
    $("#sentPanel").show();
    $("#draftPanel").hide();
}

function draft() {
    $("#inbox").removeClass("active");
    $("#sent").removeClass("active");
    $("#draft").addClass("active");
    $("#inboxPanel").hide();
    $("#sentPanel").hide();
    $("#draftPanel").show();
}
