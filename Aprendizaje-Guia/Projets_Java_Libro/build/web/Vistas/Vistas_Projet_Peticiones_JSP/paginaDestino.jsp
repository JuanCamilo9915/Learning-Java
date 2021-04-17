<%-- 
    Document   : newjsppaginaDestino
    Created on : 11/04/2021, 09:50:21 PM
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
            //Esto es un scriptlet de Java para los JSP
            String nombre = request.getParameter("nombre");
            String color = request.getParameter("color");
            String correo = request.getParameter("mail");
        %>
        <h1>Págin 2</h1>
        <label>Los datos ingresados, fueron:</label>
        <table cellspacing="3" cellpadding="3" border="1">
            <tr>
                <td align="right">Nombre:</td>
                <td>
                    <%=nombre%>
                </td>
            </tr>
            <tr>
                <td align="right">Color Favorito:</td>
                <td>
                    <%=color%>
                </td>
            </tr>
            <tr>
                <td align="right">Correo:</td>
                <td>
                    <%=correo%>
                </td>
            </tr>
        </table>

        <form action="page_principal.jsp" method="post">
            <input type="submit" value="regresar">
        </form>
    </body>
</html>
