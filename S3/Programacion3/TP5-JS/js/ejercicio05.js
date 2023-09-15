const submitButton = document.querySelector('input[type=submit]');

submitButton.addEventListener("click", (event) => {
    let elementoActivo = document.querySelector('input[type="radio"]:checked');
    if(elementoActivo) {
        alert(elementoActivo);
    } else {
        alert('No hay ninún elemento activo');
    }

    

});