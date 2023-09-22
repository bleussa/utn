const visor = document.getElementById('visor');
const botones = document.querySelectorAll('button');
const terminos = document.querySelector('.terminos');
const operacionKey = ['*', '/', '+', '-'];
let primerTermino = null;
let segundoTermino = null;
let operacion = null;
let resultado = null;


document.addEventListener("keypress", function(event) {

    if (parseInt(event.key)) {
        visor.innerHTML += event.key;
    } else if (operacionKey.includes(event.key)){
        console.log(event.key);
    }
})

botones.forEach((boton) => {

    boton.addEventListener("click", (event) => {
        
        event.preventDefault();

        if (parseFloat(boton.innerHTML) || boton.innerHTML == "0") {
            visor.innerHTML += boton.innerHTML;
        }

        if (!parseFloat(boton.innerHTML) && boton.innerHTML != "0" && boton.innerHTML != "C" && boton.innerHTML != "=") {
            
            if (primerTermino == null) {
                primerTermino = parseFloat(visor.innerHTML);
                if (!parseFloat(primerTermino)) {
                    primerTermino = 0;
                }
                operacion = boton.innerHTML;
                agregarTerminos(primerTermino);
                agregarTerminos(operacion);
                visor.innerHTML = "";
            }
            
        }

        if (boton.innerHTML == "=") {
            segundoTermino = parseFloat(visor.innerHTML);
            agregarTerminos(segundoTermino);
            visor.innerHTML = calc(primerTermino, segundoTermino, operacion);
            primerTermino = null;
            segundoTermino = null;
            operacion = null;
        }

        if (boton.innerHTML == "C") {
            primerTermino == null;
            segundoTermino == null;
            visor.innerHTML = "";
            terminos.innerHTML = "";
        }
    })
})

function calc(pT, sT, op) {
    switch (op) {
        case "X":
            return pT * sT;
        case "/":
            return pT / sT;
        case "-":
            return pT - sT;
        case "+":
            return pT + sT;
    }
}

function agregarTerminos(texto) {
    if (terminos.children.length <= 2) {
        terminos.innerHTML += "<p>" + texto + "</p>";
    }
    else {
        terminos.innerHTML = "";
        terminos.innerHTML += "<p>" + texto + "</p>";
    }
}