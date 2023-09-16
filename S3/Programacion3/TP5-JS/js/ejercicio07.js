const numero = document.getElementById("numero");

numero.addEventListener("dblclick", () => {
    numero.innerHTML = parseInt(numero.textContent) * 2;
})