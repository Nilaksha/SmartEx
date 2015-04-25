<%-- 
    Document   : profile
    Created on : Apr 1, 2015, 12:14:37 AM
    Author     : user
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

        <title>Smart Friend - Child Monitor</title>

        <!-- Bootstrap Core CSS -->
        <link href="css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom CSS -->
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
                            <a href="/WEB-INF/jsp/dashboard.jsp"><i class="fa fa-fw fa-dashboard"></i> Dashboard</a>
                        </li>
                        <li>
                            <a href="charts.jsp"><i class="fa fa-fw fa-bar-chart-o"></i> Charts</a>
                        </li>
                        <li>
                            <a href="tables.jsp"><i class="fa fa-fw fa-table"></i> Tables</a>
                        </li>
                        <li>
                            <a href="moods.jsp"><i class="fa fa-fw fa-child"></i> Moods</a>
                        </li>
                        <li>
                            <a href="inbox.jsp"><i class="fa fa-fw fa-envelope"></i> Messages</a>
                        </li>
                        <li>
                            <a href="tasks.jsp"><i class="fa fa-fw fa-thumb-tack "></i> Tasks</a>
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
                                Profile
                                <small></small>
                            </h1>
                            <ol class="breadcrumb">
                                <li>
                                    <i class="fa fa-dashboard"></i>  <a href="index.html">Dashboard</a>
                                </li>
                                <li class="active">
                                    <i class="fa fa-file"></i> Profile
                                </li>
                            </ol>
                        </div>
                    </div>
                    <!-- /.row -->

                    <div class="row">
                        <div class="col-lg-6">

                            <form role="form">

                                <div class="form-group">
                                    <h1>Parent Details</h1>
                                </div>

                                <div class="panel panel-primary">
                                    <div class="panel-heading">
                                        <h3 class="panel-title">Mother Details</h3>
                                    </div>
                                    <div class="panel-body">

                                        <div class="form-group">
                                            <label>Title</label>
                                            <input class="form-control" placeholder="How you would like to be called by your child. Eg: Amma/Mother/Mom">
                                        </div>

                                        <div class="form-group">
                                            <label>Full Name</label>
                                            <input class="form-control" placeholder="Enter full name">
                                        </div>

                                        <div class="form-group">
                                            <label>Email Address</label>
                                            <input class="form-control" placeholder="abc@example.com">
                                        </div>

                                        <div class="form-group">
                                            <label>Contact No</label>
                                            <input class="form-control" placeholder="Enter 10 digits no">
                                        </div>

                                        <div class="form-group">
                                            <label>Profile Picture</label>
                                            <input type="file">
                                        </div>     
                                    </div>
                                </div>

                                <div class="panel panel-green">
                                    <div class="panel-heading">
                                        <h3 class="panel-title">Father Details</h3>
                                    </div>
                                    <div class="panel-body">

                                        <div class="form-group">
                                            <label>Title</label>
                                            <input class="form-control" placeholder="How you would like to be called by your child. Eg: Thaththa/Fathther/Dad">
                                        </div>

                                        <div class="form-group">
                                            <label>Full Name</label>
                                            <input class="form-control" placeholder="Enter full name">
                                        </div>

                                        <div class="form-group">
                                            <label>Email Address</label>
                                            <input class="form-control" placeholder="abc@example.com">
                                        </div>

                                        <div class="form-group">
                                            <label>Contact No</label>
                                            <input class="form-control" placeholder="Enter 10 digits no">
                                        </div>

                                        <div class="form-group">
                                            <label>Profile Picture</label>
                                            <input type="file">
                                        </div>     
                                    </div>
                                </div>
                                <button type="submit" class="btn btn-lg btn-success">Save</button>
                                <button type="reset" class="btn btn-lg btn-success">Reset</button>
                            </form>
                        </div>

                        <div class="col-lg-6">

                            <form role="form">
                                <div class="form-group">
                                    <h1>Child Details</h1>
                                </div>                     

                                <div class="panel panel-yellow">
                                    <div class="panel-heading">
                                        <h3 class="panel-title">Child Details</h3>
                                    </div>
                                    <div class="panel-body">
                                        <div class="form-group">
                                            <label>Full Name</label>
                                            <input class="form-control" placeholder="Enter full name">
                                        </div>

                                        <div class="form-group">
                                            <label>Short name</label>
                                            <input class="form-control" placeholder="Enter short name">
                                        </div> 

                                        <div class="form-group">
                                            <label>Gender</label>
                                            <div class="radio">
                                                <label>
                                                    <input type="radio" name="optionsRadios" id="optionsRadios1" value="option1" checked>Male
                                                </label>
                                            </div>
                                            <div class="radio">
                                                <label>
                                                    <input type="radio" name="optionsRadios" id="optionsRadios2" value="option2">Female
                                                </label>
                                            </div>
                                        </div> 

                                        <div class="form-group">
                                            <label>Date of Birth</label>
                                            <input class="form-control" placeholder="Day/Month/Year">
                                        </div>

                                        <div class="form-group">
                                            <label>Profile Picture</label>
                                            <input type="file">
                                        </div>     
                                    </div>
                                </div>

                            </form>                       
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

    </body>

</html>
