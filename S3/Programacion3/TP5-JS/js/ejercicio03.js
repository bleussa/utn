const submitButton = document.querySelector('input[type=submit]');

submitButton.addEventListener("click", (event) => {
    event.preventDefault();
    let dni = document.getElementById('dni').value;
    let letra = document.getElementById('letra').value.toUpperCase();

    if (validarDni(dni)) {
        if (letra == calcularLetra(dni)) {
            cambiarDatos(dni, letra);
        } else {
            alert("[ERROR] La letra no es la correcta!")
        }
    }

});

function validarDni(dni){
    if (dni < 0 || dni > 99999999){
        alert("[ERROR] Número fuera de rango!");
        return false;
    } else {
        return true;
    }
}

function calcularLetra(dni){
    const letras = ['T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E','T'];
    var resto = dni % 23;
    var letra = letras[resto];
    letra.toUpperCase();
    console.log(letra);
    return letra;
}

function cambiarDatos(dni, letra){
    const dniContainer = document.querySelector('.dniContainer');
    dniContainer.innerHTML = `<div class="jsContent dniMensaje"><h1>${dni}-${letra}</h1><p>DNI validado correctamente!</p> </div>`;
}

