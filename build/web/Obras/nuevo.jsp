
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">

        <title>Biblioteca</title>
    </head>
    <body>
        <h2>Nuevo registro</h2>
        
        <form action="ObrasController?accion=insert" method="POST" autocomplete="off">
            <p>
                Titulo:
                <input id="titulo" name="titulo" type="text" />
            </p>
            <p>
                Autor:
                <input id="autor" name="autor" type="text" />
            </p>
            <p>
                Paginas:
                <input id="paginas" name="paginas" type="text" />
            </p>
            <p>
                Genero:
                <input id="genero" name="genero" type="text" />
            </p>
            <p>
                Fecha de Publicacion:
                <input id="fechapublicacion" name="fechapublicacion" type="text" />
            </p>          
            <p>
                Ubicacion:
                <input id="ubicacion" name="ubicacion" type="text" />
            </p>
            <p>
                Unidades
                <input id="unidades" name="unidades" type="text" />
            </p>
            <button class="btn btn-dark" id="guardar" name="guardar" type="submit">Guardar</button>
        </form>
        
        
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>

    </body>
</html>
