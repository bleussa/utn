const btnGuardar = document.querySelector('.cargar');
const tabla = document.querySelector('tbody');
const codigosGuardados = [];

btnGuardar.addEventListener("click", (ev) => {
    ev.preventDefault();
    cargarDatos();
})

function cargarDatos() {
    let legajo = document.getElementById('legajo').value;
    let nombre = document.getElementById('nombre').value;
    let codigoBono = document.getElementById('codigoBono').value;
    let mes = document.getElementById('mes').value;
    let anio = document.getElementById('anio').value;
    let total = document.getElementById('total').value;

    let datos = {legajo, nombre, codigoBono, mes, anio, total};
    for (const dato in datos) {
        if (datos[dato] == null || datos[dato] == "") {
            mostrarMensaje('error', 'Datos incompletos.');
            return;
        }
    }

    let datosNumericos = {legajo, total, anio};
    for (const datoNumerico in datosNumericos) {
        if (!parseInt(datosNumericos[datoNumerico])) {
            mostrarMensaje('error', 'No se puede parsear el numero (' + datoNumerico + ').');
            return;
        }
    }

    if (anio > 2023) {
        mostrarMensaje('error', 'El año no puede ser mayor al actual.');
        return;
    }

    if (total <= 0) {
        mostrarMensaje('error', 'El total debe se mayor que 0.');
        return;
    }
    
    if (codigosGuardados.includes(codigoBono)){
        mostrarMensaje('error', 'El codigo ya se encuentra registrado.');
        return;
    } else {
        codigosGuardados.push(codigoBono);
    }


    mostrarMensaje('okay', 'Datos cargados correctamente');
    imprimirRegistro(datos);
}

function mostrarMensaje(tipo, mensaje) {
    const mensajeContainer = document.querySelector('.mensaje');
    if (tipo == 'error') {
        mensajeContainer.classList.add('show');
        mensajeContainer.setAttribute('tipo-mensaje', 'error');
        mensajeContainer.children[0].innerHTML = 'Error!';
        console.log('ERROR');
    } else if (tipo == 'okay'){
        mensajeContainer.classList.add('show');
        mensajeContainer.setAttribute('tipo-mensaje', 'okay');
        mensajeContainer.children[0].innerHTML = 'Excelente!';
        console.log('OK');
    }
    mensajeContainer.children[1].innerHTML = mensaje;
    setTimeout(() => {
        mensajeContainer.classList.remove('show');
    }, 5000);
}

function imprimirRegistro(datos) {
    let tr = document.createElement('tr');
    tr.innerHTML = `
        <td>${datos.legajo}</td>
        <td>${datos.nombre}</td>
        <td>${datos.codigoBono}</td>
        <td>${datos.mes}</td>
        <td>${datos.anio}</td>
        <td>${datos.total}</td>
    `
    tabla.appendChild(tr);
}