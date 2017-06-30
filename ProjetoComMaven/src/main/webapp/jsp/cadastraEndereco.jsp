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
                <h3>Cadastro de Endereço</h3>
                <form action="../cadastraCliente" method="post">
                    <div class="form-group col-md-6">
                        <label for="estado">Estado</label>
                        <input name="estado" type="text" id="estado" class="form-control" placeholder="Nome">
                    </div>

                    <div class="form-group col-md-6">
                        <label for="cidade">Cidade</label>
                        <input name="cidade" type="text" id="cidade" class="form-control" placeholder="CPF">
                    </div>

                    <div class="form-group col-md-8">
                        <label for="rua">Rua</label>
                        <input name="rua" type="text" id="rua" class="form-control" placeholder="Login">
                    </div>

                    <div class="form-group col-md-4">
                        <label for="numero">Numero</label>
                        <input name="numero" type="text" class="form-control" placeholder="Senha">
                    </div>

                    <div class="form-group col-md-12">
                        <label for="complemento">Complemento</label>
                        <input name="complemento" type="text" id="complemento" class="form-control" placeholder="Email">
                    </div>
                    
                    <div class="form-group col-md-12">
                        <label for="informacao">Informação Auxiliar</label>
                        <input name="informacao" type="text" id="informacao" class="form-control" placeholder="Data de Nascimento">
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