<%-- 
    Document   : pageDestino
    Created on : 11/05/2021, 11:24:54 AM
    Author     : JuanCamiloDev
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Página Destino</title>
    </head>
    <body>
        <%@ page import="Projet_Comunicacion_JSP_Clases_Java.CalcularTiempo" %>
        <%
            String nom = request.getParameter("nombre");
            String tIni = request.getParameter("timeStart");
            String tFin = request.getParameter("timeEnd");
            String dis = request.getParameter("distReco");
            double velocidadRegis, tiempoRegis;

            CalcularTiempo calculo = new CalcularTiempo(tIni, tFin, dis);
            calculo.velocidad();
            velocidadRegis = calculo.getVelocidad();
            calculo.tiempoTotal();
            tiempoRegis = calculo.gettTotal();
        %>
        <h2>Resultados:</h2>
        <label><%=nom%></label>
        <table cellspacing="3" celpadding="3" border="1">
            <tr>
                <td aling="center">Tiempo Total Registrado:</td>
                <td><%=tiempoRegis%></td>
            </tr>
            <tr>
                <td aling="center">Velocidad Final Registrada:</td>
                <td><%=velocidadRegis%></td>
            </tr>
        </table>

            <form action="pagePrincipal.jsp" method="post">
                <input type="submit" value="Regresar">
            </form>
    </body>
</html>
