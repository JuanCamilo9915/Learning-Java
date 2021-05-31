<%-- 
    Document   : biblioteca
    Created on : 23/05/2021, 03:22:09 PM
    Author     : JuanCamiloDev
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Biblioteca</title>
        <!--Importando Estilos Menú Css-->
        <link rel="stylesheet" href="/App_Ucc_Interfaces/Vistas/PartesReutilizables/MenuSecundario/estilosMenuOpc.css">
        <!---Importando CSS--->
        <link rel="stylesheet" href="/App_Ucc_Interfaces/Vistas/VistasApp/estilos/estilosBiblioteca.css">
        <link rel="shortcut icon" href="/App_Ucc_Interfaces/Vistas/Resources/logoucc.png" type="image/x-icon">
        <!--Importando Estilos Pie de Página Css-->
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
                <h1 id="titulo">Biblioteca</h1>
            </section>

            <section id="area-usuario">
                <section id="sect-busqueda">
                    <input type="search" name="busquedaLibro" id="busqueda" placeholder="¡Busquemos un Libro!">
                    <img id="img-busqueda" src="/App_Ucc_Interfaces/Vistas/Resources/busqueda-de-lupa-2.png">
                </section>
                <section id="sect-libros">

                    <!---------------------------------Formulario:------------------------------------------->
                    <form id="seleccionar-todo">
                        <div class="scroll-libros">
                            <div class="seccion-n">
                                <div class="espacio-1">
                                    <img class="img-libro" src="/App_Ucc_Interfaces/Vistas/Resources/busqueda-de-lupa-2.png" alt="" srcset="">
                                    <p class="descripcion-libro">Lorem ipsum dolor eos laborum maiores,sapiente distinctio voluptatem nt
                                        soluta quam e!</p>
                                    <input class="selector" type="checkbox" name="libro" id="select">
                                </div>
                                <div class="espacio-2">
                                    <img class="img-libro" src="/App_Ucc_Interfaces/Vistas/Resources/busqueda-de-lupa-2.png" alt="" srcset="">
                                    <p class="descripcion-libro">laborum maiores, nobis sint sapiente distinctio voluptatem asperiores
                                        impedit optio rem,</p>
                                    <input class="selector" type="checkbox" name="libro" id="select">
                                </div>
                                <div class="espacio-3">
                                    <img class="img-libro" src="/App_Ucc_Interfaces/Vistas/Resources/busqueda-de-lupa-2.png" alt="" srcset="">
                                    <p class="descripcion-libro">Lorem ipsum dolor sit amet consectetur adipisicing elit. Officiis
                                        perfereeius cupiditate hic!</p>
                                    <input class="selector" type="checkbox" name="libro" id="select">
                                </div>
                                <div class="espacio-4">
                                    <img class="img-libro" src="/App_Ucc_Interfaces/Vistas/Resources/busqueda-de-lupa-2.png" alt="" srcset="">
                                    <p class="descripcion-libro">ctio voluptatem asperiores impedit optio rem, blanditiis sunt soluta quam
                                        eius cupiditate hic!</p>
                                    <input class="selector" type="checkbox" name="libro" id="select">
                                </div>
                            </div>
                            <div class="seccion-n">
                                <div class="espacio-1">
                                    <img class="img-libro" src="/App_Ucc_Interfaces/Vistas/Resources/busqueda-de-lupa-2.png" alt="" srcset="">
                                    <p class="descripcion-libro">Lorem ipsum dolor eos laborum maiores,sapiente distinctio voluptatem nt
                                        soluta quam e!</p>
                                    <input class="selector" type="checkbox" name="libro" id="select">
                                </div>
                                <div class="espacio-2">
                                    <img class="img-libro" src="/App_Ucc_Interfaces/Vistas/Resources/busqueda-de-lupa-2.png" alt="" srcset="">
                                    <p class="descripcion-libro">laborum maiores, nobis sint sapiente distinctio voluptatem asperiores
                                        impedit optio rem,</p>
                                    <input class="selector" type="checkbox" name="libro" id="select">
                                </div>
                                <div class="espacio-3">
                                    <img class="img-libro" src="/App_Ucc_Interfaces/Vistas/Resources/busqueda-de-lupa-2.png" alt="" srcset="">
                                    <p class="descripcion-libro">Lorem ipsum dolor sit amet consectetur adipisicing elit. Officiis
                                        perfereeius cupiditate hic!</p>
                                    <input class="selector" type="checkbox" name="libro" id="select">
                                </div>
                                <div class="espacio-4">
                                    <img class="img-libro" src="/App_Ucc_Interfaces/Vistas/Resources/busqueda-de-lupa-2.png" alt="" srcset="">
                                    <p class="descripcion-libro">ctio voluptatem asperiores impedit optio rem, blanditiis sunt soluta quam
                                        eius cupiditate hic!</p>
                                    <input class="selector" type="checkbox" name="libro" id="select">
                                </div>
                            </div>
                            <div class="seccion-n">
                                <div class="espacio-1">
                                    <img class="img-libro" src="/App_Ucc_Interfaces/Vistas/Resources/busqueda-de-lupa-2.png" alt="" srcset="">
                                    <p class="descripcion-libro">Lorem ipsum dolor eos laborum maiores,sapiente distinctio voluptatem nt
                                        soluta quam e!</p>
                                    <input class="selector" type="checkbox" name="libro" id="select">
                                </div>
                                <div class="espacio-2">
                                    <img class="img-libro" src="/App_Ucc_Interfaces/Vistas/Resources/busqueda-de-lupa-2.png" alt="" srcset="">
                                    <p class="descripcion-libro">laborum maiores, nobis sint sapiente distinctio voluptatem asperiores
                                        impedit optio rem,</p>
                                    <input class="selector" type="checkbox" name="libro" id="select">
                                </div>
                                <div class="espacio-3">
                                    <img class="img-libro" src="/App_Ucc_Interfaces/Vistas/Resources/busqueda-de-lupa-2.png" alt="" srcset="">
                                    <p class="descripcion-libro">Lorem ipsum dolor sit amet consectetur adipisicing elit. Officiis
                                        perfereeius cupiditate hic!</p>
                                    <input class="selector" type="checkbox" name="libro" id="select">
                                </div>
                                <div class="espacio-4">
                                    <img class="img-libro" src="/App_Ucc_Interfaces/Vistas/Resources/busqueda-de-lupa-2.png" alt="" srcset="">
                                    <p class="descripcion-libro">ctio voluptatem asperiores impedit optio rem, blanditiis sunt soluta quam
                                        eius cupiditate hic!</p>
                                    <input class="selector" type="checkbox" name="libro" id="select">
                                </div>
                            </div>
                            <div class="seccion-n">
                                <div class="espacio-1">
                                    <img class="img-libro" src="/App_Ucc_Interfaces/Vistas/Resources/busqueda-de-lupa-2.png" alt="" srcset="">
                                    <p class="descripcion-libro">Lorem ipsum dolor eos laborum maiores,sapiente distinctio voluptatem nt
                                        soluta quam e!</p>
                                    <input class="selector" type="checkbox" name="libro" id="select">
                                </div>
                                <div class="espacio-2">
                                    <img class="img-libro" src="/App_Ucc_Interfaces/Vistas/Resources/busqueda-de-lupa-2.png" alt="" srcset="">
                                    <p class="descripcion-libro">laborum maiores, nobis sint sapiente distinctio voluptatem asperiores
                                        impedit optio rem,</p>
                                    <input class="selector" type="checkbox" name="libro" id="select">
                                </div>
                                <div class="espacio-3">
                                    <img class="img-libro" src="/App_Ucc_Interfaces/Vistas/Resources/busqueda-de-lupa-2.png" alt="" srcset="">
                                    <p class="descripcion-libro">Lorem ipsum dolor sit amet consectetur adipisicing elit. Officiis
                                        perfereeius cupiditate hic!</p>
                                    <input class="selector" type="checkbox" name="libro" id="select">
                                </div>
                                <div class="espacio-4">
                                    <img class="img-libro" src="/App_Ucc_Interfaces/Vistas/Resources/busqueda-de-lupa-2.png" alt="" srcset="">
                                    <p class="descripcion-libro">ctio voluptatem asperiores impedit optio rem, blanditiis sunt soluta quam
                                        eius cupiditate hic!</p>
                                    <input class="selector" type="checkbox" name="libro" id="select">
                                </div>
                            </div>
                        </div>
                    </form>
                </section>

                <section id="sect-botones">
                    <button class="btn-1" type="submit" onclick="alert('En Desarrollo');">
                        Descargar Selección
                    </button>
                    <button class="btn-2" type="submit" onclick="seleccionarTodo();">
                        Seleccionar Todo
                    </button>
                    <button class="btn-3" type="submit" onclick="alert('En Desarrollo');">
                        Mis Prestamos
                    </button>
                </section>
            </section>
        </main>
        <!----------------------------------------Pie de Página---------------------------------------------------------------------------->
        <footer id="pie-pag"></footer>

        <!-----------------------------Importando Archivos JS---------------------------->
        <!--Menú-->
        <script src="/App_Ucc_Interfaces/Vistas/PartesReutilizables/MenuSecundario/menuOpciones.js"></script>
        <!--Funcionalidad de Botones-->
        <script src="/App_Ucc_Interfaces/Vistas/VistasApp/codigoJS/bibliotecaJS.js"></script>
        <!--Pie de Página-->
        <script src="/App_Ucc_Interfaces/Vistas/PartesReutilizables/PiePaginaSecundario/piePagina.js"></script>
        <!------------------------------------------------------------------------------->
    </body>
</html>
