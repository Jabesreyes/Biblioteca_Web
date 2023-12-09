<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">

        <title>JSP Page</title>
    </head>
    <body>
        <h1>Registrar</h1>
        
        <form action="RegistrarController?accion=insert" method="POST" autocomplete="off">
            <p>
                <label class="form-label">Usuario:</label>

                <input class="form-control" id="usuario" name="usuario" type="text" required/>
            </p>
            <p>
                <label class="form-label">Password:</label>

                <input class="form-control" id="password" name="password" type="password" required/>
            </p>
            <p>
                <label class="form-label">Nombre:</label>

                <input class="form-control" id="nombre" name="nombre" type="text" required/>
            </p>
            <p>
                <label class="form-label">Correo:</label>
                <input class="form-control" id="correo" name="correo" type="text" required/>
            </p>
            <p>
                <label for="permisos" class="form-label">Tipo de Usuario</label>
                <select class="form-select" id="permisos" name="permisos" required>
                    <option value="1">Admin</option>
                    <option value="2">Profesor</option>
                    <option value="3">Alumno</option>

                </select>
            </p>          
            <button class="btn btn-dark" id="guardar" name="guardar" type="submit">Guardar</button>
        </form>
        
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>

    </body>
</html>
