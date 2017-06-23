<%-- 
    Document   : insereCategoria
    Created on : 23/05/2017, 19:43:09
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
            <div class="col-lg-2"></div>
            <div class="col-lg-8">
                <h3>Cadastro de Categoria</h3>            
                <form action="../cadastraCategoria" method="post">
                    <div class="form-group col-md-2">
                        <label for="ID">ID</label>
                        <input name="id" type="text" class="form-control" placeholder="id">
                    </div>

                    <div class="form-group col-md-10">
                        <label for="nome">Nome</label>
                        <input name="nome" type="text" class="form-control" placeholder="Nome da categoria">
                    </div>

                    <div class="form-group col-md-12">
                        <label for="descricao">Descrição</label>
                        <input name="nome" type="text" class="form-control" placeholder="Descrição da categoria">
                    </div>

                    <button type="submit" class="btn btn-success">Cadastrar</button>
                    <button type="reset" class="btn btn-danger">Limpar Campos</button>
                </form>
            </div>
            <div class="col-lg-2"></div>
        </div>
        <%@include file="rodape.jsp" %>
    </body>
</html>
