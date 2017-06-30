<%-- 
    Document   : cadastraCliente
    Created on : 09/06/2017, 09:32:42
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
            <%@include file="barraLateral.jsp" %>
            <div class="col-lg-8">
                <h3>Cadastro de Subcategoria</h3>
                <form action="../cadastraCliente" method="post">
                    <div class="form-group col-md-6">
                        <label for="nome">Nome</label>
                        <input name="nome" type="text" id="nome" class="form-control" placeholder="Nome">
                    </div>

                    <div class="form-group col-md-6">
                        <label for="Categoria">Categoria</label>
                        <input name="Categoria" type="text" id="Categoria" class="form-control" placeholder="CPF">
                    </div>

                    <button type="submit" class="btn btn-success">Cadastrar</button>
                    <button type="reset" class="btn btn-danger">Limpar Campos</button>
                </form>
            </div>
            <div class="col-lg-2"></div>
        </div>
        <%@include file="rodape.jsp" %>
    </body>

    <script type="text/javascript">
        $(document).ready(function () {

        });
    </script>
</html>