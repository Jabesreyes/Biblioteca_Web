<%@page import="model.Usuarios.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">

        <title>Home Biblioteca</title>
    </head>
    <body>
        <nav class="navbar bg-dark navbar-expand-lg border-bottom border-body" data-bs-theme="dark">
            <div class="container-fluid">
                <a class="navbar-brand" href="#">Amigos Don Bosco</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarNavAltMarkup">

                    <div class="navbar-nav">
                        <a class="nav-link active" aria-current="page" href="Controlador?accion=Inicio" target="myFrame">Inicio</a>
                        <a class="nav-link" href="Controlador?accion=Catalogo" target="myFrame">Catalogo</a>
                        <a class="nav-link" href="Controlador?accion=Devoluciones" target="myFrame">Devoluciones</a>
                        <a class="nav-link" href="Controlador?accion=Prestamos" target="myFrame">Prestamos</a>

                        <% if (((Usuario) session.getAttribute("usuarioLogueado")).getId_tipo() != 2 && ((Usuario) session.getAttribute("usuarioLogueado")).getId_tipo() != 3) { %>
                        <a class="nav-link" href="Controlador?accion=Reestablecer" target="myFrame">Reestablecer Contraseña</a>
                        <a class="nav-link" href="Controlador?accion=Registrar" target="myFrame">Registrar</a>
                        <a class="nav-link" href="Controlador?accion=Mora" target="myFrame">Mora</a>
                        <a class="nav-link" href="Controlador?accion=Configuraciones" target="myFrame">Configuraciones</a>

                        <% }%>

                    </div>
                </div>
                <div class="dropdown mr-5">
                    <button class="btn btn-secondary dropdown-toggle" type="button" data-bs-toggle="dropdown" aria-expanded="false">
                        ${usuarioLogueado.getNombre()}
                    </button>
                    <ul class="dropdown-menu dropdown-menu-end text-center">
                        <li><a class="dropdown-item" href="#">${usuarioLogueado.getUsuario()}</a></li>
                        <li><a class="dropdown-item" href="#">${usuarioLogueado.getCorreo()}</a></li>
                        <div class="dropdown-divider"></div>
                        <form action="Validar" method="POST">
                            <button name="accion" value="Salir" class="dropdown-item" href="#">Salir</button>
                        </form>
                    </ul>
                </div>
            </div>
        </nav>




        <div class="m-4" style="height: 550px;">
            <iframe name="myFrame" style="height: 100%; width: 100%"></iframe>
        </div>

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
    </body>
</html>
