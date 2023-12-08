

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Biblioteca</title>
    </head>
    <body>
        <h1>Libros</h1>
        <a href="LibrosController?accion=nuevo">Nuevo Libro</a>
        <br /><br />
        <table border="1" width="80%">
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
                        <td><c:out value="${libro.codigoidentificacion}" /></td>
                        <td><c:out value="${libro.titulo}" /></td>
                        <td><c:out value="${libro.autor}" /></td>
                        <td><c:out value="${libro.paginas}" /></td>
                        <td><c:out value="${libro.editorial}" /></td>
                        <td><c:out value="${libro.isbn}" /></td>
                        <td><c:out value="${libro.fechapublicacion}" /></td>
                        <td><c:out value="${libro.ubicacion}" /></td>
                        <td><c:out value="${libro.unidades}" /></td>
                        <td><c:out value="${libro.unidadesprestados}" /></td>
                        <td><c:out value="${libro.unidadesdisponibles}" /></td>
                        <td><c:out value="${libro.codigoidentificacion}" /></td>
                        <td><c:out value="${libro.codigoidentificacion}" /></td>




                    </tr>
                </c:forEach>

            </tbody>

        </table>
    </body>
</html>
