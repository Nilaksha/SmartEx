/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function () {

    newMessageCount();
    $("#productID").hide();
});

$(document).on('click', '#searchBtn', function(){
    search();
});

function newMessageCount() {

    $.ajax({
        url: "/SmartEx/messages/newMessageCount",
        data: "productID=" + $("#productID").text(),
        type: "POST",
        success: function (response) {
            $("#newMessageCount").text(response);
        },
        error: function (e) {
        }
    });
}

function dashboard() {
    
    window.location.assign('/SmartEx/dashboard');
}

function messages() {
    
    window.location.assign('/SmartEx/messages/inbox');
}