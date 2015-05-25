/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function () {

    $("#registerForm").validate({
        rules: {
            userName: "required",
            email: {
                required: true,
                email: true
            },
            password: {
                required: true,
                minlength: 3
            },
            confirmPassword: {
                required: true,
                minlength: 3,
                equalTo: "#password"
            },
            productID: {
                required: true,
                number: true
            }
        },
        messages: {
            userName: "Please enter a username",
            email: {
                required: "Please enter your e-mail address",
                email: "Please enter a valid e-mail address"
            },
            password: {
                required: "Please provide a password",
                minlength: "Your password must be atleast 3 characters long"
            },
            confirmPassword: {
                required: "Please provide a password",
                minlength: "Your password must be atleast 3 characters long",
                equalTo: "Please enter the same password as above"
            },
            productID: {
                required: "Please provide the product ID",
                number: "Your product ID must be a number"
            }
        },
        submitHandler: function () {
            $.ajax({
                url: "/SmartEx/registerSave",
                data: "userName=" + $("#userName").val() + "&email=" + $("#email").val() + "&password=" + $("#password").val() + "&productID=" + $("#productID").val(),
                type: "POST",
                success: function (response) {
                    if (response.toString() === "true") {
                        window.location.assign('/SmartEx/dashboard');
                    } else {
                    }

                },
                error: function (error) {
                }
            });
        }
    });
});
