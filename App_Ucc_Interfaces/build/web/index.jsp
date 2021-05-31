<%-- 
    Document   : index
    Created on : 22/05/2021, 10:10:27 PM
    Author     : JuanCamiloDev
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Ucc</title>
        <!--Importando Estilos Menú Css-->
        <link rel="stylesheet" href="Vistas/PartesReutilizables/MenuInicial/estilosMenu.css"/>
        <!--Importando Estilos Css-->
        <link rel="shortcut icon" href="Vistas/Resources/logoucc.png" type="image/x-icon">
        <link rel="stylesheet" href="estilos/estilosLogin.css"/>
        <!--Importando Estilos Pie de Página Css-->
        <link rel="stylesheet" href=""/>
    </head>
    <body>
        <!------------------------------------Header------------------------------------->
        <header id="encabezado-inicial">
            <h1>Bienvenid@</h1>
        </header>

        <!------------------------------------Main------------------------------------->
        <main>

            <section id="contenedor-login">

                <div class="contenedor-img">

                    <img src="Vistas/Resources/imagenLogin.png" id="img-login">

                    <p class="registro">
                        <a class="enlace-registro" href="Vistas/RegistroApp/registro.jsp">
                            Si no tienes cuenta, Regístrate ahora</a>
                    </p>

                </div>
                <!--------------------------------------------------------------------------------->
                <div class="contenedor-form">

                    <h2 id="sub-titulo">
                        Inicio Sesión
                    </h2>

                    <img src="Vistas/Resources/UsuarioLogin.png" id="img-sesion">

                    <!---------------------------------Formulario:------------------------------------------->
                    <form action="#" method="POST" id="actionValue">

                        <input class="input-1" type="email" name="campoUsuario" placeholder="Usuario" required>
                        <p class="mensaje-error-credenciales">${msje}</p><!--Mensaje de Error-->
                        <input class="input-2" type="password" name="campoClave" placeholder="Contraseña" required>

                        <button
                            type="submit"
                            name="validar"
                            id="btn-ingresar"
                            onclick="validarCampos();"
                            >Ingresar</button>

                    </form>

                    <p class="olvido-pass">
                        <a class="enlace-olvido-pass" href="Vistas/RegistroApp/recuperarPass.jsp">
                            ¿Ha olvidado su contraseña?
                        </a>
                    </p>

                </div>

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
        <script src="Vistas/PartesReutilizables/MenuInicial/menuInicial.js"></script>
        <!--Alertas Campos Vacíos-->
        <script src="validarCampos/camposVacios.js"></script>
        <!------------------------------------------------------------------------------->
    </body>
</html>
