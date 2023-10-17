<%-- 
    Document   : ejercicio2
    Created on : 14 oct. 2023, 19:05:29
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
            <h1>Formulario de Carga</h1>
            <form action="ejercicio2a.jsp">
                <div class="form-group">
                  <label for="id">ID</label>
                  <input type="email" class="form-control" id="id" name="id" readonly>
                </div>
                <div class="form-group">
                  <label for="dni">DNI</label>
                  <input type="number" class="form-control" id="dni" placeholder="DNI" name="dni" maxlength="11">
                </div>
                <div class="form-group">
                  <label for="nombre">Nombre</label>
                  <input type="text" class="form-control" id="nombre" placeholder="Nombre" name="nombre">
                </div>
                <div class="form-group">
                  <label for="domicilio">Domicilio</label>
                  <input type="text" class="form-control" id="domicilio" placeholder="Domicilio" name="domicilio">
                </div>
                <button type="submit" class="btn btn-primary">Enviar</button>
              </form>
        </div>
    </body>
</html>
