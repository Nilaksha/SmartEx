<%-- 
    Document   : register
    Created on : May 1, 2015, 5:47:35 PM
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

        <title>Child Monitor</title>

        <!-- Bootstrap Core CSS -->
        <link href="css/bootstrap.min.css" rel="stylesheet">

        <!-- MetisMenu CSS -->
        <link href="css/metisMenu.min.css" rel="stylesheet">

        <!-- Custom CSS -->
        <link href="css/sb-admin-2.css" rel="stylesheet">
        <link href="css/register.css" rel="stylesheet">
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

        <div class="container">
            <div class="row">
                <div class="col-md-4 col-md-offset-4">
                    <div class="login-panel  panel-default">
                        <div class="panel panel-green">
                            <div class="panel-heading">
                                <h3 class="panel-title">Please Sign Up</h3>
                            </div>
                            <form id="registerForm" class="panel-body">
                                <fieldset>
                                    <div class="form-group">
                                        <label class="control-label">User name</label>
                                        <input id="userName" name="userName" class="form-control" placeholder="Username" type="text" autofocus="true">
                                    </div>

                                    <div class="form-group">
                                        <label class="control-label">Email Address</label>
                                        <input id="email" name="email" class="form-control" placeholder="E-mail" type="email">
                                    </div>

                                    <div class="form-group">
                                        <label class="control-label">Password</label>
                                        <input id="password" name="password" class="form-control" placeholder="Password" type="password">
                                    </div>

                                    <div class="form-group">
                                        <label class="control-label">Confirm Password</label>
                                        <input id="confirmPassword" name="confirmPassword" class="form-control" placeholder="Confirm password" type="password">
                                    </div>

                                    <div class="form-group">
                                        <label class="control-label">Product ID</label>
                                        <input id="productID" name="productID" class="form-control" placeholder="SmartDesk ID" type="password">
                                    </div>
                                    <button id="save" class="btn btn-lg btn-success btn-block">Save</button>  
                                </fieldset>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <!-- jQuery -->
        <script src="js/jquery.js"></script>
        <script src="js/jquery.validate.js"></script>

        <!-- Bootstrap Core JavaScript -->
        <script src="js/bootstrap.min.js"></script>

        <!-- Metis Menu Plugin JavaScript -->
        <script src="js/metisMenu.min.js"></script>

        <!-- Custom Theme JavaScript -->
        <script src="js/register.js"></script>

    </body>

</html>