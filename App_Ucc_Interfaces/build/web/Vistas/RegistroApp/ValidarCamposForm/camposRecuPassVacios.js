function validarCamposRecuPass() {

    let formRecuPass = document.querySelector('#formu-recu-pass');
    let pregUno = document.querySelector('#pregunta-1').value;
    let pregDos = document.querySelector('#pregunta-2').value;
    let pregTres = document.querySelector('#pregunta-3').value;

    if (pregUno !== "" && pregDos !== "" && pregTres !== "") {
        alert(`Campos Diligenciados, pregUno: ${pregUno}, pregDos: ${pregDos}, pregTres: ${pregTres}`);

        formRecuPass.action = "../../index.jsp";
        
        //formRecuPass.reset();

    } else {
        alert(`Campos Vacíos, Diligencielos Correctamente`);
/*
        formRecuPass.addEventListener('submit', (event) => {
            event.preventDefault();
        });
        */
    }

}