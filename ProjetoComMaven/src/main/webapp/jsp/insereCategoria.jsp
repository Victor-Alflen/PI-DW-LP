<%-- 
    Document   : insereCategoria
    Created on : 23/05/2017, 19:43:09
    Author     : Victor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="imports.jsp"%>
        <title>Loja sem nome</title>
    </head>
    <body>
        <%@include file="cabecalho.jsp" %>
        <form action="../cadastraCategoria" method="post">
            <div class="input-group">
                <span class="input-group-addon" id="basic-addon1">Nome</span>
                <input name="nome" type="text" class="form-control" placeholder="Nome da categoria" aria-describedby="basic-addon1">
            </div>
            <div class="input-group">
                <span class="input-group-addon" id="basic-addon1">Descrição</span>
                <input name="descricao" type="text" class="form-control" placeholder="Descrição" aria-describedby="basic-addon1">
            </div>
            <button type="submit" class="btn btn-default">Cadastrar</button>
        </form>
    </body>
</html>
