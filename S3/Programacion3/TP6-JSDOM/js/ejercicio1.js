/*
Mediante DOM y el método getElementById crear una página html y dado el siguiente párrafo:
<p id=”miparrafo”> Esto es una prueba </p>
Permitir cambiar el tamaño de la fuente de un párrafo. Para esto crear tres botones (fuente
pequeña (10), fuente mediana(13) y fuente grande(20)). Según que botón se seleccione aplicar el
tamaño que corresponde.
*/

let texto = document.getElementById('miparrafo');
let fuentePequena = document.getElementById('fuentePequena');
let fuenteMediana = document.getElementById('fuenteMediana');
let fuenteGrande = document.getElementById('fuenteGrande');

fuentePequena.addEventListener("click", () => {
    texto.style.fontSize = '10px';
})
fuenteMediana.addEventListener("click", () => {
    texto.style.fontSize = '13px';
})
fuenteGrande.addEventListener("click", () => {
    texto.style.fontSize = '20px';
})
