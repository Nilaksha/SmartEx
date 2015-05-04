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
    userName();

});

function newMessageCount() {

    $.ajax({
        url: "/SmartEx/messages/newMessageCount",
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
        type: "POST",
        success: function (response) {
            $("#newMoodUpdatesCount1").text(response);
            $("#newMoodUpdatesCount2").text(response);
        },
        error: function (e) {
        }
    });
}

function lastAddedTaskCount() {

    $.ajax({
        url: "/SmartEx/tasks/lastAddedTaskCount",
        type: "POST",
        success: function (response) {
            $("#lastAddedTaskCount").after(response);
        },
        error: function (e) {
        }
    });
}

function lastAddedTaskTime() {

    $.ajax({
        url: "/SmartEx/tasks/lastAddedTaskTime",
        type: "POST",
        success: function (response) {
            var data = response.toString() + " days ago";
            $("#lastAddedTaskTime").text(data);
        },
        error: function (e) {
        }
    });
}

function lastRepliedTime() {

    $.ajax({
        url: "/SmartEx/messages/lastRepliedTime",
        type: "POST",
        success: function (response) {
            var data = response + " days ago";
            $("#lastRepliedTime").text(data);
        },
        error: function (e) {
        }
    });
}

function userName() {

    $.ajax({
        url: "/SmartEx/dashboard/userName",
        type: "POST",
        success: function (response) {
            $("#userName").after(response);
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