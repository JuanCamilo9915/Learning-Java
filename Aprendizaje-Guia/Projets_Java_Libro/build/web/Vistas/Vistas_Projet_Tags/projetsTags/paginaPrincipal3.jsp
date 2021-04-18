<%-- 
    Document   : paginaPrincipal3
    Created on : 17/04/2021, 05:33:46 PM
    Author     : JuanCamiloDev
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Trabajando con Áreas de Texto</h1>
        <p>Área de Texto con texto por defecto</p>
        <textarea name="area1" rows="3" cols="30">
            Lorem Ipsum es simplemente el texto de relleno de las imprentas y archivos de texto.
            Lorem Ipsum ha sido el texto de relleno estándar de las industrias desde el año 1500,
            cuando un impresor (N. del T. persona que se dedica a la imprenta) desconocido usó una
            galería de textos y los mezcló de tal manera que logró hacer un libro de textos especimen.
            No sólo sobrevivió 500 años, sino que tambien ingresó como texto de relleno en documentos
            electrónicos, quedando esencialmente igual al original. Fue popularizado en los 60s con la
            creación de las hojas "Letraset", las cuales contenian pasajes de Lorem Ipsum, y más
            recientemente con software de autoedición,
            como por ejemplo Aldus PageMaker, el cual incluye versiones de Lorem Ipsum.
        </textarea>
        <p>Área de Texto sin texto para Llenarlo</p>

        <form action="paginaDestino3.jsp" method="post">
            <textarea name="area2" rows="2" cols="70"></textarea>

            <input type="submit" value="Enviar">
        </form>
    </body>
</html>
