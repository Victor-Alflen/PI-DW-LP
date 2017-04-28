<%-- 
    Document   : cabecalho
    Created on : 06/04/2017, 21:31:22
    Author     : Victor
--%>
<div id="header" class="container">
    <div id="cabecalho">
        <div id="logo">
            <h1>Nome da loja</h1>
        </div>
        <div id="menu">
            <ul>
                <li class="active"><a href="jsp/cadastro.jsp" title="">Minha Conta</a></li>
                <li><a class="opMenu" href="#" title="">Página Inicial</a></li>
                <li><a class="opMenu" href="#" title="">Quem Somos</a></li>
                <li><a class="opMenu" href="recuperarClientes" title="">Informações</a></li>
                <li><a class="opMenu" href="#" title="">Contato</a></li>
            </ul>
        </div>
    </div>
    <div id="bloco2">
        <div id="divBusca">
            <form action="nada.jsp" method="get">
                <input id="txtBusca" type="text" name="search" placeholder="Digite o que deseja pesquisar" >
                <button id="btnBusca" type="submit">Buscar</button>
            </form>
        </div>
    </div>
</div>
