<%-- 
    Document   : paginaPrincipal
    Created on : 11/04/2021, 10:15:15 PM
    Author     : JuanCamiloDev
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Radio-Button y Checkbox</title>
    </head>
    <body>
        <h1>Página Principal</h1>
        <form action="paginaDos.jsp" method="post">
            <label>Elige un transporte:</label><br><br>
            <input type="radio" name="transporte" value="coche" checked="">coche
            <input type="radio" name="transporte" value="Avion" checked="">Avión
            <input type="radio" name="transporte" value="Autobus" checked="">Autobus
            
            <br>
            <hr>
            
            <label>¿Qué destino deseas explorar?</label><br><br>
            <input type="checkbox" name="ciudad" value="ciudad" checked="">ciudad
            <input type="checkbox" name="bosque" value="bosque" checked="">bosque
            <input type="checkbox" name="playa" value="playa" checked="">playa
            <br>
            <input type="submit" value="Enviar">
        </form>
    </body>
</html>
