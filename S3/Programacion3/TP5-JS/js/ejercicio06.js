const btn = document.getElementById("modalBtn");
const modal = document.querySelector(".modal");
const modalClose = document.querySelector(".close");

btn.addEventListener("click", () => {
    modal.classList.toggle("visible");
})

modalClose.addEventListener("click", () => {
    modal.classList.toggle("visible");
})