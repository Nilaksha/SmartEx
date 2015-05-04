/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$(document).ready(function () {

    userName();
});

function userName() {

    $.ajax({
        url: "/SmartEx/dashboard/userName",
        data: "productID=" + $("#productID").text(),
        type: "POST",
        success: function (response) {
            $("#userName").after(response);
        },
        error: function (e) {
        }
    });
}
