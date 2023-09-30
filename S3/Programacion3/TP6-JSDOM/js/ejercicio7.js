function validar() {
    let user = document.getElementById('user');
    let pass = document.getElementById('pass');
    let passV = document.getElementById('passValidation');
    let mensaje = document.querySelector('.mensaje')

    if (user.value == "" || pass.value == "" || passV.value == "") {
        mensaje.classList.add('active');
        mensaje.children[0].setAttribute('tipo', 'error');
        mensaje.children[0].textContent = 'Error';
        mensaje.children[1].textContent = 'Faltan datos.';
        eliminarMensaje(3000);
    } else if (pass.value != passV.value) {
        mensaje.classList.add('active');
        mensaje.children[0].setAttribute('tipo', 'error');
        mensaje.children[0].textContent = 'Error';
        mensaje.children[1].textContent = 'Las contraseñas no coinciden.';
        eliminarMensaje(3000);
    } else {
        mensaje.classList.add('active');
        mensaje.children[0].setAttribute('tipo', 'mensaje');
        mensaje.children[0].textContent = 'Perfecto';
        mensaje.children[1].textContent = 'Todos los datos estan OK.';
        eliminarMensaje(10000);
    }

    function eliminarMensaje(tiempo) {
        setTimeout(() => {
            mensaje.classList.remove('active');
        }, tiempo)
    }


}

