<%-- 
    Document   : quienesSomos
    Created on : 24/05/2021, 03:36:18 AM
    Author     : JuanCamiloDev
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>¿Quienes Somos?</title>
        <link rel="shortcut icon" href="/App_Ucc_Interfaces/Vistas/Resources/logoucc.png" type="image/x-icon">
        <!---Importando CSS--->
        <link rel="stylesheet" href="/App_Ucc_Interfaces/Vistas/PartesReutilizables/MenuSecundario/estilosMenuOpc.css">
        <link rel="stylesheet" href="/App_Ucc_Interfaces/Vistas/VistasApp/estilos/estilosQuienesSomos.css">
        <link rel="stylesheet" href="/App_Ucc_Interfaces/Vistas/PartesReutilizables/PiePaginaSecundario/estilosPiePagina.css">
    </head>
    <body>
        <header id="menu"></header>
        <!----------------------------------------Cuerpo de Página------------------------------------------------------------------------>
        <main id="contenedor-principal">
            <section id="titulo-principal">
                <h1 id="titulo">¿Quienes Somos?</h1>
            </section>

            <section id="area-usuario">
                <div class="seccion-ucc">
                    <label class="etiqueta">Universidad Cooperativa de Colombia</label>
                    <br><br>
                    <p class="parrafo">
                        <%
                            out.print("is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and ");
                        %>
                    </p>
                </div>
                <div class="seccion-ucc">
                    <label class="etiqueta">Misión</label>
                    <br><br>
                    <p class="parrafo">
                        <%
                            out.print("is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the");
                        %>
                    </p>
                </div>
                <div class="seccion-ucc">
                    <label class="etiqueta">Visión</label>
                    <br><br>
                    <p class="parrafo">
                        <%
                            out.print("here are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable. If you are going to use a passage of Lorem Ipsum, you need to be sure there isn't anything embarrassing hidden in the middle of text. All the Lorem Ipsum generators on the Internet tend to repeat predefi");
                        %>
                    </p>
                </div>
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
