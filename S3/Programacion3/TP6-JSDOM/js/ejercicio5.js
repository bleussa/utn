/*
Cree una función mostrarSoluciones que sea llamada al presionar un botón y agregue dos marcas
de tipo (li) con los textos solución 1 y solución 2 a la etiqueta <ul> existente.
*/
let numero = 1;

function mostrarSoluciones() {
    let ul = document.getElementById('lista');

    let li1 = document.createElement('li');
    li1.innerHTML = 'Solución ' + numero;
    numero++;

    let li2 = document.createElement('li');
    li2.innerHTML = 'Solución ' + numero;
    numero++;

    ul.appendChild(li1);
    ul.appendChild(li2);
}