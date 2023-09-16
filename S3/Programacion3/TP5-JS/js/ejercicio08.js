const visor = document.getElementById('visor');
const botones = document.querySelectorAll('button');
let primerTermino = null;
let segundoTermino = null;
let operacion = null;

botones.forEach((boton) => {
    boton.addEventListener("click", () => {
        if (parseInt(boton.innerText)){
            visor.innerHTML += parseInt(boton.innerText);
        } else {
            if (primerTermino == null){
                boton.classList.add('active');
                primerTermino = parseInt(visor.innerHTML);
                operacion = boton.innerHTML;
                visor.innerHTML = "";
            } else {
                segundoTermino = parseInt(visor.innerHTML);
                switch (operacion) {
                    case "X":
                        visor.innerHTML = primerTermino * segundoTermino;
                        break;
                    case "/":
                        visor.innerHTML = primerTermino / segundoTermino;
                        break;
                    case "-":
                        visor.innerHTML = primerTermino - segundoTermino;
                        break;
                    case "+":
                        visor.innerHTML = primerTermino + segundoTermino;
                        break;
                }
            }
        }
        boton.classList.remove('active');
        console.log("TERMINO 1 = " + primerTermino);
        console.log("TERMINO 2 = " + segundoTermino);
        console.log("OPERACION = " + operacion)
    })
})