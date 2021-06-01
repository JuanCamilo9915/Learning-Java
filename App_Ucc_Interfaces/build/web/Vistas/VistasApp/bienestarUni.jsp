<%-- 
    Document   : bienestarUni
    Created on : 23/05/2021, 03:44:28 PM
    Author     : JuanCamiloDev
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bienestar Universitario</title>
        <link rel="shortcut icon" href="/App_Ucc_Interfaces/Vistas/Resources/universidad.svg" type="image/x-icon">
        <!---Importando CSS--->
        <link rel="stylesheet" href="/App_Ucc_Interfaces/Vistas/PartesReutilizables/MenuSecundario/estilosMenuOpc.css">
        <link rel="stylesheet" href="/App_Ucc_Interfaces/Vistas/VistasApp/estilos/estilosBienestarU.css">
        <link rel="stylesheet" href="/App_Ucc_Interfaces/Vistas/PartesReutilizables/PiePaginaSecundario/estilosPiePagina.css">
    </head>
    <body>
        <header id="menu"></header>
        <!----------------------------------------Cuerpo de Página------------------------------------------------------------------------>
        <main id="contenedor-principal">
            <section id="flecha">
                <a href="home.jsp">
                    <img id="img-flecha" src="/App_Ucc_Interfaces/Vistas/Resources/flecha-izquierda.png">
                </a>
            </section>
            <section id="titulo-principal">
                <h1 id="titulo">Bienestar Universitario</h1>
            </section>

            <section id="area-usuario">
                
            </section>
        </main>
        <!----------------------------------------Pie de Página---------------------------------------------------------------------------->
        <footer id="pie-pag"></footer>

        <!--Importando Código JS-->
        <script src="/App_Ucc_Interfaces/Vistas/PartesReutilizables/MenuSecundario/menuOpciones.js"></script>
        <script src="/App_Ucc_Interfaces/Vistas/PartesReutilizables/PiePaginaSecundario/piePagina.js"></script>
        
    </body>
</html>
