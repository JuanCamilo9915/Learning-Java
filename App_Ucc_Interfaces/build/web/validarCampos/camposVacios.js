function validarCampos() {

    let formAccion = document.querySelector('#actionValue');
    let usu = document.querySelector('.input-1').value;
    let pass = document.querySelector('.input-2').value;
    
    if (usu !== "" && pass !== "") {
        alert(`Campos Diligenciados, usu: ${usu}, pass: ${pass}`);
        formAccion.action = "ControlIngreso?accion=validar";
    } else {
        alert(`Campos Vacíos, Diligencielos Correctamente`);
    }

}