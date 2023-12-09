<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
        <title>Asignar Mora</title>
    </head>
    <body>
        <div class="container mt-5">
            <h1 class="mb-4">Asignar Mora</h1>
            <form action="MoraController?accion=asignar" method="POST" autocomplete="off">
                <div class="mb-3">
                    <label for="id_tipo" class="form-label">Tipo de Usuario</label>
                    <select class="form-select" id="id_tipo" name="id_tipo" required>
                        <option value="Administrador">Administrador</option>
                        <option value="Profesor">Profesor</option>
                        <option value="Alumno">Alumno</option>
                    </select>
                </div>
                <div class="mb-3">
                    <label for="mora" class="form-label">Mora</label>
                    <input type="number" class="form-control" id="mora" name="mora" required>
                </div>
                <button type="submit" class="btn btn-dark" id="asignar" name="asignar">Asignar Mora</button>
            </form>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
    </body>
</html>
