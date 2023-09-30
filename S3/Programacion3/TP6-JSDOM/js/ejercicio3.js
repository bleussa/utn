/*
Defina una fuction JavaScript cambiarTamFuente que haciendo uso de la función parentNode
cambie el tamaño de fuente por '40px' para todos los elementos de la página.
*/

function cambiarTamFuente() {
    let parrafo = document.getElementById('parrafo1');
    let bodyParent = parrafo.parentNode;
    
    for (let index = 0; index < bodyParent.children.length; index++) {
        const element = bodyParent.children[index];
        element.style.fontSize = '40px';
    }

}