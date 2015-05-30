/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var apps;

$(document).ready(function () {

    getApps();
});

$(document).on('click', '#saveButton', function () {
    updateApps();
});

function getApps() {

    $.ajax({
        url: "/SmartEx/apps/getApps",
        type: "POST",
        success: function (response) {
            apps = response;
            for (var i = 0; i < apps.length; i++) {
                var app = '<tr>' +
                        '<td id="appID_' + i + '">' + apps[i]['appID'] + '</td>' +
                        '<td>' + apps[i]['name'] + '</td>' +
                        '<td>' + apps[i]['type'] + '</td>' +
                        '<td align="center">' + '<input id="check_' + i + '" type="checkbox">' + '</td>' +
                        '</tr>';

                $("#applicationPanel tbody").append(app);

                if (apps[i]['status'] === "true") {
                    document.getElementById("check_" + i).checked = true;
                }
            }
        },
        error: function (e) {
        }
    });
}


function updateApps() {

    var upApps = [];

    for (var i = 0; i < apps.length; i++) {

        upApps[i] = {appID: $("#appID_" + i).text(), status: $("#check_" + i).is(":checked").toString()};
    }

    $.ajax({
        url: "/SmartEx/apps/updateApps",
        contentType: 'application/json',
        data: JSON.stringify(upApps),
        dataType: 'json',
        type: "POST",
        success: function (response) {
            $( "#popButton" ).click();
        },
        error: function (e) {
        }
    });

}