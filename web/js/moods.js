/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function () {

    update();
});

function update() {

    $.ajax({
        url: "/SmartEx/moods/update",
        data: "productID=1",
        type: "POST",
        success: function (response) {
            //$("#newMessageCount").text(response);
            var moods = response;
            var dd = 5;
        },
        error: function (e) {
        }
    });
}