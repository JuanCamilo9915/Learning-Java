<%-- 
    Document   : registro
    Created on : 4/05/2021, 10:11:59 AM
    Author     : JuanCamiloDev
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro</title>
        <!--Importando Estilos Menú Css-->
        <link rel="stylesheet" href="../PartesReutilizables/MenuInicial/estilosMenu.css"/>
        <!--Importando Estilos Css-->
        <link rel="shortcut icon" href="../Resources/universidad.svg" type="image/x-icon">
        <link rel="stylesheet" href="EstilosCss/estilosRegistro.css"/>
        <!--Importando Estilos Pie de Página Css-->
        <link rel="stylesheet" href=""/>  
    </head>
    <body>
        <!------------------------------------Header------------------------------------->
        <header id="encabezado-inicial">
            <h1>Registro de Usuario</h1>
        </header>

        <!------------------------------------Main------------------------------------->
        <main>

            <section id="area-registro">
                <!---------------------------------Formulario:------------------------------------------->
                <form action="#" method="post" id="formu-regis">
                    <div class="caja-1">
                        <input class="campos-registro" type="text" name="nom" placeholder="Nombre" required>
                    </div>
                    <div class="caja-2">
                        <input class="campos-registro" type="text" name="ape" placeholder="Apellidos" required>
                    </div>
                    <div class="caja-3">
                        <input class="campos-registro" type="email" name="correo" placeholder="Usuario(Correo)" required>
                    </div>
                    <div class="caja-4">
                        <input class="campos-registro" type="password" name="pass" placeholder="Contraseña" required>
                    </div>
                    <div class="caja-imag">
                        <img id="img-registro" src="../../Vistas/Resources/registro.png">
                    </div>
                    <div class="caja-5">
                        <input class="campos-registro" type="password" name="pass2" placeholder="Confirmar Contraseña" required>
                    </div>
                    <div class="caja-6">
                        <input class="campos-registro" type="text" name="tel" placeholder="Teléfono" required>
                    </div>
                    <div class="caja-7">
                        <button id="boton" type="submit" onclick="validarCamposRegis();">
                            Registrarse
                        </button>
                    </div>
                </form>

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
        <script src="ValidarCamposForm/camposRegisVacios.js"></script>
        <!------------------------------------------------------------------------------->
    </body>
</html>
