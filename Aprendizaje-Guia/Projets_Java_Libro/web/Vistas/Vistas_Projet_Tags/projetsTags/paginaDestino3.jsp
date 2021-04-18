<%-- 
    Document   : paginaDestino3
    Created on : 17/04/2021, 09:15:43 PM
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
        <%
            String areaTexto = request.getParameter("area2");
        %>
        <h1>Página Recepción de Datos</h1>
        <table cellspace="3" cellpadding="1" border="7">
            <tr>
                <td aling="right">Se a escrito lo siguiente:</td>
                <td><%=areaTexto%></td>
            </tr>
        </table>
            <form action="paginaPrincipal3.jsp" method="post">
            <input type="submit" value="Volver">
        </form>
    </body>
</html>
