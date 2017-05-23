<%-- 
    Document   : novoindex
    Created on : 21/05/2017, 18:00:07
    Author     : Victor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <script src="js/jquery.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <title>Loja sem nome</title>
    </head>
    <body>
        <%@include file="jsp/cabecalho.jsp" %>
        <ul class="nav nav-pills nav-stacked">
            <li role="presentation" class="active"><a href="#">Inicio</a></li>
            <li role="presentation"><a href="jsp/insereCategoria.jsp">Insere Categorias</a></li>
            <li role="presentation"><a href="exibeCategoria">Exibe Categorias</a></li>
        </ul>
    </body>
</html>
