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
                        <h3 class="panel-title">Cadastrar</h3>
                    </div>
                    <div class="panel-body">
                        <ul class="nav nav-pills nav-stacked">
                            <li role="presentation"><a href="jsp/cadastraEndereco.jsp">Insere Endereço</a></li>
                        </ul>
                    </div>
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h3 class="panel-title">Exibir</h3>
                        </div>
                        <div class="panel-body">
                            <ul class="nav nav-pills nav-stacked">
                                <li role="presentation"><a href="">Exibe Cliente</a></li>
                                <li role="presentation"><a href="">Exibe Endereço</a></li>
                                <li role="presentation"><a href="">Exibe Compra</a></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-md-8">
                <h3>Página de Usuário</h3>
                <hr>
            </div>
        </div>
    </div>
    <%@include file="rodape.jsp" %>
</body>
</html>
