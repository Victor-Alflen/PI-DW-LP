<%-- 
    Document   : login
    Created on : 31/05/2017, 21:55:00
    Author     : Victor
--%>
<%--
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <!-- <link rel="icon" href="../../favicon.ico">-->
    <!-- Custom styles for this template -->
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <%@include file="importsToJSP.jsp" %>

    <link href="../css/signin.css" rel="stylesheet">
    <title>Signin Template for Bootstrap</title>
  </head>

  <body>
    <div class="container">
        <form class="form-signin" action="login" method="post">
        <h2 class="form-signin-heading">Please sign in</h2>
        <label for="inputEmail" class="sr-only">Email address</label>
        <input type="email" id="inputEmail" class="form-control" placeholder="Email address" required autofocus>
        <label for="inputPassword" class="sr-only">Password</label>
        <input type="password" id="inputPassword" class="form-control" placeholder="Password" required>
        <div class="checkbox">
          <label>
            <input type="checkbox" value="remember-me"> Remember me
          </label>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
      </form>
    </div> 
  </body>
</html>
