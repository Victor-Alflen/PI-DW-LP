<%-- 
    Document   : exibeCategoria
    Created on : 23/05/2017, 16:43:33
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
        <div class="table-responsive">
            <table class="table table-hover">
                <c:forEach items="${listaCategoria}" var="categoria">
                    <tr>
                        <td><c:out value="${categoria.id}"/></td>
                        <td><c:out value="${categoria.nome}"/></td>
                        <td><c:out value="${categoria.descricao}"/></td>
                    </tr>
                </c:forEach>
            </table>
        </div> 
        <!--<div class="jumbotron center-block">
            <p>Algo</p>
        </div>-->
    </body>
</html>
