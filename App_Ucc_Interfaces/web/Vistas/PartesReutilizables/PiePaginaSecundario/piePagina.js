/**********************************************Selección de los elemento HTML******************************************************/
let piePaginaApp = document.getElementById('pie-pag');
//let refsApp = document.getElementById('referencia-1'); Referencias de los icónos

/**********************************************Creación de los elementos HTML******************************************************/
let contenedor = document.createElement('div');
let derechosAutor = document.createElement('p');
let redTwitter = document.createElement('img');
let redFacebook = document.createElement('img');
let redInstagram = document.createElement('img');
let redYouTube = document.createElement('img');

/*Creando Enlaces----------------------------------------------------*/
let enlaceTwitter = document.createElement('a');
let enlaceFacebook = document.createElement('a');
let enlaceInstagram = document.createElement('a');
let enlaceYouTube = document.createElement('a');

/*****************************************************Fragmentos*********************************************************************/
/*Imágenes------*/
const fragImagenes = document.createDocumentFragment();//Elemento Imágenes

/*************************************************Se Muestran las Imágenes***********************************************************/
derechosAutor.innerHTML = "copyright © 2021";
redTwitter.innerHTML = redTwitter.src = '/App_Ucc_Interfaces/Vistas/Resources/twitter.png';
redFacebook.innerHTML = redFacebook.src = '/App_Ucc_Interfaces/Vistas/Resources/facebook.png';
redInstagram.innerHTML = redInstagram.src = '/App_Ucc_Interfaces/Vistas/Resources/instagram.png';
redYouTube.innerHTML = redYouTube.src = '/App_Ucc_Interfaces/Vistas/Resources/youtube.png';

/*************************************************Rutas de las Imágenes***********************************************************/
enlaceTwitter.href = 'https://twitter.com/login?lang=es';
enlaceTwitter.target = 'twitter';
enlaceFacebook.href = 'https://www.facebook.com/';
enlaceFacebook.target = 'facebook';
enlaceInstagram.href = 'https://www.instagram.com/?hl=es-la';
enlaceInstagram.target = 'instagram';
enlaceYouTube.href = 'https://www.youtube.com/';
enlaceYouTube.target = 'youtube';

/************************************************Añadiendo Clases HTML***************************************************************/
derechosAutor.classList.add('der-autor');
redTwitter.classList.add('iconos');
redFacebook.classList.add('iconos');
redInstagram.classList.add('iconos');
redYouTube.classList.add('iconos');

/*Clases para Enlaces----------------------------------------------------*/
//enlaceWhatsapp.classList.add('');

/*Contenedor-------------------------------------------------*/
contenedor.classList.add('contenedor');

/********************************************Anexando Elementos al Contenedor********************************************************/
enlaceFacebook.appendChild(redFacebook);
enlaceInstagram.appendChild(redInstagram);
enlaceTwitter.appendChild(redTwitter);
enlaceYouTube.appendChild(redYouTube);

contenedor.appendChild(enlaceFacebook);
contenedor.appendChild(enlaceYouTube);
contenedor.appendChild(enlaceInstagram);
contenedor.appendChild(enlaceTwitter);

/********************************************Anexando Elementos al Footer***********************************************************/
fragImagenes.appendChild(contenedor);

//piePaginaApp.appendChild(refsApp);
piePaginaApp.appendChild(derechosAutor);
piePaginaApp.appendChild(fragImagenes);