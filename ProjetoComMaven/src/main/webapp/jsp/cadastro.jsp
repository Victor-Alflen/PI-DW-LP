<%-- 
    Document   : cadastro
    Created on : 27/04/2017, 10:22:26
    Author     : Victor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Loja sem nome</title>
        <%@include file="imports.jsp" %>
    </head>
    <body>
        <%@include file="../cabecalho.jsp" %>
        <div id="page">
            <form action="../cadastreMe">
                <p>Cadastro de cliente </p>
                <p>Nome <input type="text" name="nome"> </p>
                <p>Email <input type="text" name="email"> </p>
                <p>Login <input type="text" name="login"> </p> 
                <p>Senha <input type="password" name="senha"> </p>
                <button type="submit"> CADASTRAR </button>
            </form>
        </div>
        <%@include file = "../copyright.jsp" %>
    <body>
</html>
