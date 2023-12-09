<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">

        <title>JSP Page</title>
    </head>
    <body>
        <h1>Catalogo de Materiales:</h1>


        <div class="row row-cols-1 row-cols-md-2 row-cols-lg-3">
            <!-- Libros -->
            <div class="col mb-4">
                <div class="card">
                    <div class="card-body">
                        <h5 class="card-title">Libros</h5>
                        <p class="card-text">Explora la colección de libros disponibles.</p>
                        <a href="LibrosController" class="btn btn-dark">Ver Libros</a>
                    </div>
                </div>
            </div>

            <!-- Revistas -->
            <div class="col mb-4">
                <div class="card">
                    <div class="card-body">
                        <h5 class="card-title">Revistas</h5>
                        <p class="card-text">Descubre las últimas ediciones de nuestras revistas.</p>
                        <a href="RevistasController" class="btn btn-dark">Ver Revistas</a>
                    </div>
                </div>
            </div>

            <!-- CDs -->
            <div class="col mb-4">
                <div class="card">
                    <div class="card-body">
                        <h5 class="card-title">CDs</h5>
                        <p class="card-text">Escucha la increíble colección de CDs.</p>
                        <a href="CdsController" class="btn btn-dark">Ver CDs</a>
                    </div>
                </div>
            </div>

            <!-- Tesis -->
            <div class="col mb-4">
                <div class="card">
                    <div class="card-body">
                        <h5 class="card-title">Tesis</h5>
                        <p class="card-text">Accede a las tesis académicas disponibles.</p>
                        <a href="TesisController" class="btn btn-dark">Ver Tesis</a>
                    </div>
                </div>
            </div>

            <!-- Obras -->
            <div class="col mb-4">
                <div class="card">
                    <div class="card-body">
                        <h5 class="card-title">Obras</h5>
                        <p class="card-text">Explora las obras literarias y artísticas.</p>
                        <a href="ObrasController" class="btn btn-dark">Ver Obras</a>
                    </div>
                </div>
            </div>
        </div>



        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>

    </body>
</html>
