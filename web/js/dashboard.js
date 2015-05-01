/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function () {

    $("#productID").hide();
    newMessageCount();
    recentTaskCount();
    recentActivityCount();
    newMoodUpdatesCount();
    lastAddedTaskCount();
    lastAddedTaskTime();
    lastRepliedTime();
    testJson();
});

$(document).on('click', '#searchBtn', function () {
    search();
});

function testJson() {

    $.ajax({
        url: "/SmartEx/moods/testJson",
        type: "POST",
        success: function (response) {
            //$("#newMessageCount").text(response);
            var student = response;
            var id = student.productID;
            var date = student.date;
        },
        error: function (e) {
        }
    });
}

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

function recentTaskCount() {

    $.ajax({
        url: "/SmartEx/tasks/recentTaskCount",
        data: "productID=" + $("#productID").text(),
        type: "POST",
        success: function (response) {
            $("#recentTaskCount").text(response);
        },
        error: function (e) {
        }
    });
}

function recentActivityCount() {

    $.ajax({
        url: "/SmartEx/charts/recentActivityCount",
        data: "productID=" + $("#productID").text(),
        type: "POST",
        success: function (response) {
            $("#recentActivityCount").text(response);
        },
        error: function (e) {
        }
    });
}

function newMoodUpdatesCount() {

    $.ajax({
        url: "/SmartEx/moods/newMoodUpdatesCount",
        data: "productID=" + $("#productID").text(),
        type: "POST",
        success: function (response) {
            $("#newMoodUpdatesCount").text(response);
        },
        error: function (e) {
        }
    });
}

function lastAddedTaskCount() {

    $.ajax({
        url: "/SmartEx/tasks/lastAddedTaskCount",
        data: "productID=" + $("#productID").text(),
        type: "POST",
        success: function (response) {
            $("#lastAddedTaskCount").text(response);
        },
        error: function (e) {
        }
    });
}

function lastAddedTaskTime() {

    $.ajax({
        url: "/SmartEx/tasks/lastAddedTaskTime",
        data: "productID=" + $("#productID").text(),
        type: "POST",
        success: function (response) {
            $("#lastAddedTaskTime").text(response);
        },
        error: function (e) {
        }
    });
}

function lastRepliedTime() {

    $.ajax({
        url: "/SmartEx/messages/lastRepliedTime",
        data: "productID=" + $("#productID").text(),
        type: "POST",
        success: function (response) {
            $("#lastRepliedTime").text(response);
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