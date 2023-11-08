const selectRubros = document.getElementById('selectRubros');

fetch("http://localhost:4000/rubros")
  .then(response => response.json())
  .then(result => insertarOpciones(result))
  .catch(error => console.log('error', error));

function insertarOpciones(result) {
    result.forEach(rubro => {
        selectRubros.innerHTML += `
            <option value="${rubro.id}">${rubro.descripcion}</option>
        `;
    });
}

let btnBusqueda = document.getElementById('btnBusqueda');

btnBusqueda.addEventListener("click", (event) => {
    event.preventDefault();
    let rubro_id = selectRubros.value;

    fetch(`http://localhost:4000/productos/${rubro_id}`)
        .then(response => response.json())
        .then(result => insertarProductos(result))
        .catch(error => console.log('error', error));
})

function insertarProductos(result) {
    let tbody = document.querySelector('tbody');
    tbody.innerHTML = "";
    
    result.forEach(producto => {
        tbody.innerHTML += `
            <tr>
                <th scope="row">${producto.id}</th>
                <td>${producto.descripcion}</td>
                <td>${producto.precio}</td>
                <td>${producto.rubro.descripcion}</td>
            </tr>
        `;
    });
}