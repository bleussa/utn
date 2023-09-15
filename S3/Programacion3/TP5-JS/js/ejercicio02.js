/*
Crear un array llamado meses y que almacene el nombre de los doce meses del año.
Mostrar por pantalla los doce nombres utilizando la función document.write(text) haciendo uso
primero de la estructura iterativa for y luego de igual manera con la estructura iterativa while. 
*/

const content = document.querySelector(".jsContent");

const meses = ['Enero', 'Febrero', 'Marzo', 'Abril', 'Mayo', 'Junio', 'Julio', 'Agosto', 'Septiembre', 'Octubre', 'Noviembre', 'Diciembre'];

meses.forEach((element) => {
    content.innerHTML += "<p>" + element + "</p>";
})

