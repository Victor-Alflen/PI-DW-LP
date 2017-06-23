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
<html>
    <head>
        <%@include file="imports.jsp" %>
        <link href="/ProjetoComMaven/css/signin.css" rel="stylesheet">
        <title>Faça o login</title>
    </head>

    <body>
        <%@include file="cabecalho.jsp" %>
        <div class="container">
            <form id="formLogin" class="form-signin" action="../login" method="post">
                <h2 class="form-signin-heading">Por favor, faça o login</h2>
                
                <label for="inputEmail" class="sr-only">Login</label>
                <input name="login" type="text" id="inputEmail" class="form-control" placeholder="Login" required autofocus>
                
                <label for="inputPassword" class="sr-only">Senha</label>
                <input name="senha" type="password" id="inputPassword" class="form-control" placeholder="Senha" required>
                
                <div class="checkbox">
                    <label><input type="checkbox" value="remember-me"> Lembrar </label>
                </div>
                <button class="btn btn-lg btn-primary btn-block" type="submit">Login</button>
            </form>
        </div> 
    </body>
    
<!--    <script type="text/javascript">
        /**
         * Basic jQuery Validation Form Demo Code
         * Copyright Sam Deering 2012
         * Licence: http://www.jquery4u.com/license/
         */
        (function ($, W, D)
        {
            var JQUERY4U = {};
            JQUERY4U.UTIL =
                    {
                        setupFormValidation: function ()
                        {
                            //form validation rules
                            $("#formLogin").validate({
                                rules: {
                                    login: "required",
                                    senha: "required",
                                },
                                messages: {
                                    login: "Login não pode estar em branco",
                                    senha: "Cidade não pode estar em branco",
                                },
                                submitHandler: function (form) {
                                    form.submit();
                                    // alert("Dados Enviados com Sucesso :)");
                                }
                            });
                        }
                    }
            //when the dom has loaded setup form validation rules
            $(D).ready(function ($) {
                JQUERY4U.UTIL.setupFormValidation();
            });
        })(jQuery, window, document);
    </script>-->
</html>
