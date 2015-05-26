<%-- 
    Document   : dashboard
    Created on : Apr 14, 2015, 9:57:44 AM
    Author     : Nilaksha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Smart Friend</title>

        <link rel="icon" type="image/png" href="css/favicon-32x32.png" sizes="32x32" />
        <!-- Bootstrap Core CSS -->
        <link href="css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom CSS -->
        <link href="css/sb-admin.css" rel="stylesheet">

        <!-- Morris Charts CSS -->
        <link href="css/plugins/morris.css" rel="stylesheet">

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
                        <li class="active">
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
                                Dashboard <small>Statistics Overview</small>
                            </h1>
                            <ol class="breadcrumb">
                                <li class="active">
                                    <i class="fa fa-dashboard"></i> Dashboard
                                </li>
                            </ol>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-lg-3 col-md-6">
                            <div class="panel panel-primary">
                                <div class="panel-heading">
                                    <div class="row">
                                        <div class="col-xs-3">
                                            <i class="fa fa-comments fa-5x"></i>
                                        </div>
                                        <div class="col-xs-9 text-right">
                                            <div id="newMessageCount" class="huge"></div>
                                            <div>Recent Messages</div>
                                        </div>
                                    </div>
                                </div>
                                <a href="messages">
                                    <div class="panel-footer">
                                        <span class="pull-left">View Messages</span>
                                        <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                                        <div class="clearfix"></div>
                                    </div>
                                </a>
                            </div>
                        </div>
                        <div class="col-lg-3 col-md-6">
                            <div class="panel panel-green">
                                <div class="panel-heading">
                                    <div class="row">
                                        <div class="col-xs-3">
                                            <i class="fa fa fa-tasks fa-5x"></i>
                                        </div>
                                        <div class="col-xs-9 text-right">
                                            <div id="recentTaskCount" class="huge"></div>
                                            <div>Recent Tasks</div>
                                        </div>
                                    </div>
                                </div>
                                <a href="tasks">
                                    <div class="panel-footer">
                                        <span class="pull-left">View Tasks</span>
                                        <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                                        <div class="clearfix"></div>
                                    </div>
                                </a>
                            </div>
                        </div>
                        <div class="col-lg-3 col-md-6">
                            <div class="panel panel-yellow">
                                <div class="panel-heading">
                                    <div class="row">
                                        <div class="col-xs-3">
                                            <i class="fa fa-puzzle-piece fa-5x"></i>
                                        </div>
                                        <div class="col-xs-9 text-right">
                                            <div id="recentActivityCount" class="huge"></div>
                                            <div>Recent Activities</div>
                                        </div>
                                    </div>
                                </div>
                                <a href="tables">
                                    <div class="panel-footer">
                                        <span class="pull-left">View Activities</span>
                                        <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                                        <div class="clearfix"></div>
                                    </div>
                                </a>
                            </div>
                        </div>
                        <div class="col-lg-3 col-md-6">
                            <div class="panel panel-red">
                                <div class="panel-heading">
                                    <div class="row">
                                        <div class="col-xs-3">
                                            <i class="fa fa-child fa-5x"></i>
                                        </div>
                                        <div class="col-xs-9 text-right">
                                            <div id="newMoodUpdatesCount1" class="huge"></div>
                                            <div>Mood Updates</div>
                                        </div>
                                    </div>
                                </div>
                                <a href="moods">
                                    <div class="panel-footer">
                                        <span class="pull-left">View Mood Updates</span>
                                        <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                                        <div class="clearfix"></div>
                                    </div>
                                </a>
                            </div>
                        </div>
                    </div>
                    <!-- /.row -->

                    <div class="row">
                        <div class="col-lg-8">
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    <h3 class="panel-title"><i class="fa fa-bar-chart-o fa-fw"></i> Usage Chart</h3>
                                </div>
                                <div class="panel-body">
                                    <div id="morris-area-chart"></div>
                                    <div class="text-right">
                                        <a href="charts">View Details <i class="fa fa-arrow-circle-right"></i></a>
                                    </div>
                                </div>
                            </div>

                            <div class="row">
                                <div class="col-lg-12">
                                    <div class="panel panel-default">
                                        <div class="panel-heading">
                                            <h3 class="panel-title"><i class="fa fa-long-arrow-right fa-fw"></i> Mood Chart</h3>
                                        </div>
                                        <div class="panel-body">
                                            <div id="morris-donut-chart"></div>
                                            <div class="text-right">
                                                <a href="moods">View Details <i class="fa fa-arrow-circle-right"></i></a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <div class="col-lg-4">
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    <h3 class="panel-title"><i class="fa fa-bell fa-fw"></i> Notification Panel</h3>
                                </div>
                                <div class="panel-body">
                                    <div class="list-group">
                                        <a href="#" class="list-group-item">
                                            <span id="lastAddedTaskTime" class="badge"></span>
                                            <i id="lastAddedTaskCount" class="fa fa-fw fa-tasks"></i> 
                                        </a>
                                        <a href="#" class="list-group-item">
                                            <span id="lastRepliedTime" class="badge"></span>
                                            <i class="fa fa-fw fa-comment"></i> Last replied message
                                        </a>
                                        <a href="#" class="list-group-item">
                                            <span id="newMoodUpdatesCount2" class="badge"></span>
                                            <i  class="fa fa-fw fa-child"></i> New mood updates
                                        </a>
                                        <a href="#" class="list-group-item">
                                            <span class="badge"></span>
                                            <i  class="fa fa-fw fa-download"></i> New applications
                                        </a>
                                        <a href="#" class="list-group-item">
                                            <span class="badge"></span>
                                            <i  class="fa fa-fw fa-spinner"></i> Suggestions
                                        </a>
                                    </div>
                                    <div class="text-right">
                                        <a href="#">View All Alerts <i class="fa fa-arrow-circle-right"></i></a>
                                    </div>
                                </div>
                            </div>
                            <!-- /.panel -->
                            <div class="chat-panel panel panel-default">
                                <div class="panel-heading">
                                    <i class="fa fa-comments fa-fw"></i>
                                    Chat
                                    <div class="btn-group pull-right">
                                        <button type="button" class="btn btn-default btn-xs dropdown-toggle" data-toggle="dropdown">
                                            <i class="fa fa-chevron-down"></i>
                                        </button>
                                        <ul class="dropdown-menu slidedown">
                                            <li>
                                                <a href="#">
                                                    <i class="fa fa-refresh fa-fw"></i> Refresh
                                                </a>
                                            </li>
                                            <li>
                                                <a href="#">
                                                    <i class="fa fa-check-circle fa-fw"></i> Available
                                                </a>
                                            </li>
                                            <li>
                                                <a href="#">
                                                    <i class="fa fa-times fa-fw"></i> Busy
                                                </a>
                                            </li>
                                            <li>
                                                <a href="#">
                                                    <i class="fa fa-clock-o fa-fw"></i> Away
                                                </a>
                                            </li>
                                            <li class="divider"></li>
                                            <li>
                                                <a href="#">
                                                    <i class="fa fa-sign-out fa-fw"></i> Sign Out
                                                </a>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                                <!-- /.panel-heading -->
                                <div class="panel-body">
                                    <ul class="chat">
                                        <li class="left clearfix">
                                            <span class="chat-img pull-left">
                                                <img src="http://placehold.it/50/55C1E7/fff" alt="User Avatar" class="img-circle" />
                                            </span>
                                            <div class="chat-body clearfix">
                                                <div class="header">
                                                    <strong class="primary-font">Jack Sparrow</strong>
                                                    <small class="pull-right text-muted">
                                                        <i class="fa fa-clock-o fa-fw"></i> 12 mins ago
                                                    </small>
                                                </div>
                                                <p>
                                                    Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur bibendum ornare dolor, quis ullamcorper ligula sodales.
                                                </p>
                                            </div>
                                        </li>
                                        <li class="right clearfix">
                                            <span class="chat-img pull-right">
                                                <img src="http://placehold.it/50/FA6F57/fff" alt="User Avatar" class="img-circle" />
                                            </span>
                                            <div class="chat-body clearfix">
                                                <div class="header">
                                                    <small class=" text-muted">
                                                        <i class="fa fa-clock-o fa-fw"></i> 13 mins ago</small>
                                                    <strong class="pull-right primary-font">Bhaumik Patel</strong>
                                                </div>
                                                <p>
                                                    Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur bibendum ornare dolor, quis ullamcorper ligula sodales.
                                                </p>
                                            </div>
                                        </li>
                                        <li class="left clearfix">
                                            <span class="chat-img pull-left">
                                                <img src="http://placehold.it/50/55C1E7/fff" alt="User Avatar" class="img-circle" />
                                            </span>
                                            <div class="chat-body clearfix">
                                                <div class="header">
                                                    <strong class="primary-font">Jack Sparrow</strong>
                                                    <small class="pull-right text-muted">
                                                        <i class="fa fa-clock-o fa-fw"></i> 14 mins ago</small>
                                                </div>
                                                <p>
                                                    Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur bibendum ornare dolor, quis ullamcorper ligula sodales.
                                                </p>
                                            </div>
                                        </li>
                                        <li class="right clearfix">
                                            <span class="chat-img pull-right">
                                                <img src="http://placehold.it/50/FA6F57/fff" alt="User Avatar" class="img-circle" />
                                            </span>
                                            <div class="chat-body clearfix">
                                                <div class="header">
                                                    <small class=" text-muted">
                                                        <i class="fa fa-clock-o fa-fw"></i> 15 mins ago</small>
                                                    <strong class="pull-right primary-font">Bhaumik Patel</strong>
                                                </div>
                                                <p>
                                                    Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur bibendum ornare dolor, quis ullamcorper ligula sodales.
                                                </p>
                                            </div>
                                        </li>
                                    </ul>
                                </div>
                                <!-- /.panel-body -->
                                <div class="panel-footer">
                                    <div class="input-group">
                                        <input id="btn-input" type="text" class="form-control input-sm" placeholder="Type your message here..." />
                                        <span class="input-group-btn">
                                            <button class="btn btn-warning btn-sm" id="btn-chat">
                                                Send
                                            </button>
                                        </span>
                                    </div>
                                </div>
                                <!-- /.panel-footer -->
                            </div>
                            <!-- /.panel .chat-panel -->
                        </div>
                    </div>
                    <!-- /.row -->



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

        <!-- dashboard -->
        <script src="js/dashboard.js"></script>

        <!-- Morris Charts JavaScript -->
        <script src="js/plugins/morris/raphael.min.js"></script>
        <script src="js/plugins/morris/morris.min.js"></script>
        <script src="js/plugins/morris/morris-data.js"></script>

    </body>

</html>
