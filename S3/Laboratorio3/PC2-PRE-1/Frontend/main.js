var arrayResultados = null;
function cargaArticulos() {
    var tableContent = document.querySelector('tbody');
    if (tableContent) {
        fetch("http://localhost:3000/articulos")
            .then(function (response) { return response.json(); })
            .then(function (result) { return printArticulos(result, tableContent); })
            .catch(function (error) { return console.log('error', error); });
    }
}
function cargaArticulo(id, form) {
    fetch("http://localhost:3000/articulos/".concat(id))
        .then(function (response) { return response.json(); })
        .then(function (result) { return cargaFormulario(result, form); })
        .catch(function (error) { return console.log('error', error); });
}
function cargaFormulario(result, form) {
    var inputElements = form.querySelectorAll('input');
    result = result.data;
    for (var input in inputElements) {
        for (var dato in result) {
            if (inputElements[input].getAttribute('id') == dato) {
                inputElements[input].value = result[dato];
            }
        }
    }
}
function limpiarFormulario(form) {
    var inputElements = form.querySelectorAll('input');
    inputElements.forEach(function (input) {
        input.value = "";
    });
}
function printArticulos(result, tabla) {
    result.data.forEach(function (articulo) {
        var tr = document.createElement('tr');
        for (var valor in articulo) {
            var td = document.createElement('td');
            td.innerHTML = articulo[valor];
            tr.appendChild(td);
        }
        var actionButtons = document.createElement('td');
        var modBtn = document.createElement('button');
        modBtn.setAttribute('id', 'modificarRegistro');
        modBtn.setAttribute('articulo', articulo.id);
        modBtn.innerHTML = 'Modificar';
        actionButtons.appendChild(modBtn);
        var delBtn = document.createElement('button');
        delBtn.setAttribute('id', 'eliminarRegistro');
        delBtn.setAttribute('articulo', articulo.id);
        delBtn.innerHTML = 'Eliminar';
        actionButtons.appendChild(delBtn);
        tr.appendChild(actionButtons);
        tabla.appendChild(tr);
    });
    cargaDOM();
}
function cargaDOM() {
    var btnCrearRegistro = document.getElementById('crearRegistro');
    var btnModificarRegistro = document.querySelectorAll('#modificarRegistro');
    var btnEliminarRegistro = document.querySelectorAll('#eliminarRegistro');
    var btnCerrarVentana = document.querySelectorAll('#cerrarVentana');
    var modalContainer = document.querySelector('.modalContainer');
    btnCerrarVentana.forEach(function (btn) {
        btn.addEventListener("click", function () {
            modalContainer === null || modalContainer === void 0 ? void 0 : modalContainer.classList.remove('active');
            modalContainer === null || modalContainer === void 0 ? void 0 : modalContainer.children[0].classList.remove('active');
            modalContainer === null || modalContainer === void 0 ? void 0 : modalContainer.children[1].classList.remove('active');
        });
    });
    btnCrearRegistro === null || btnCrearRegistro === void 0 ? void 0 : btnCrearRegistro.addEventListener("click", function () {
        limpiarFormulario(modalContainer === null || modalContainer === void 0 ? void 0 : modalContainer.children[0]);
        modalContainer === null || modalContainer === void 0 ? void 0 : modalContainer.classList.add('active');
        modalContainer === null || modalContainer === void 0 ? void 0 : modalContainer.children[0].classList.add('active');
    });
    btnModificarRegistro.forEach(function (btn) {
        btn.addEventListener("click", function () {
            cargaArticulo(parseInt(btn.getAttribute('articulo')), modalContainer === null || modalContainer === void 0 ? void 0 : modalContainer.children[0]);
            modalContainer === null || modalContainer === void 0 ? void 0 : modalContainer.classList.add('active');
            modalContainer === null || modalContainer === void 0 ? void 0 : modalContainer.children[0].classList.add('active');
        });
    });
    btnEliminarRegistro.forEach(function (btn) {
        btn.addEventListener("click", function () {
            modalContainer === null || modalContainer === void 0 ? void 0 : modalContainer.classList.add('active');
            modalContainer === null || modalContainer === void 0 ? void 0 : modalContainer.children[1].classList.add('active');
        });
    });
    arrayResultados = document.querySelectorAll('tbody tr');
}
cargaArticulos();
var searchInput = document.getElementById('searchInput');
if (searchInput) {
    searchInput.addEventListener("keydown", function (e) {
        if (e.key === 'Enter') {
            var termino = searchInput.value;
            buscarArticulos(termino);
        }
    });
}
function buscarArticulos(termino) {
    var tableContent = document.querySelector('tbody');
    if (tableContent) {
        tableContent.innerHTML = "";
        arrayResultados.forEach(function (registro) {
            var nombre = registro.children[1].innerHTML.toLowerCase();
            var nro = parseInt(registro.children[2]);
            if (nombre.indexOf(termino.toLowerCase()) !== -1) {
                tableContent.appendChild(registro);
            }
            console.log(nro);
            if (nro == parseInt(termino)) {
                tableContent.appendChild(registro);
            }
        });
    }
}
