
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">

        <title>JSP Page</title>
    </head>
    <body>
        <h2 class="mb-4">Formulario de Devoluciones</h2>

        
        <div class="container mt-5">
            <form action="Prestar?accion=Devolver" method="POST">
                <div class="mb-3">
                    <label for="tipoMaterial2" class="form-label">Tipo de Material</label>
                    <select class="form-select" id="tipoMaterial2" name="tipoMaterial2" required>
                        <option value="libros">Libros</option>
                        <option value="obras">Obras</option>
                        <option value="revistas">Revistas</option>
                        <option value="tesis">Tesis</option>
                        <option value="cds">CDs</option>
                    </select>
                </div>
                <div class="mb-3">
                    <label for="codigoIdentificacion" class="form-label">Código de Identificación del material</label>
                    <input type="text" class="form-control" id="codigoIdentificacion" name="codigoIdentificacion" required>
                </div>
                <div class="mb-3">
                    <label for="usuario" class="form-label">Usuario:</label>
                        <input type="text" class="form-control" id="usuario2" name="usuario2">
                </div>
                <div class="mb-3">
                    <label for="iniciaPrestamo" class="form-label">Fecha en la que Inicio el Prestamo</label>
                    <input type="text" class="form-control" id="iniciaPrestamo" name="iniciaPrestamo" required>
                </div>
                <div class="mb-3">
                    <label for="finalizaPrestamo" class="form-label">Fecha en la que Finaliza el Prestamo</label>
                    <input type="text" class="form-control" id="finalizaPrestamo" name="finalizaPrestamo" required>
                </div>
                <div class="mb-3">
                    <button type="submit" name="accion" value="Devolver" class="btn btn-dark">Devolver Material</button>
                </div>
            </form>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>

    </body>
</html>
