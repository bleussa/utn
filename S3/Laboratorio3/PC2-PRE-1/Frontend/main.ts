let arrayResultados = null;

function cargaArticulos() {
    let tableContent = document.querySelector('tbody');
    if (tableContent){
        fetch("http://localhost:3000/articulos")
            .then(response => response.json())
            .then(result => printArticulos(result, tableContent))
            .catch(error => console.log('error', error));
    }
}

function cargaArticulo(id:number, form:any) {
    fetch(`http://localhost:3000/articulos/${id}`)
        .then(response => response.json())
        .then(result => cargaFormulario(result, form))
        .catch(error => console.log('error', error));
}

function cargaFormulario(result: any, form:Element) {
    let inputElements = form.querySelectorAll('input');
    result = result.data;
    
    for (const input in inputElements) {
        for (const dato in result) {
            if (inputElements[input].getAttribute('id') == dato) {
                inputElements[input].value = result[dato];
            }
        }
    }
}

function limpiarFormulario(form:any) {
    let inputElements = form.querySelectorAll('input');
    inputElements.forEach(input => {
        input.value = "";
    });
}

function printArticulos(result:any, tabla:any) {
    result.data.forEach((articulo) => {
        let tr = document.createElement('tr');
        for (const valor in articulo) {
            let td = document.createElement('td');
            td.innerHTML = articulo[valor];
            tr.appendChild(td);
        }
        let actionButtons = document.createElement('td');

        let modBtn = document.createElement('button');
        modBtn.setAttribute('id', 'modificarRegistro');
        modBtn.setAttribute('articulo', articulo.id);
        modBtn.innerHTML = 'Modificar';
        actionButtons.appendChild(modBtn);

        let delBtn = document.createElement('button');
        delBtn.setAttribute('id', 'eliminarRegistro');
        delBtn.setAttribute('articulo', articulo.id);
        delBtn.innerHTML = 'Eliminar';
        actionButtons.appendChild(delBtn);

        tr.appendChild(actionButtons);

        tabla.appendChild(tr);
    })

    cargaDOM();
}

function cargaDOM() {
    var btnCrearRegistro = document.getElementById('crearRegistro');
    var btnModificarRegistro = document.querySelectorAll('#modificarRegistro');
    var btnEliminarRegistro = document.querySelectorAll('#eliminarRegistro');
    var btnCerrarVentana = document.querySelectorAll('#cerrarVentana');
    var modalContainer = document.querySelector('.modalContainer');

    btnCerrarVentana.forEach((btn) => {
        btn.addEventListener("click", () => {
            modalContainer?.classList.remove('active');
            modalContainer?.children[0].classList.remove('active');
            modalContainer?.children[1].classList.remove('active');
        })
    })

    btnCrearRegistro?.addEventListener("click", () => {
        limpiarFormulario(modalContainer?.children[0]);
        modalContainer?.classList.add('active');
        modalContainer?.children[0].classList.add('active');
    })

    btnModificarRegistro.forEach((btn) => {
        btn.addEventListener("click", () => {
            cargaArticulo(parseInt(btn.getAttribute('articulo')), modalContainer?.children[0])
            modalContainer?.classList.add('active');
            modalContainer?.children[0].classList.add('active');
        })
    })

    btnEliminarRegistro.forEach((btn) => {
        btn.addEventListener("click", () => {
            modalContainer?.classList.add('active');
            modalContainer?.children[1].classList.add('active');
        })
    })

    arrayResultados = document.querySelectorAll('tbody tr');
}

cargaArticulos();


const searchInput = document.getElementById('searchInput') as HTMLInputElement | null;
if (searchInput) {
    searchInput.addEventListener("keydown", (e) => {
        if (e.key === 'Enter') {
            let termino:string = searchInput.value
            buscarArticulos(termino);
        }
    });
}



function buscarArticulos(termino:string) {
    
    let tableContent = document.querySelector('tbody');

    if (tableContent) {
        tableContent.innerHTML = "";
        arrayResultados.forEach((registro) => {
            let nombre: string = registro.children[1].innerHTML.toLowerCase();
            let nro: number = parseInt(registro.children[2]);
            if (nombre.indexOf(termino.toLowerCase()) !== -1) {
                tableContent.appendChild(registro);
            }
            console.log(nro);
            if (nro == parseInt(termino)) {

                tableContent.appendChild(registro);
            }
        })
    }
}
