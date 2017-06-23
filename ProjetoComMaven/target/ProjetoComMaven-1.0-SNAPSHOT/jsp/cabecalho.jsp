<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">Nome da loja</a>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <li class="active"><a href="/ProjetoComMaven/index.jsp">P�gina Inicial <span class="sr-only">(current)</span></a></li>               
                <li><a href="#">Quem somos</a></li>
                <li><a href="#">Informa��es</a></li>
                <li><a href="#">Contato</a></li>
            </ul>

            <form class="navbar-form navbar-left" method="get" action="buscar">
                <div class="form-group">
                    <input type="text" class="form-control col-lg-6" placeholder="">
                </div>
                <button type="submit" class="btn btn-default">Buscar</button>
            </form>

            <ul class="nav navbar-nav navbar-right">
                <li class="active"><a href="/ProjetoComMaven/jsp/login.jsp">Minha Conta <span class="sr-only">(current)</span></a></li>               
                <li><a href="/ProjetoComMaven/jsp/cadastraCliente.jsp">Cadastre-se</a></li>
            </ul>
        </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>