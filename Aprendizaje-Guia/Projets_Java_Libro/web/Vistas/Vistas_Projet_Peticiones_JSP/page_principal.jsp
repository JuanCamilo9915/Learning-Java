<%-- 
    Document   : page_principal
    Created on : 11/04/2021, 09:25:08 PM
    Author     : JuanCamiloDev
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Peticiones Get y Post</title>
    </head>
    <body>
        <h1>Págin Principal</h1>
        <label>Diligencia el siguiente formulario:</label>
        <form action="paginaDestino.jsp" method="post">
            <table cellspacing="3" cellpadding="3" border="1">
                <tr>
                    <td align="right">Nombre:</td>
                    <td>
                        <input type="text" name="nombre">
                    </td>
                </tr>
                <tr>
                    <td align="right">Color Favorito:</td>
                    <td>
                        <input type="text" name="color">
                    </td>
                </tr>
                <tr>
                    <td align="right">Correo:</td>
                    <td>
                        <input type="text" name="mail">
                    </td>
                </tr>
            </table>
            
            <input type="reset" value="borrar">
            <input type="submit" value="enviar">
        </form>
    </body>
</html>
