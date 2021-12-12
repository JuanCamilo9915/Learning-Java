function validarCamposRegis() {

    let formRegis = document.querySelector('#formu-regis');
    let usuNom = document.querySelector('.caja-1 .campos-registro');
    let usuApe = document.querySelector('.caja-2 .campos-registro').value;
    let usuEmail = document.querySelector('.caja-3 .campos-registro').value;
    let usuPass = document.querySelector('.caja-4 .campos-registro').value;
    let usuPass2 = document.querySelector('.caja-5 .campos-registro').value;
    let usuTel = document.querySelector('.caja-6 .campos-registro').value;

    if (usuNom !== "" && usuApe !== "" && usuEmail !== "" && usuPass !== "" && usuPass2 !== "" && usuTel !== "") {
        alert(`Campos Diligenciados, usuNom: ${usuNom.value}, usuApe: ${usuApe}, usuEmail: ${usuEmail}, usuPass: ${usuPass}, usuPass2: ${usuPass2}, usuTel: ${usuTel}`);

        let passIgual = (usuPass === usuPass2);

        switch (passIgual) {
            case true:
                //document.querySelector('.caja-4 .campos-registro').classList.remove('pass-diferentes');
                //document.querySelector('.caja-5 .campos-registro').classList.remove('pass-diferentes');
                //formRegis.action = "/App_Ucc_Interfaces/ControlRegistro";
                //formRegis.reset();
                formRegis.action = "/App_Ucc_Interfaces/ControlRegistro";

                break;

            default:
                alert(`Ingrese la misma contraseña. Contraseña: ${usuPass} - Confirmar Contraseña: ${usuPass2}`);
                /*
                document.querySelector('.caja-4 .campos-registro').classList.add('pass-diferentes');
                document.querySelector('.caja-5 .campos-registro').classList.add('pass-diferentes');

                formRegis.addEventListener('submit', (event) => {
                    event.preventDefault();
                });*/
                break;
        }
    } else {
        alert(`Campos Vacíos, Diligencielos Correctamente`);
    }

}