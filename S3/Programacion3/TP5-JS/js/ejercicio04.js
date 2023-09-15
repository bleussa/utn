const submitButton = document.querySelector('input[type=submit]');

submitButton.addEventListener("click", (event) => {
    event.preventDefault();
    let sueldo = document.getElementById('sueldo').value;
    let ant = document.getElementById('ant').value;

    if (sueldo < 500 && ant >= 10) {
        sueldo = sueldo * 1.20;
        cambiarDatos(sueldo, ant);
    } else if (sueldo < 500 && ant < 10) {
        sueldo = sueldo * 1.05;
        cambiarDatos(sueldo, ant);
    } else{
        cambiarDatos(sueldo, ant);
    }

    

});

function cambiarDatos(sueldo, ant){
    const sueldoContainer = document.querySelector('.sueldoContainer');
    sueldoContainer.innerHTML = `<div class="jsContent sueldoMensaje"><h1>Su salario es: $${sueldo}</h1><p>Gracias por sus ${ant} años con nosotros!</p> </div>`;
}

