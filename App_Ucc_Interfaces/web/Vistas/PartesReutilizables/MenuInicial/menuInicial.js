let menuInicialApp = document.getElementById('encabezado-inicial');

/************************************Creando Elementos************************************/
let contenedorMenu = document.createElement('section');
let logoUccIzq = document.createElement('img');
let tituloPrincipal = document.querySelector('h1');
let logoUccDer = document.createElement('img');

/************************************Creando Fragmentos**********************************/
let contenedorMenuFrag = document.createDocumentFragment();

/************************************Asignando Valores**********************************/
logoUccIzq.src = '/App_Ucc_Interfaces/Vistas/Resources/logoucc.png';
logoUccIzq.classList.add('logo-ucc-izq');
tituloPrincipal.classList.add('titulo-principal');
logoUccDer.src = '/App_Ucc_Interfaces/Vistas/Resources/logoucc.png';
logoUccDer.classList.add('logo-ucc-der');

contenedorMenu.appendChild(logoUccIzq);
contenedorMenu.appendChild(tituloPrincipal);
contenedorMenu.appendChild(logoUccDer);
contenedorMenu.classList.add('contenedor-menu-inicial');

contenedorMenuFrag.appendChild(contenedorMenu);

menuInicialApp.appendChild(contenedorMenuFrag);