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
            <div class="col-lg-2"></div>
            <div class="col-lg-8">
                <h3>Cadastro de Compra</h3>
                <form action="../cadastraCliente" method="post">
                    <div class="form-group col-md-6">
                        <label for="nome">Data de Compra</label>
                        <input name="Compra" type="text" id="nome" class="form-control" placeholder="Data de Compra">
                    </div>

                    <div class="form-group col-md-6">
                        <label for="idCliente">Id do Cliente</label>
                        <input name="idCliente" type="text" id="idCliente" class="form-control" placeholder="Id do Cliente">
                    </div>

                    <div class="form-group col-md-6">
                        <label for="idTipo">Id do Tipo</label>
                        <input name="idTipo" type="text" id="idTipo" class="form-control" placeholder="Id do Tipo">
                    </div>

                    <button type="submit" class="btn btn-success">Cadastrar</button>
                    <button type="reset" class="btn btn-danger">Limpar Campos</button>
                </form>
            </div>
            <div class="col-lg-2"></div>
        </div>
    </body>

    <script type="text/javascript">
        $(document).ready(function () {
            $('#CPF').mask('999.999.999-99');    
            $('#dataNasc').mask('00/00/0000');
            //$('#login').mask('A#');
        });
    </script>
</html>