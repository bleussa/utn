/*
Cree una función cambiarColor que haciendo uso de la función getElementsByTagName asigne el
color azul (blue) a todos los párrafos de la página.
*/

function cambiarColor() {
    let ArrayP = document.getElementsByTagName("p");
    for (let i = 0; i < ArrayP.length; i++) {
        const element = ArrayP[i];
        element.style.color = 'blue';
    }
}