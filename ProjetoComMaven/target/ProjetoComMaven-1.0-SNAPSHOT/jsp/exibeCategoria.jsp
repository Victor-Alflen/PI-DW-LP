<%-- 
    Document   : exibeCategoria
    Created on : 23/06/2017, 09:50:56
    Author     : Victor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="imports.jsp"%>
        <title>Loja sem nome</title>
    </head>
    <body>
        <%@include file="cabecalho.jsp" %>
        <div class="row">
            <%@include file="barraLateral.jsp" %>
            <div class="col-md-8">
                <div class="table-responsive">
                    <table class="table table-hover">
                        <tr>
                            <th>Id</th>
                            <th>Nome</th>
                            <th>CPF</th>
                            <th>Login</th>
                            <th>Senha</th>
                            <th>Email</th>
                            <th>Ativo</th>
                            <th>Admin</th>
                            <th>Data de Nascimento</th>
                        </tr>
                        <c:forEach items="${listaClientes}" var="cliente">
                            <tr>
                                <td><c:out value="${cliente.id}"/></td>
                                <td><c:out value="${cliente.nome}"/></td>
                                <td><c:out value="${cliente.cpf}"/></td>
                                <td><c:out value="${cliente.login}"/></td>
                                <td><c:out value="${cliente.senha}"/></td>
                                <td><c:out value="${cliente.email}"/></td>
                                <td><c:out value="${cliente.ativo}"/></td>
                                <td><c:out value="${cliente.admin}"/></td>
                                <td><c:out value="${cliente.dataNascimento}"/></td>
                            </tr>
                        </c:forEach>
                        
                    </table>
                </div> 
            </div>
            <div class="col-md-2"></div>
        </div>
        <%@include file="rodape.jsp" %>
        <!--<div class="jumbotron center-block">
            <p>Algo</p>
        </div>-->
    </body>
</html>
