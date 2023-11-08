function cargarAgendas() {
    const tableContent = document.querySelector('tbody');
    if (tableContent) {
        fetch("http://localhost:4000/agendas")
            .then(response => response.json())
            .then(result => imprimirAgendas(result, tableContent))
            .catch(error => console.log('Error:', error));
    }
}

function cargarAgenda(id, form) {
    fetch(`http://localhost:4000/agendas/${id}`)
        .then(response => response.json())
        .then(result => cargarFormulario(result, form))
        .catch(error => console.log('Error:', error));
}

function cargarFormulario(result, form) {
    const inputElements = form.querySelectorAll('input');

    cargarTipoHTTP(form, false);

    for (const input of inputElements) {
        const dato = input.getAttribute('id');
        if (dato in result) {
            input.value = result[dato];
        }
    }
}

function cargarTipoHTTP(form, isPOST) {
    const buttonAction = form.querySelector('#buttonAction');
    
    buttonAction.removeEventListener("click", buttonHandler);

    if (isPOST) {
        buttonAction.innerHTML = 'Guardar';
    } else {
        buttonAction.innerHTML = 'Actualizar';
    }

    buttonAction.addEventListener("click", buttonHandler);
}

function buttonHandler(e) {
    e.preventDefault();
    const buttonAction = e.target;
    const form = document.querySelector('form');

    if (buttonAction.innerHTML === 'Guardar') {

        const data = {
            nombre: (<HTMLInputElement>document.querySelector("#nombre")).value,
            apellido: (<HTMLInputElement>document.querySelector("#apellido")).value,
            telefono: (<HTMLInputElement>document.querySelector("#telefono")).value,
            email: (<HTMLInputElement>document.querySelector("#email")).value,
            domicilio: (<HTMLInputElement>document.querySelector("#domicilio")).value
        };

        console.log(data);

        fetch('http://localhost:4000/agendas/', {
            method: 'POST',
            body: JSON.stringify(data),
            headers: {
                'Content-Type': 'application/json'
            }
        })
        .then(response => {
            location.reload();
        })
        .catch(error => {
            console.error('Error:', error);
        });
    } else {
        let id = (<HTMLInputElement>document.querySelector("#id")).value;

        const data = {
            nombre: (<HTMLInputElement>document.querySelector("#nombre")).value,
            apellido: (<HTMLInputElement>document.querySelector("#apellido")).value,
            telefono: (<HTMLInputElement>document.querySelector("#telefono")).value,
            email: (<HTMLInputElement>document.querySelector("#email")).value,
            domicilio: (<HTMLInputElement>document.querySelector("#domicilio")).value
        };

        fetch(`http://localhost:4000/agendas/${id}`, {
            method: 'PUT',
            body: JSON.stringify(data),
            headers: {
                'Content-Type': 'application/json'
            }
        })
        .then(response => {
            location.reload();
        })
        .catch(error => {
            console.error('Error:', error);
        });
    }
}


function limpiarFormulario(form) {
    const inputElements = form.querySelectorAll('input');
    inputElements.forEach(input => {
        input.value = "";
    });
}

function imprimirAgendas(result, tabla) {
    result.forEach(agenda => {
        const tr = document.createElement('tr');
        for (const valor in agenda) {
            const td = document.createElement('td');
            td.textContent = agenda[valor];
            tr.appendChild(td);
        }

        const actionButtons = document.createElement('td');
        const modBtn = crearBoton('Modificar', 'modificarRegistro', agenda.id);
        const delBtn = crearBoton('Eliminar', 'eliminarRegistro', agenda.id);
        
        actionButtons.appendChild(modBtn);
        actionButtons.appendChild(delBtn);
        
        tr.appendChild(actionButtons);
        tabla.appendChild(tr);
    });

    cargarDOM();
}

function crearBoton(texto, id, agendaId) {
    const btn = document.createElement('button');
    btn.textContent = texto;
    btn.id = id;
    btn.setAttribute('agenda', agendaId);
    return btn;
}

function cargarDOM() {
    const btnCrearRegistro = document.getElementById('crearRegistro');
    const btnModificarRegistro = document.querySelectorAll('#modificarRegistro');
    const btnEliminarRegistro = document.querySelectorAll('#eliminarRegistro');
    const btnCerrarVentana = document.querySelectorAll('#cerrarVentana');
    const modalContainer = document.querySelector('.modalContainer');

    btnCerrarVentana.forEach(btn => {
        btn.addEventListener('click', () => {
            modalContainer.classList.remove('active');
            modalContainer.children[0].classList.remove('active');
            modalContainer.children[1].classList.remove('active');
        });
    });

    btnCrearRegistro?.addEventListener('click', () => {
        limpiarFormulario(modalContainer.children[0]);
        cargarTipoHTTP(modalContainer.children[0], true);
        modalContainer.classList.add('active');
        modalContainer.children[0].classList.add('active');
    });

    btnModificarRegistro.forEach(btn => {
        btn.addEventListener('click', () => {
            cargarAgenda(parseInt(btn.getAttribute('agenda')), modalContainer.children[0]);
            modalContainer.classList.add('active');
            modalContainer.children[0].classList.add('active');
        });
    });

    btnEliminarRegistro.forEach(btn => {
        btn.addEventListener('click', () => {
            fetch(`http://localhost:4000/agendas/${btn.getAttribute('agenda')}`, {
                method: 'DELETE',
                headers: {
                    'Content-Type': 'application/json'
                }
            })
            .then(response => {
                location.reload();
            })
            .catch(error => {
                console.error('Error:', error);
            });
        });
    });
}

cargarAgendas();
