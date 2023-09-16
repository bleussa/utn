const submitButton = document.querySelector('input[type=submit]');

submitButton.addEventListener("click", (event) => {
    event.preventDefault();
    let elementoActivo = document.querySelector('input[type="radio"]:checked');
    if(elementoActivo.getAttribute("id") == "mayor") {
        alert('Puede entrar en el sitio')
    } else if (elementoActivo.getAttribute("id") == "menor") {
        alert('No puede entrar en el sitio')
    } else {
        alert('No hay ninún elemento activo');
    }

    

});