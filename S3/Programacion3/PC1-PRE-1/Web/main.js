const btnGuardar = document.querySelector('.cargar');
const tabla = document.querySelector('tbody');
const codigosGuardados = [];

btnGuardar.addEventListener("click", (ev) => {
    ev.preventDefault();
    cargarDatos();
})

function cargarDatos() {
    let tiempoFacturación = document.getElementById('tiempoFacturacion').value;
    let denominacion = document.getElementById('denominacion').value;
    let codigo = document.getElementById('codigo').value;
    let precioVenta = document.getElementById('precioVenta').value;
    let margenGanancia = document.getElementById('margenGanancia').value;
    let rubro = document.getElementById('rubro').value;

    let datos = {tiempoFacturación, denominacion, codigo, precioVenta, margenGanancia, rubro};
    for (const dato in datos) {
        if (datos[dato] == null || datos[dato] == "") {
            mostrarMensaje('error', 'Datos incompletos.');
            return;
        }
    }

    let datosNumericos = {tiempoFacturación, precioVenta, margenGanancia};
    for (const datoNumerico in datosNumericos) {
        if (!parseInt(datosNumericos[datoNumerico])) {
            mostrarMensaje('error', 'No se puede parsear el numero (' + datoNumerico + ').');
            return;
        }
    }

    if (codigo.match(" ")) {
        mostrarMensaje('error', 'El codigo no debe tener espacios.');
        return;
    }
    
    if (codigosGuardados.includes(codigo)){
        mostrarMensaje('error', 'El codigo ya se encuentra registrado.');
        return;
    } else {
        codigosGuardados.push(codigo);
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
        <td>${datos.codigo}</td>
        <td>${datos.denominacion}</td>
        <td>${datos.precioVenta}</td>
        <td>${datos.margenGanancia}%</td>
        <td>${datos.tiempoFacturación}</td>
        <td>${datos.rubro}</td>
    `
    tabla.appendChild(tr);
}