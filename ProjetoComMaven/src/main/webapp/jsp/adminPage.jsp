<%-- 
    Document   : adminPage
    Created on : 02/06/2017, 09:38:34
    Author     : Victor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="imports.jsp" %>
        <title>Loja sem nome</title>
    </head>
    <body>
        <%@include file="cabecalho.jsp" %>
        <div class="row">
            <div class="col-md-2">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title">Inserir</h3>
                    </div>
                    <div class="panel-body">
                        <ul class="nav nav-pills nav-stacked">
                            <li role="presentation"><a href="jsp/insereCategoria.jsp">Insere Categorias</a></li>
                            <li role="presentation"><a href="jsp/insereCliente.jsp">Insere Cliente</a></li>
                            <li role="presentation"><a href="jsp/insereProduto.jsp">Insere Produtos</a></li>
                        </ul>
                    </div>
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h3 class="panel-title">Exibir</h3>
                        </div>
                        <div class="panel-body">
                            <ul class="nav nav-pills nav-stacked">
                                <li role="presentation"><a href="exibeCategoria">Exibe Categorias</a></li>
                                <li role="presentation"><a href="exibeCliente">Exibe Cliente</a></li>
                                <li role="presentation"><a href="exibeProduto">Exibe Produto</a></li>
                            </ul>
                        </div>
                    </div>
                </div>
                <div class="col-md-8">
                </div>
            </div>
        </div>
    </body>
</html>
