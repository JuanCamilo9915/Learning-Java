function actualizarDatos(){
    //Sección de Perfil:
    let nombre = document.getElementById('nom-seleccionado');
    let apellido = document.getElementById('ape-seleccionado');
    let email = document.getElementById('email-seleccionado');
    let telefono = document.getElementById('tel-seleccionado');
    //Inputs:
    let nombreActualizado = document.getElementById('inp-seleccionado-nom');
    let apellidoActualizado = document.getElementById('inp-seleccionado-ape');
    let emailActualizado = document.getElementById('inp-seleccionado-email');
    let telefonoActualizado = document.getElementById('inp-seleccionado-tel');
    //Btns:
    let btnActualizar = document.getElementById('btn-actualizar-selec');
    let btnEnviar = document.getElementById('btn-enviar-selec');
    
    //Info de Nombre:
    nombre.classList.remove('nom');
    nombre.classList.add('nomOculto');
    
    //Info de Apellidos:
    apellido.classList.remove('ape');
    apellido.classList.add('apeOculto');
    
    //Info de Correo:
    email.classList.remove('email');
    email.classList.add('emailOculto');
    
    //Info de Teléfono:
    telefono.classList.remove('tel');
    telefono.classList.add('telOculto');
    
    //Info Campos de Nombre:
    nombreActualizado.classList.remove('campoNomOculto');
    nombreActualizado.classList.add('campoNom');
    
    //Info Campos de Apellidos:
    apellidoActualizado.classList.remove('campoApeOculto');
    apellidoActualizado.classList.add('campoApe');
    
    //Info Campos de Teléfono:
    emailActualizado.classList.remove('campoEmailOculto');
    emailActualizado.classList.add('campoEmail');
    
    //Info Campos de Correo:
    telefonoActualizado.classList.remove('campoTelOculto');
    telefonoActualizado.classList.add('campoTel');
    
    //Btns:
    btnActualizar.classList.remove('btn-actualizar');
    btnActualizar.classList.add('btn-actualizar-oculto');
    btnEnviar.classList.remove('btn-actualizar-perfil');
    btnEnviar.classList.add('btn-actualizar-perfil-visible');
    
}

function actualizarPreguntas(){
    //Sección de Preguntas:
    
    let preguntaUno = document.getElementById('p1-seleccionado');
    let preguntaDos = document.getElementById('p2-seleccionado');
    let preguntaTres = document.getElementById('p3-seleccionado');
    //Inputs:
    let preguntaUnoActualizada = document.getElementById('inp-seleccionado-p1');
    let preguntaDosActualizada = document.getElementById('inp-seleccionado-p2');
    let preguntaTresActualizada = document.getElementById('inp-seleccionado-p3');
    //Btns:
    let btnActualizarP = document.getElementById('btn-actualizar-p-selec');
    let btnEnviarP = document.getElementById('btn-enviar-p-selec');
    
    //Info de PreguntaUno:
    preguntaUno.classList.remove('respuesta-1');
    preguntaUno.classList.add('respuesta-1-oculta');
    
    //Info de PreguntaDos:
    preguntaDos.classList.remove('respuesta-2');
    preguntaDos.classList.add('respuesta-2-oculta');
    
    //Info de PreguntaTres:
    preguntaTres.classList.remove('respuesta-3');
    preguntaTres.classList.add('respuesta-3-oculta');
       //voy aquí 
    //Info del Campo RespuestaUno:
    preguntaUnoActualizada.classList.remove('campoPUnoOculto');
    preguntaUnoActualizada.classList.add('campoPUno');
    
    //Info del Campo RespuestaDos:
    preguntaDosActualizada.classList.remove('campoPDosOculto');
    preguntaDosActualizada.classList.add('campoPDos');
    
    //Info del Campo RespuestaTres:
    preguntaTresActualizada.classList.remove('campoPTresOculto');
    preguntaTresActualizada.classList.add('campoPTres');
    
    //Btns:
    btnActualizarP.classList.remove('btn-preguntas');
    btnActualizarP.classList.add('btn-preguntas-oculto');
    btnEnviarP.classList.remove('btn-agregar-preguntas');
    btnEnviarP.classList.add('btn-actualizar-preguntas-visible');
    
}