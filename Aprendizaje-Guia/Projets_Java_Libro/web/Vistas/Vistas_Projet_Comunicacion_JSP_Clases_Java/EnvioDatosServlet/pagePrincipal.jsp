<%-- 
    Document   : index
    Created on : 11/05/2021, 09:39:01 AM
    Author     : JuanCamiloDev
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Captura de Datos</title>
    </head>
    <body>
        <label>Introduce los siguientes datos:</label><br>
        <form>
            <table cellspacing="3" celpadding="3" border="1">
                <tr>
                    <td aling="center">Nombre:</td>
                    <td><input type="text" name="nombre"></td>
                </tr>
                <tr>
                    <td aling="center">Tiempo de Inicio:</td>
                    <td><input type="text" name="timeStart"></td>
                </tr>
                <tr>
                    <td aling="center">Tiempo de Final:</td>
                    <td><input type="text" name="timeEnd"></td>
                </tr>
                <tr>
                    <td aling="center">Distancia Recorrida(en mtrs):</td>
                    <td><input type="text" name="distReco"></td>
                </tr>
            </table>
            <input type="reset" value="Borrar">
            <button type="submit">Enviar</button>
            <input type="submit" value="Enviar Input">
        </form>
    </body>
</html>
