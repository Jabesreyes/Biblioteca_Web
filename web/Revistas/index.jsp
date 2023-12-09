<%@page import="model.Usuarios.Usuario"%>
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
            <h1 class="mb-4">Revistas</h1>
            <% if (((Usuario) session.getAttribute("usuarioLogueado")).getId_tipo() == 1 || ((Usuario) session.getAttribute("usuarioLogueado")).getId_tipo() == 2) { %>
            <a href="RevistasController?accion=nuevo" class="btn btn-primary mb-3">Nueva Revista</a>

            <% }%>

            <table class="table">
                <thead>
                    <tr>
                        <th>Codigo Identificacion</th>
                        <th>Titulo</th>
                        <th>Editorial</th>
                        <th>Periodicidad</th>
                        <th>Fecha de Publicacion</th>
                        <th>Ubicacion</th>
                        <th>Unidades</th>
                        <th>Unidades Prestados</th>
                        <th>Unidades Disponibles</th>

                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="revistas" items="${lista}">
                        <tr>
                            <td>${revistas.codigoidentificacion}</td>
                            <td>${revistas.titulo}</td>
                            <td>${revistas.editorial}</td>
                            <td>${revistas.periodicidad}</td>
                            <td>${revistas.fechapublicacion}</td>
                            <td>${revistas.ubicacion}</td>
                            <td>${revistas.unidades}</td>
                            <td>${revistas.unidadesprestados}</td>
                            <td>${revistas.unidadesdisponibles}</td>

                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
    </body>
</html>
