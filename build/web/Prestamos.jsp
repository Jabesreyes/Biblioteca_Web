<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">

        <title>JSP Page</title>
    </head>
    <body>
        <h1>Prestamos</h1>

        <div class="container mt-5">
            <form action="Prestar?accion=Prestar" method="POST">
                <div class="mb-3">
                    <label for="tipoMaterial" class="form-label">Tipo de Material</label>
                    <select class="form-select" id="tipoMaterial" name="tipoMaterial" required>
                        <option value="libros">Libros</option>
                        <option value="obras">Obras</option>
                        <option value="revistas">Revistas</option>
                        <option value="tesis">Tesis</option>
                        <option value="cds">CDs</option>
                    </select>
                </div>
                <div class="mb-3">
                    <div class="mb-3">
                        <label for="usuario" class="form-label">Usuario:</label>
                        <input type="text" class="form-control" id="usuario1" name="usuario1">
                    </div>


                    <label for="codigoIdentificacion" class="form-label">Código de Identificación</label>
                    <input type="text" class="form-control" id="codigoIdentificacion" name="codigoIdentificacion" required>

                    <label for="fecha" class="form-label">Fecha de Inicio de Prestamo: (yyyy-mm-dd)</label>
                    <input type="text" class="form-control" id="fecha" name="fecha" required>


                </div>
                <div class="mb-3">
                    <button type="submit" name="accion" value="Prestar" class="btn btn-dark">Iniciar Préstamo</button>
                </div>
            </form>
        </div>

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>

    </body>
</html>
