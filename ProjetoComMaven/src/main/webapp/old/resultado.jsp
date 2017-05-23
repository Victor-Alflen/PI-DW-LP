<%-- 
    Document   : resultado
    Created on : 12/05/2017, 10:53:17
    Author     : Victor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <p> Nome da pessoa ${pessoa.nome} </p>
        <p> Sobrenome ${pessoa.sobrenome} </p>
        <p> CEP ${pessoa.endereco.cep} </p>
        <p> Bairro ${pessoa.endereco.bairro} </p>
        
        <p> A capital do estado do ${estados[0]} é ${capitais["Maranhao"]} </p>
        
    </body>
</html>
