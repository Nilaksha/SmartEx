<%-- 
    Document   : messages
    Created on : May 4, 2015, 5:02:51 PM
    Author     : user
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
                        <li class="active">
                            <a href="messages"><i class="fa fa-fw fa-envelope"></i> Messages</a>
                        </li>
                        <li>
                            <a href="tasks"><i class="fa fa-fw fa-thumb-tack "></i> Tasks</a>
                        </li>
                        <li>
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
                                Messages
                            </h1>
                            <ol class="breadcrumb">
                                <li>
                                    <i class="fa fa-dashboard"></i>  <a href="javascript:dashboard();">Dashboard</a>
                                </li>
                                <li class="active">
                                    <i class="fa fa-envelope"></i> Messages
                                </li>
                            </ol>
                        </div>
                    </div>


                    <div class="navbar navbar-default">
                        <div class="container">
                            <div class="row">
                                <div class="col-lg-10">
                                    <div class="navbar-header">
                                        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                                            <span class="sr-only">Toggle navigation</span>
                                            <span class="icon-bar"></span>
                                            <span class="icon-bar"></span>
                                            <span class="icon-bar"></span>
                                        </button>

                                    </div>

                                    <div class="navbar-collapse collapse">
                                        <ul class="nav navbar-nav">
                                            <li id="inbox"><a href="javascript:inbox()">Inbox</a></li>
                                            <li id="sent"><a href="javascript:sent()">Sent</a></li>                                        
                                            <li id="draft"><a href="javascript:draft()">Draft</a></li>
                                        </ul>

                                    </div>
                                </div>

                                <div class="col-lg-2">                                    
                                    <button id="composeButton" type="button" class="checkbox btn btn-primary" data-toggle="modal" data-target="#messagePanel">Compose</button>
                                </div>
                            </div>
                        </div>
                    </div>

                </div>

                <!-- Modal -->
                <div class="modal fade" id="messagePanel" tabindex="-1" role="dialog" aria-labelledby="messageLabel" aria-hidden="true">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <div class="modal-header">
                                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                                <h4 class="modal-title" id="messageLabel"><i class="fa  fa-pencil fa-fw"></i> New Message</h4>									
                            </div>
                            <div class="modal-body">
                                <div class="form-group">
                                    <input id="messageSubject" class="form-control" placeholder="Subject">
                                </div>
                                <div  class="form-group">
                                    <textarea id="messageBody" class="form-control" rows="3" placeholder="Type Message"></textarea>
                                </div>
                            </div>
                            <div class="modal-footer">
                                <button id="sendButton" type="button" class="btn btn-outline btn-success">Send</button>
                                <button id="saveButton" type="button" class="btn btn-outline btn-primary">Save</button>
                                <button id="cancelButton" type="button" class="btn btn-outline btn-danger" data-dismiss="modal">Close</button>
                            </div>
                        </div>
                        <!-- /.modal-content -->
                    </div>
                    <!-- /.modal-dialog -->
                </div>
                <!-- /.modal -->

                <div id="inboxPanel" class="row">
                    <div class="col-lg-12">

                        <div class="table-responsive">
                            <table class="table table-hover">
                                <thead>
                                    <tr>          
                                        <th class="col-lg-2">From</th>
                                        <th>Message</th>
                                        <th class="col-lg-2">Received Time</th>
                                    </tr>
                                </thead>
                                <tbody>

                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>

                <div id="sentPanel" class="row">
                    <div class="col-lg-12">

                        <div class="table-responsive">
                            <table class="table table-hover">
                                <thead>
                                    <tr>        
                                        <th class="col-lg-2">To</th>
                                        <th>Message</th>
                                        <th class="col-lg-2">Sent Time</th>
                                    </tr>
                                </thead>
                                <tbody>

                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>               

                <div id="draftPanel" class="row">
                    <div class="col-lg-12">

                        <div class="table-responsive">
                            <table class="table table-hover">
                                <thead>
                                    <tr>   
                                        <th class="col-lg-2">To</th>
                                        <th>Message</th>
                                        <th class="col-lg-2">Saved Time</th>
                                    </tr>
                                </thead>
                                <tbody>

                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>                

            </div>
            <!-- /.container-fluid -->

            <!-- jQuery -->
            <script src="js/jquery.js"></script>

            <!-- Bootstrap Core JavaScript -->
            <script src="js/bootstrap.min.js"></script>

            <script src="js/messages.js"></script>

    </body>

</html>