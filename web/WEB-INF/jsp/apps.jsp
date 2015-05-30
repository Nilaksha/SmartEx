<%-- 
    Document   : apps
    Created on : May 30, 2015, 10:13:09 AM
    Author     : Nilaksha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Child Monitor</title>

        <!-- Bootstrap Core CSS -->
        <link href="css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom CSS -->
        <link href="css/metisMenu.min.css" rel="stylesheet">
        <link href="css/sb-admin.css" rel="stylesheet">

        <!-- Custom Fonts -->
        <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->

    </head>

    <body>

        <div id="wrapper">

            <!-- Navigation -->
            <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
                <!-- Brand and toggle get grouped for better mobile display -->
                <jsp:include page="header.jsp" />
                <!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->
                <div class="collapse navbar-collapse navbar-ex1-collapse">
                    <ul class="nav navbar-nav side-nav">
                        <li>
                            <a href="dashboard"><i class="fa fa-fw fa-dashboard"></i> Dashboard</a>
                        </li>
                        <li>
                            <a href="charts"><i class="fa fa-fw fa-bar-chart-o"></i> Charts</a>
                        </li>
                        <li>
                            <a href="tables"><i class="fa fa-fw fa-table"></i> Tables</a>
                        </li>
                        <li>
                            <a href="moods"><i class="fa fa-fw fa-child"></i> Moods</a>
                        </li>
                        <li>
                            <a href="messages"><i class="fa fa-fw fa-envelope"></i> Messages</a>
                        </li>
                        <li>
                            <a href="tasks"><i class="fa fa-fw fa-thumb-tack "></i> Tasks</a>
                        </li>
                        <li class="active">
                            <a href="apps"><i class="fa fa-fw fa-th "></i> Apps</a>
                        </li>
                    </ul>
                </div>
                <!-- /.navbar-collapse -->
            </nav>

            <div id="page-wrapper">

                <div class="container-fluid">

                    <!-- Page Heading -->
                    <div class="row">
                        <div class="col-lg-12">
                            <h1 class="page-header">
                                Apps
                                <small></small>
                            </h1>
                            <ol class="breadcrumb">
                                <li>
                                    <i class="fa fa-dashboard"></i>  <a href="index.html">Dashboard</a>
                                </li>
                                <li class="active">
                                    <i class="fa fa-th"></i> Apps
                                </li>
                            </ol>
                        </div>
                    </div>
                    <!-- /.row -->

                    <!-- /.row -->
                    <div id="applicationPanel" class="row">
                        <div class="col-lg-12">
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    Manage Applications
                                </div>
                                <!-- /.panel-heading -->
                                <div class="panel-body">
                                    <div class="table-responsive">
                                        <table class="table table-striped">
                                            <thead>
                                                <tr>
                                                    <th class="col-lg-1">#</th>
                                                    <th class="col-lg-5">Application</th>
                                                    <th class="col-lg-5">Type</th>
                                                    <th class="col-lg-1" align="center">Active</th>
                                                </tr>
                                            </thead>
                                            <tbody>

                                            </tbody>
                                        </table>
                                    </div>
                                    <!-- /.table-responsive -->
                                </div>
                                <!-- /.panel-body -->
                            </div>
                            <!-- /.panel -->
                        </div>
                    </div>
                    <div id="buttonPanel" class="row">
                        <div class="col-lg-12">
                            <div class="col-lg-10">
                            </div>
                            <div class="col-lg-1">
                                <button id="popButton" class="btn btn-primary" style="display: none;" data-toggle="modal" data-target="#myModal"></button>
                            </div>                                
                            <div class="col-lg-1">     
                                <button id="saveButton" align="right" type="button" class="btn btn-success">Save</button>
                            </div>
                        </div>
                    </div>  

                    <!-- Modal -->
                    <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                        <div class="modal-dialog">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                                    <h4 class="modal-title" id="myModalLabel">Success</h4>
                                </div>
                                <div class="modal-body">
                                    Successfully saved.
                                </div>
                                <div class="modal-footer">
                                    <button type="button" class="btn btn-outline btn-success" data-dismiss="modal">Close</button>
                                </div>
                            </div>
                            <!-- /.modal-content -->
                        </div>
                        <!-- /.modal-dialog -->
                    </div>
                    <!-- /.modal -->


                </div>
                <!-- /.container-fluid -->

            </div>
            <!-- /#page-wrapper -->

        </div>
        <!-- /#wrapper -->

        <!-- jQuery -->
        <script src="js/jquery.js"></script>

        <!-- Bootstrap Core JavaScript -->
        <script src="js/bootstrap.min.js"></script>

        <script src="js/apps.js"></script>

    </body>
</html>
