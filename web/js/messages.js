/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function () {

    $("#emailCompose").hide();
    inbox();
    
});

$(document).on('click', '#composeButton', function () {
    $("#emailCompose").show();
});

$(document).on('click', '#saveButton', function () {
    $("#emailCompose").hide();
});

$(document).on('click', '#sendButton', function () {
    $("#emailCompose").hide();
});

$(document).on('click', '#cancelButton', function () {
    $("#emailCompose").hide();
});

function dashboard() {
    
    window.location.assign('/SmartEx/dashboard');
}

function inbox() {
    $("#inbox").addClass("active");
    $("#sent").removeClass("active");
    $("#draft").removeClass("active");
    
     $.ajax({
        url: "/SmartEx/messages/inbox",
        data: "productID=1",
        type: "POST",
        success: function (response) {
            var messages = response;
            for(var i = 0; i < messages.length; i++){
                var message = '<tr>' +
                                    '<td>' + messages[i]['subject'] + ' - ' + messages[i]['body'] + '</td>' +
                                    '<td>' + messages[i]['date'] + '</td>'
                              '</tr>';
                        
                        
                $("#inboxPanel tbody").append(message);
            }
        },
        error: function (e) {
        }
    });
    
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
