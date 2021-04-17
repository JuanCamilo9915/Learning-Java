<%-- 
    Document   : newjsppaginaDos2
    Created on : 14/04/2021, 07:48:12 PM
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
            String idioma = request.getParameter("idioma");
            String optiLenguajes[] = request.getParameterValues("lenguajes");
        %>
        <h1>Recepción de Resultados</h1>
        <table cellspacing="7" cellpadding="1" border="3">
            <tr>
                <td aling="right">Tu idioma Nativo es:</td>
                <td><%=idioma%></td>
            </tr>
        </table>
        <p>
            Tienes conocimientos en los siguientes lenguajes de programación:
            <br><br>
            <%
                for(int i = 0; i < optiLenguajes.length; i++){
            %>
                <%= optiLenguajes[i] %>
            <%
                }
            %>
        </p>
        <form action="paginaPrincipal2.jsp" method="post">
            <input type="submit" value="Regresar">
        </form>    
    </body>
</html>
