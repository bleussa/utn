<%-- 
    Document   : ejercicio1
    Created on : 14 oct. 2023, 15:19:37
    Author     : bleussa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>TP JSP</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>
    <body>
        <div class="container" style="margin-top: 50px;">
            <a href="index.jsp">Volver atrás</a>
            <p>Poné la cantidad de filas y columnas</p>
            <form action="ejercicio1a.jsp">
                <input type="number" name="fila" placeholder="Filas">
                <input type="number" name="columna" placeholder="Columnas">
                <input type="submit">
            </form>
        </div>
        
        
    </body>
</html>
