<%-- 
    Document   : index
    Created on : 31/03/2017, 10:44:48
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
        <div id="header" class="container">
            <%@include file="cabecalho.jsp" %>
            <div id="bloco2">
                <div id="btLogin">
                    <a class="login" href="/login.html">Login</a>
                    <a class="login" href="/cadastro.html">Cadastre-se</a>
                </div>
                <div id="pesquisar">
                    <form action="processar.html" method="get">
                        <input type="text" size="40" placeholder="Digite o que deseja pesquisar">
                        <input type="submit" value="BUSCAR">
                    </form>
                </div>
            </div>
        </div>
        <div id="page">
            <p><a href="#"> Algo aqui </a></p>
            <p> Algo aqui </p>
            <p> Algo aqui </p>
            <p> Algo aqui </p>
            <p> Algo aqui </p>
            <p> Algo aqui </p>
            <p> Algo aqui </p>
            <p> Algo aqui </p>
            <p> Algo aqui </p>
            <p> Algo aqui </p>
            <p> Algo aqui </p>
            <p> Algo aqui </p>
            <p> Algo aqui </p>
            <p> Algo aqui </p>
            <p> Algo aqui </p>
            <p> Algo aqui </p>
            <p> Algo aqui </p>
            <p> Algo aqui </p>
        </div>
        <div id="copyright" class="container">
            <p>&copy; Todos os direitos reservados.</p>
        </div>
    </body>
</html>
