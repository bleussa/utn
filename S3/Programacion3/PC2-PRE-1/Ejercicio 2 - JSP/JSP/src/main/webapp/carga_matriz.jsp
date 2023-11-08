<%-- 
    Document   : carga_matriz
    Created on : 8 nov. 2023, 00:09:39
    Author     : bleussa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
    </head>
    <body>
        <div class="container mt-5">
            <h1>JSP</h1>
            <form action="genera_matriz.jsp">
                <input type="number" name="nroImpar" id="numeroIngresado" placeholder="Numero Impar">
                <input type="submit">
            </form>
        </div>
        <script>
            let boton = document.querySelector('input[type=submit]');
            boton.addEventListener("click", (event) => {
                let nro = document.querySelector('#numeroIngresado').value;
                if (nro % 2 == 0){
                    event.preventDefault();
                    alert(`El numero ingresado no es valido.`)
                }
            });
        </script>
    </body>
</html>
