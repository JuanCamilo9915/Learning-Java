<%-- 
    Document   : paginaDos
    Created on : 11/04/2021, 10:15:39 PM
    Author     : JuanCamiloDev
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Página Dos</title>
    </head>
    <body>
        <%
            String transporte = request.getParameter("transporte");
            String playa = request.getParameter("playa");
            String ciudad = request.getParameter("ciudad");
            String bosque = request.getParameter("bosque");
        %>
        <h1>Página Dos</h1>
        <table cellspacing="3" cellpadding="1" border="1">
            <tr>
                <td aling="right">Escogiste el siguiente transporte:</td>
                <td><%=transporte%></td>
            </tr>
        </table>


        <p>Elegiste los siguientes destinos:</p>
        <%if (ciudad != null) {%>
        ciudad
        <% }%>
        <%if (bosque != null) {%>
        bosque
        <% }%>
        <%if (playa != null) {%>
        playa
        <% }%>
        
        <form action="paginaPrincipal.jsp" method="post">
            <input type="submit" value="Regresar">
        </form>

    </body>
</html>
