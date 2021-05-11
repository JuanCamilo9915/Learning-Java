<%-- 
    Document   : ConteoAccesos
    Created on : 11/05/2021, 08:36:04 AM
    Author     : JuanCamiloDev
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Conteo de Accesos</title>
    </head>
    <body>
        <%@page import="java.util.Date" %>
        <%! int cuentaAccesos = 0; %>
        <% cuentaAccesos++; %>
        
        <h1>Conteo de los Accesos a la Página</h1>
        
        <table cellspacing="3" celpadding="3" border="1">
            <tr>
                <td aling="center">Fecha y Hora:</td>
                <td><%= new Date() %></td>
            </tr>
        </table>
        
        <table cellspacing="3" celpadding="3" border="1">
            <tr>
                <td aling="center">Cantidad de Accesos</td>
                <td><%= cuentaAccesos %></td>
            </tr>
        </table>
    </body>
</html>
