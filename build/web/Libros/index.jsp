<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <title>Biblioteca</title>
</head>
<body>
    <div class="container mt-5">
        <h1 class="mb-4">Libros</h1>
        <a href="LibrosController?accion=nuevo" class="btn btn-primary mb-3">Nuevo Libro</a>
        
        <table class="table">
            <thead>
                <tr>
                    <th>Codigo Identificacion</th>
                    <th>Titulo</th>
                    <th>Autor</th>
                    <th>Paginas</th>
                    <th>Editorial</th>
                    <th>ISBN</th>
                    <th>Fecha Publicacion</th>
                    <th>Ubicacion</th>
                    <th>Unidades</th>
                    <th>Unidades Prestados</th>
                    <th>Unidades Disponibles</th>
                    <th></th>
                    <th></th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="libro" items="${lista}">
                    <tr>
                        <td>${libro.codigoidentificacion}</td>
                        <td>${libro.titulo}</td>
                        <td>${libro.autor}</td>
                        <td>${libro.paginas}</td>
                        <td>${libro.editorial}</td>
                        <td>${libro.isbn}</td>
                        <td>${libro.fechapublicacion}</td>
                        <td>${libro.ubicacion}</td>
                        <td>${libro.unidades}</td>
                        <td>${libro.unidadesprestados}</td>
                        <td>${libro.unidadesdisponibles}</td>
                        <td>
                            <a href="#" class="btn btn-info btn-sm">Editar</a>
                        </td>
                        <td>
                            <a href="#" class="btn btn-danger btn-sm">Eliminar</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
</body>
</html>
