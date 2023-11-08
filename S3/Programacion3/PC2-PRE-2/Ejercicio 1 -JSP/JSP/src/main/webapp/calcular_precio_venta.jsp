<%-- 
    Document   : calcular_precio_venta
    Created on : 8 nov. 2023, 16:02:18
    Author     : bleussa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Formulario</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
    </head>
    <body>
        <div class="container mt-5">
            <h1>Costos</h1>
            <%
                int codigo = Integer.parseInt(request.getParameter("codigo"));
                String nombreArticulo = request.getParameter("nombreArticulo");
                String fechaVencimiento = request.getParameter("fechaVencimiento");
                
                double precioCosto = Double.parseDouble(request.getParameter("precioCosto"));
                double margenGanancia = Double.parseDouble(request.getParameter("margenGanancia"));
                double montoIVA = Double.parseDouble(request.getParameter("montoIVA"));
                double precioVenta = precioCosto * (1 + margenGanancia / 100) * (1 + montoIVA / 100);
            %>

            <p>Resultado para el artículo: <%= nombreArticulo %></p>
            <p>Código: <%= codigo %></p>
            <p>Precio de Costo: $<%= precioCosto %></p>
            <p>Margen de Ganancia: <%= margenGanancia %>%</p>
            <p>Fecha de Vencimiento: <%= fechaVencimiento %></p>
            <p>Monto de IVA: <%= montoIVA %>%</p>
            <p>Precio de Venta: $<%= precioCosto %> + $<%= (precioCosto * margenGanancia / 100) %> + $<%= (precioCosto * montoIVA / 100) %> = $<%= precioVenta %></p>

            <a href="index.html">Volver al Formulario</a>
        </div>
    </body>
</html>
