<%-- 
    Document   : Home
    Created on : 19/05/2021, 10:47:35 AM
    Author     : JuanCamiloDev
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    //Mensaje de Prueba:
    //System.out.println("Visitante: "+session.getAttribute("visitante"));
    if (session.getAttribute("visitante") != null) {
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Página Principal</title>
        <link rel="shortcut icon" href="/App_Ucc_Interfaces/Vistas/Resources/universidad.svg" type="image/x-icon">
        <!---Importando CSS--->
        <link rel="stylesheet" href="/App_Ucc_Interfaces/Vistas/PartesReutilizables/MenuSecundario/estilosMenuOpc.css">
        <link rel="stylesheet" href="/App_Ucc_Interfaces/Vistas/VistasApp/estilos/estilosHome.css">
        <link rel="stylesheet" href="/App_Ucc_Interfaces/Vistas/PartesReutilizables/PiePaginaSecundario/estilosPiePagina.css">
    </head>
    <body>
        <header id="menu"></header>
        <!----------------------------------------Cuerpo de Página------------------------------------------------------------------------>
        <main>
            <!---Area Título--->
            <section id="sect-titulo">
                <h1>Página Principal</h1>
            </section>
            <!---Area Usuario--->
            <section id="area-usuario">
                <!---Area de Trabajo de Usuario--->
                <section id="sect-central">
                    <div id="caja-1">
                        <label class="nom-boton">Biblioteca</label>
                        <form action="/App_Ucc_Interfaces/Vistas/VistasApp/biblioteca.jsp">
                            <button class="btn-verde" id="btn-1">
                                <img class="dimensiones-btn" src="/App_Ucc_Interfaces/Vistas/Resources/Paginaprincipalbiblioteca.png">
                            </button>
                        </form>
                    </div>
                    <div id="caja-2">
                        <label class="nom-boton">Bienestar Universitario</label>
                        <form action="/App_Ucc_Interfaces/Vistas/VistasApp/home.jsp">
                            <!----action="/App_Ucc_Interfaces/Vistas/VistasApp/bienestarUni.jsp"---->
                            <button class="btn-claro" id="btn-2" onclick="alert('Modulo en Desarrollo');">
                                <img class="dimensiones-btn" src="/App_Ucc_Interfaces/Vistas/Resources/Paginaprincipalbienestaruniversitario.png">
                            </button>
                        </form>
                    </div>
                    <div id="caja-3">
                        <label id="etiqueta-central">¿Que vamos a consultar hoy?</label>
                    </div>
                    <div id="caja-4">
                        <label class="nom-boton">Semilleros</label>
                        <form action="/App_Ucc_Interfaces/Vistas/VistasApp/home.jsp">
                            <!--action="/App_Ucc_Interfaces/Vistas/VistasApp/semilleros.jsp"-->
                            <button class="btn-claro" id="btn-3" onclick="alert('Modulo en Desarrollo');">
                                <img class="dimensiones-btn" src="/App_Ucc_Interfaces/Vistas/Resources/Paginaprincipalsemilleros.png">
                            </button>
                        </form>
                    </div>
                    <div id="caja-5">
                        <label class="nom-boton">Registros Académicos</label>
                        <form action="/App_Ucc_Interfaces/Vistas/VistasApp/datosAcademicos.jsp">
                            <button class="btn-verde" id="btn-4">
                                <img class="dimensiones-btn" src="/App_Ucc_Interfaces/Vistas/Resources/Paginaprincipaldatosacademicos.png">
                            </button>
                        </form>
                    </div>
                </section>
            </section>

        </main>
        <!----------------------------------------Pie de Página---------------------------------------------------------------------------->
        <footer id="pie-pag"></footer>
        
        <!---
        <div>Iconos diseñados por <a href="https://www.freepik.com" title="Freepik">Freepik</a> from <a href="https://www.flaticon.es/" title="Flaticon">www.flaticon.es</a></div>
        ---->

        <!--Importando Código JS-->
        <script src="/App_Ucc_Interfaces/Vistas/PartesReutilizables/MenuSecundario/menuOpciones.js"></script>
        <script src="/App_Ucc_Interfaces/Vistas/PartesReutilizables/PiePaginaSecundario/piePagina.js"></script>

    </body>
</html>

<%
    } else {
        response.sendRedirect("index.jsp");
    }
%>