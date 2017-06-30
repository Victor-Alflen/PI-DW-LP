<%-- 
    Document   : novoindex
    Created on : 21/05/2017, 18:00:07
    Author     : Victor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="jsp/imports.jsp" %>
        <title>Loja sem nome</title>
    </head>
    <body>
        <%@include file="jsp/cabecalho.jsp" %>
        <div class="row">
            <div class="col-md-2">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title">Categorias</h3>
                    </div>
                    <div class="panel-body">
                        <ul class="nav nav-pills nav-stacked">
                            <li role="presentation"><a href="#">Categoria 1</a></li>
                            <li role="presentation"><a href="#">Categoria 2</a></li>
                            <li role="presentation"><a href="#">Categoria 3</a></li>
                            <li role="presentation"><a href="#">Categoria 4</a></li>
                            <li role="presentation"><a href="#">Categoria 5</a></li>
                    </div>
                </div>
            </div>
            <div class="col-md-9">
                <h3>Bem vindo a página!</h3>
                <hr>
                <div class="row">
                    <div class="col-md-3">
                        <div class="thumbnail">
                            <img src="..." alt="...">
                            <div class="caption">
                                <h3>Thumbnail label</h3>
                                <p>Alguma coisa aqui!</p>
                                <p><a href="#" class="btn btn-primary" role="button">Button</a> <a href="#" class="btn btn-default" role="button">Button</a></p>
                            </div>
                        </div>
                    </div>

                    <div class="col-md-3">
                        <div class="thumbnail">
                            <img src="..." alt="...">
                            <div class="caption">
                                <h3>Thumbnail label</h3>
                                <p>Alguma coisa aqui!</p>
                                <p><a href="#" class="btn btn-primary" role="button">Button</a> <a href="#" class="btn btn-default" role="button">Button</a></p>
                            </div>
                        </div>
                    </div>

                    <div class="col-md-3">
                        <div class="thumbnail">
                            <img src="..." alt="...">
                            <div class="caption">
                                <h3>Thumbnail label</h3>
                                <p>Alguma coisa aqui!</p>
                                <p><a href="#" class="btn btn-primary" role="button">Button</a> <a href="#" class="btn btn-default" role="button">Button</a></p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <%@include file="jsp/rodape.jsp" %>
    </body>
</html>
