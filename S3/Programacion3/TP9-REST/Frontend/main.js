function cargarAgendas() {
    var tableContent = document.querySelector('tbody');
    if (tableContent) {
        fetch("http://localhost:4000/agendas")
            .then(function (response) { return response.json(); })
            .then(function (result) { return imprimirAgendas(result, tableContent); })
            .catch(function (error) { return console.log('Error:', error); });
    }
}
function cargarAgenda(id, form) {
    fetch("http://localhost:4000/agendas/".concat(id))
        .then(function (response) { return response.json(); })
        .then(function (result) { return cargarFormulario(result, form); })
        .catch(function (error) { return console.log('Error:', error); });
}
function cargarFormulario(result, form) {
    var inputElements = form.querySelectorAll('input');
    cargarTipoHTTP(form, false);
    for (var _i = 0, inputElements_1 = inputElements; _i < inputElements_1.length; _i++) {
        var input = inputElements_1[_i];
        var dato = input.getAttribute('id');
        if (dato in result) {
            input.value = result[dato];
        }
    }
}
function cargarTipoHTTP(form, isPOST) {
    var buttonAction = form.querySelector('#buttonAction');
    buttonAction.removeEventListener("click", buttonHandler);
    if (isPOST) {
        buttonAction.innerHTML = 'Guardar';
    }
    else {
        buttonAction.innerHTML = 'Actualizar';
    }
    buttonAction.addEventListener("click", buttonHandler);
}
function buttonHandler(e) {
    e.preventDefault();
    var buttonAction = e.target;
    var form = document.querySelector('form');
    if (buttonAction.innerHTML === 'Guardar') {
        var data = {
            nombre: document.querySelector("#nombre").value,
            apellido: document.querySelector("#apellido").value,
            telefono: document.querySelector("#telefono").value,
            email: document.querySelector("#email").value,
            domicilio: document.querySelector("#domicilio").value
        };
        console.log(data);
        fetch('http://localhost:4000/agendas/', {
            method: 'POST',
            body: JSON.stringify(data),
            headers: {
                'Content-Type': 'application/json'
            }
        })
            .then(function (response) {
            location.reload();
        })
            .catch(function (error) {
            console.error('Error:', error);
        });
    }
    else {
        var id = document.querySelector("#id").value;
        var data = {
            nombre: document.querySelector("#nombre").value,
            apellido: document.querySelector("#apellido").value,
            telefono: document.querySelector("#telefono").value,
            email: document.querySelector("#email").value,
            domicilio: document.querySelector("#domicilio").value
        };
        fetch("http://localhost:4000/agendas/".concat(id), {
            method: 'PUT',
            body: JSON.stringify(data),
            headers: {
                'Content-Type': 'application/json'
            }
        })
            .then(function (response) {
            location.reload();
        })
            .catch(function (error) {
            console.error('Error:', error);
        });
    }
}
function limpiarFormulario(form) {
    var inputElements = form.querySelectorAll('input');
    inputElements.forEach(function (input) {
        input.value = "";
    });
}
function imprimirAgendas(result, tabla) {
    result.forEach(function (agenda) {
        var tr = document.createElement('tr');
        for (var valor in agenda) {
            var td = document.createElement('td');
            td.textContent = agenda[valor];
            tr.appendChild(td);
        }
        var actionButtons = document.createElement('td');
        var modBtn = crearBoton('Modificar', 'modificarRegistro', agenda.id);
        var delBtn = crearBoton('Eliminar', 'eliminarRegistro', agenda.id);
        actionButtons.appendChild(modBtn);
        actionButtons.appendChild(delBtn);
        tr.appendChild(actionButtons);
        tabla.appendChild(tr);
    });
    cargarDOM();
}
function crearBoton(texto, id, agendaId) {
    var btn = document.createElement('button');
    btn.textContent = texto;
    btn.id = id;
    btn.setAttribute('agenda', agendaId);
    return btn;
}
function cargarDOM() {
    var btnCrearRegistro = document.getElementById('crearRegistro');
    var btnModificarRegistro = document.querySelectorAll('#modificarRegistro');
    var btnEliminarRegistro = document.querySelectorAll('#eliminarRegistro');
    var btnCerrarVentana = document.querySelectorAll('#cerrarVentana');
    var modalContainer = document.querySelector('.modalContainer');
    btnCerrarVentana.forEach(function (btn) {
        btn.addEventListener('click', function () {
            modalContainer.classList.remove('active');
            modalContainer.children[0].classList.remove('active');
            modalContainer.children[1].classList.remove('active');
        });
    });
    btnCrearRegistro === null || btnCrearRegistro === void 0 ? void 0 : btnCrearRegistro.addEventListener('click', function () {
        limpiarFormulario(modalContainer.children[0]);
        cargarTipoHTTP(modalContainer.children[0], true);
        modalContainer.classList.add('active');
        modalContainer.children[0].classList.add('active');
    });
    btnModificarRegistro.forEach(function (btn) {
        btn.addEventListener('click', function () {
            cargarAgenda(parseInt(btn.getAttribute('agenda')), modalContainer.children[0]);
            modalContainer.classList.add('active');
            modalContainer.children[0].classList.add('active');
        });
    });
    btnEliminarRegistro.forEach(function (btn) {
        btn.addEventListener('click', function () {
            fetch("http://localhost:4000/agendas/".concat(btn.getAttribute('agenda')), {
                method: 'DELETE',
                headers: {
                    'Content-Type': 'application/json'
                }
            })
                .then(function (response) {
                location.reload();
            })
                .catch(function (error) {
                console.error('Error:', error);
            });
        });
    });
}
cargarAgendas();
