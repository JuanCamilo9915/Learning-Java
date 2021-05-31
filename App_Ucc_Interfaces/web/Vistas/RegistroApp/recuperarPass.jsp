<%-- 
    Document   : recuperarPass
    Created on : 4/05/2021, 10:12:30 AM
    Author     : JuanCamiloDev
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Recuperación Contraseña</title>
        <!--Importando Estilos Menú Css-->
        <link rel="stylesheet" href="../PartesReutilizables/MenuInicial/estilosMenu.css"/>
        <!--Importando Estilos Css-->
        <link rel="shortcut icon" href="../Resources/logoucc.png" type="image/x-icon">
        <link rel="stylesheet" href="EstilosCss/estilosRecupePass.css"/>
        <!--Importando Estilos Pie de Página Css-->
        <link rel="stylesheet" href=""/> 
    </head>
    <body>
        <!------------------------------------Header------------------------------------->
        <header id="encabezado-inicial">
            <h1>Recuperar Contraseña</h1>
        </header>

        <!------------------------------------Main------------------------------------->
        <main>
            <section id="area-titulo">
                <h2>Preguntas de Seguridad</h2>
            </section>
            <section id="area-campos">
                <!--<form action="index-login.html" method="post">-->
                <div id="caja-1">
                    <input type="text" name="pregunta-uno" id="pregunta-1" placeholder="¿Cual es tu color favorito?">
                </div>
                <div id="caja-2">
                    <input type="text" name="pregunta-uno" id="pregunta-2"
                           placeholder="¿Cual es el nombre de tu mascota?">
                </div>
                <div>
                    <img id="candado" src="../Resources/RecuperacionPass.png">
                </div>
                <div id="caja-3">
                    <input type="text" name="pregunta-uno" id="pregunta-3"
                           placeholder="¿Cual es la fecha de expedición de la C.C.?">
                </div>

                <div id="boton-cambio-pass">

                    <form action="#" method="POST" id="formu-recu-pass">
                        <button id="estilos-boton" onclick="validarCamposRecuPass()">
                            Enviar
                        </button>
                    </form>

                </div>
                <!--</form>-->
            </section>
        </main>
        <!------------------------------------Footer------------------------------------->
        <footer id="pie-pagina-inicial">
            <!--------Referencuas de iconos-->
            <div>
                Iconos diseñados por
                <a href="https://www.freepik.com" title="Freepik">Freepik</a> from
                <a href="https://www.flaticon.es/" title="Flaticon">www.flaticon.es</a>
            </div>
        </footer>
        <!-----------------------------Importando Archivos JS---------------------------->
        <!--Menú-->
        <script src="../PartesReutilizables/MenuInicial/menuInicial.js"></script>
        <!--Validando Campos-->
        <script src="ValidarCamposForm/camposRecuPassVacios.js"></script>
        <!------------------------------------------------------------------------------->
    </body>
</html>
