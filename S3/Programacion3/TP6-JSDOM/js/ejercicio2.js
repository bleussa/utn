/*
Haciendo uso de childNodes y nodeValue desarrollar una página y definir un elemento h1 con el
texto "1". Luego, en forma dinámica rescatar el valor que tiene el nodo de texto, convertirlo a
entero con la función parseInt de JavaScript, sumarle uno y finalmente asignárselo a la propiedad
nodeValue del nodo de texto (es decir mostramos un contador). 
*/

setInterval(() => {
    let h1 = document.getElementById('contador');
    let numero = h1.childNodes[0].nodeValue;

    if (parseInt(numero)) {
        numero = parseInt(numero) + 1;
    }

    h1.childNodes[0].nodeValue = numero;

}, 1000)