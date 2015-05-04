/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function () {

    $("#emailCompose").hide();
});

$(document).on('click', '#composeButton', function () {
    $("#emailCompose").show();
});

function dashboard() {
    
    window.location.assign('/SmartEx/dashboard');
}

