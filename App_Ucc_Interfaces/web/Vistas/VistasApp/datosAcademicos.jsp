<%-- 
    Document   : datosAcademicos
    Created on : 23/05/2021, 03:43:02 PM
    Author     : JuanCamiloDev
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro Académico</title>
        <link rel="shortcut icon" href="/App_Ucc_Interfaces/Vistas/Resources/universidad.svg" type="image/x-icon">
        <!---Importando CSS--->
        <link rel="stylesheet" href="/App_Ucc_Interfaces/Vistas/PartesReutilizables/MenuSecundario/estilosMenuOpc.css">
        <link rel="stylesheet" href="/App_Ucc_Interfaces/Vistas/VistasApp/estilos/estilosRegistroAca.css">
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

                <h1 id="titulo">Registro Académico</h1>

            </section>

            <section id="area-usuario">

                <div id="img-perfil">

                    <img class="dimensiones-img-perfil" src="/App_Ucc_Interfaces/Vistas/Resources/perfil.png">

                </div>

                <h3 class="perfil">Perfil</h3>

                <div class="datos-perfil">

                    <!--Scroll del Contenido-->
                    <div class="scroll-perfil">

                        <!--Sección 1-->
                        <section class="seccion-perfil-uno">

                            <!--Datos de Perfil-->
                            <h2 class="eti-info">Datos Personales</h2>

                            <label class="eti-nom">Nombres:</label>
                            <h3 class="nom" id="nom-seleccionado">Pepe</h3>

                            <label class="eti-ape">Apellidos:</label>
                            <h3 class="ape" id="ape-seleccionado">Florez Aguilar</h3>

                            <label class="eti-email">Correo:</label>
                            <h3 class="email" id="email-seleccionado">pepe0123@gmail.com</h3>

                            <label class="eti-tel">Teléfono:</label>
                            <h3 class="tel" id="tel-seleccionado">321-654-3023</h3>

                            <div class="separador"></div>

                            <button id="btn-actualizar-selec" class="btn-actualizar" onclick="actualizarDatos();">
                                Actualizar Perfil
                            </button>

                            <!--Actualizar Datos de Perfil-->
                            <!---------------------------------Formulario:------------------------------------------->
                            <form action="#" method="POST" id="form-actualizar-perfil">

                                <input id="inp-seleccionado-nom" class="campoNomOculto" placeholder="Ingrese sus Nombres">
                                <input id="inp-seleccionado-ape" class="campoApeOculto" placeholder="Ingrese sus Apellidos">
                                <input id="inp-seleccionado-email" class="campoEmailOculto" placeholder="Ingrese su correo">
                                <input id="inp-seleccionado-tel" class="campoTelOculto" placeholder="Ingrese su teléfono">

                                <!--Btns Formulario Actualizar Perfil-->
                                <button id="btn-enviar-selec"
                                        class="btn-actualizar-perfil"
                                        onclick="actualizarDatos();">
                                    Enviar
                                </button>

                            </form>

                        </section>

                        <!--Sección 2-->
                        <section class="seccion-perfil-dos">
                            <!--Preguntas de Seguridad-->
                            <h2 class="eti-info-2">Preguntas de Seguridad</h2>

                            <label class="eti-pregunta-1">Pregunta 1:</label>
                            <h3 class="respuesta-1" id="p1-seleccionado">Respuesta 1</h3>

                            <label class="eti-pregunta-2">Pregunta 2:</label>
                            <h3 class="respuesta-2" id="p2-seleccionado">Respuesta 2</h3>

                            <label class="eti-pregunta-3">Pregunta 3:</label>
                            <h3 class="respuesta-3" id="p3-seleccionado">Respuesta 3</h3>

                            <div class="separador"></div>

                            <!---------------------------------Formulario:------------------------------------------->
                            <form action="#" method="POST" id="form-actualizar-preguntas">

                                <input id="inp-seleccionado-p1" class="campoPUnoOculto" placeholder="Ingrese su Respuesta">
                                <input id="inp-seleccionado-p2" class="campoPDosOculto" placeholder="Ingrese su Respuesta">
                                <input id="inp-seleccionado-p3" class="campoPTresOculto" placeholder="Ingrese su Respuesta">

                                <!--Btns Formulario Actualizar Preguntas de Seguridad-->
                                <button id="btn-enviar-p-selec" class="btn-agregar-preguntas"
                                        onclick="actualizarPreguntas();">
                                    Enviar
                                </button>

                            </form>

                            <!--Actualizar Preguntas de Seguridad-->
                            <button id="btn-actualizar-p-selec" class="btn-preguntas" onclick="actualizarPreguntas();">
                                Actualizar Preguntas
                            </button>

                        </section>

                    </div>

                </div>
            </section>
        </main>
        <!----------------------------------------Pie de Página---------------------------------------------------------------------------->
        <footer id="pie-pag"></footer>

        <!-----------------------------Importando Archivos JS---------------------------->
        <!--Menú-->
        <script src="/App_Ucc_Interfaces/Vistas/PartesReutilizables/MenuSecundario/menuOpciones.js"></script>
        <!--Ocultar elementos y Enviar Datos-->
        <script src="/App_Ucc_Interfaces/Vistas/VistasApp/codigoJS/registroAca.js"></script>
        <!--Pie de Página-->
        <script src="/App_Ucc_Interfaces/Vistas/PartesReutilizables/PiePaginaSecundario/piePagina.js"></script>

    </body>
</html>
