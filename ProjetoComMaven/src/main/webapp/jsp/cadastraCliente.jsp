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
                <h3>Cadastro de Cliente</h3>
                <form action="../cadastraCliente" method="post" data-toggle="validator" role="form">
                    <div class="row">
                        <div class="form-group col-md-8">
                            <label for="nome">Nome</label>
                            <input name="nome" type="text" id="nome" class="form-control" placeholder="Nome" required>
                        </div>

                        <div class="form-group col-md-4">
                            <label for="CPF">CPF</label>
                            <input name="CPF" type="text" id="CPF" class="form-control" placeholder="CPF" required>
                        </div>
                    </div>

                    <div class="row">
                        <div class="form-group col-md-4">
                            <label for="Login">Login</label>
                            <input name="login" type="text" id="login" class="form-control" placeholder="Login" required>
                        </div>

                        <div class="form-group col-md-4">
                            <label for="Senha">Senha</label>
                            <input name="senha" type="password" id="senha" class="form-control" placeholder="Senha" data-minlength="8" required>
                            <div class="help-block">Mínimo de oito (8) digitos</div>
                        </div>

                        <div class="form-group col-md-4">
                            <label for="Email">Confirme sua senha</label>
                            <input name="senhaConfirm" type="password" id="senhaConfirm" class="form-control" placeholder="Confirme sua senha" 
                                   data-match="#senha" data-match-error="Atenção! As senhas não estão iguais." required>
                            <div class="help-block with-errors"></div>
                        </div>
                    </div>

                    <div class="row">
                        <div class="form-group col-md-8">
                            <label for="Email">Email</label>
                            <input name="email" type="email" id="email" class="form-control" placeholder="Email" required>
                            <div class="help-block with-errors"></div>
                        </div>

                        <div class="form-group col-md-4">
                            <label for="Data">Data de nascimento</label>
                            <input name="dataNasc" type="text" id="dataNasc" class="form-control" placeholder="Data de Nascimento" required>
                        </div>
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
            $('#CPF').mask('000.000.000-00');
            $('#dataNasc').mask('00/00/0000');
            //$('#login').mask('A#');
        });
    </script>
</html>