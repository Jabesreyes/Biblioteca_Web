
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">

        <title>JSP Page</title>
    </head>
    <body>
        <h3 class="text-center mt-5">Biblioteca Amigos de Don Bosco</h3>

        <div class="container mt-5 col-lg-4">
            <div class="card">
                <div class="card-body">
                    <form>
                        <div class="form-group text-center">
                            <h3>Login</h3>
                            <label>Bienvenidos al sistema</label>
                        </div>
                        <div class="form-group pt-3">
                            <label>Usuario:</label>
                            <input type="text" name="txtuser" class="form-control">
                        </div>
                        <div class="form-group pt-3">
                            <label>Contraseña:</label>
                            <input type="password" name="txtpass" class="form-control">
                        </div>
                        <div class="text-center"> 
                            <input type="submit" name="accion" value="Ingresar" class="btn btn-dark btn-block mt-4">
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>

    </body>
</html>
