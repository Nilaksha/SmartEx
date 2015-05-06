/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function () {

    $("#emailCompose").hide();
    $("#inbox").show();
    $("#sent").hide();
    $("#draft").hide();
    $("#trash").hide();
    
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
    
    $("#inbox").show();
    $("#sent").hide();
    $("#draft").hide();
    $("#trash").hide();
}

function sent() {
    
    $("#sent").show();
    $("#inbox").hide();
    $("#draft").hide();
    $("#trash").hide();
}

function draft() {
    
    $("#draft").show();
    $("#sent").hide();
    $("#inbox").hide();
    $("#trash").hide();
}

function inbox() {
    
    $("#trash").show();
    $("#sent").hide();
    $("#draft").hide();
    $("#inbox").hide();
}

