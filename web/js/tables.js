/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function () {

    updateTableAppUsage();
});

function updateTableAppUsage() {

    $.ajax({
        url: "/SmartEx/tables/updateTableAppUsage",
        type: "POST",
        success: function (response) {
            var length = response.length;
            var content = [];

            content[0] = '<table class="table table-striped table-bordered table-hover" id="dataTables-example">' +
                    '                                <thead>' +
                    '                                   <tr>' +
                    '                                       <th>Application</th>' +
                    '                                       <th>Date</th>' +
                    '                                       <th>Time</th>' +
                    '                                       <th>Duration</th>' +
                    '                                   </tr>' +
                    '                                </thead>' +
                    '                                <tbody>';

            var count = 1;

            for (var i = 0; i < length; i++) {
                content[count] = '<tr>' +
                        '                   <td>' + response[i].application + '</td>' +
                        '                   <td>' + response[i].date + '</td>' +
                        '                   <td class="center">' + response[i].time + '</td>' +
                        '                   <td class="center">' + response[i].duration + ' mins</td>' +
                        '</tr>'
                count++;
            }

            content[count] = '    </tbody>' +
                    ' </table>';


            $("#tableHolder").html(content.join(""));
            $("#tableHolder").show();
            $('#dataTables-example').DataTable({
            responsive: true
    });
        },
        error: function (e) {
        }
    });
}
