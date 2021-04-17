<%-- 
    Document   : paginaPrincipal2
    Created on : 14/04/2021, 07:47:52 PM
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
        <h1>Página Principal</h1>
        <form action="paginaDos2.jsp" method="post">
            <p>Idioma Nativo:</p>
            <select name="idioma">
                <option>Español</option>
                <option>Inglés</option>
                <option>Frances</option>
                <option>Portugues</option>
                <option>Italiano</option>
            </select>
            <p>
                Selecciona el o los lenguajes de programación
                <br>
                Nota: (Ctrl + Clic) para elegir más de una opción
            </p>
            <select name="idioma">
                <option>Java</option>
                <option>JavaScript</option>
                <option>Python</option>
                <option>C++</option>
                <option>C#</option>
            </select>
            <br>
            <input type="submit" value="Enviar">
        </form>
    </body>
</html>
