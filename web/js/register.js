/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).on('click', '#save', function () {
    createProfile();
});

function createProfile() {

    $.ajax({
        url: "/SmartEx/registerSave",
        data: "userName=" + $("#userName").val() + "&email=" + $("#email").val() + "&password=" + $("#password").val() + "&productID=" + $("#productID").val(),
        type: "POST",
        success: function (response) {
           if(response.toString() === "true"){
               window.location.assign('/SmartEx/dashboard');
           } else {
               window.location.assign('/SmartEx/register');
           }
           
        },
        error: function (error) {
        }
    });


}
