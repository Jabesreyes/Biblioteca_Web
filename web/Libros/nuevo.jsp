<%-- 
    Document   : nuevo
    Created on : Dec 7, 2023, 12:20:13 AM
    Author     : Jabes
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Biblioteca</title>
    </head>
    <body>
        <h2>Nuevo registro</h2>
        
        <form action="LibrosController?accion=insert" method="POST" autocomplete="off">
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
                Editorial
                <input id="editorial" name="editorial" type="text" />
            </p>
            <p>
                ISBN:
                <input id="isbn" name="isbn" type="text" />
            </p>
            <p>
                Fecha Publicacion:
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
            <button id="guardar" name="guardar" type="submit">Guardar</button>
        </form>
    </body>
</html>
