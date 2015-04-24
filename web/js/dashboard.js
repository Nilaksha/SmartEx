/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function () {

    newMessageCount();
    $("#productID").hide();
});

function newMessageCount() {

    $.ajax({
        url: "/SmartEx/message/newMessageCount",
        data: "productID=" + $("#productID").text(),
        type: "POST",
        success: function (response) {
            $("#newMessageCount").text(response);
        },
        error: function (e) {
        }
    });
}