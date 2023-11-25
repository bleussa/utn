<%-- 
    Document   : index
    Created on : 15 nov. 2023, 20:19:39
    Author     : bleussa
--%>
<%@page import="Data.DAO"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>TP N°10</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
    </head>
    <body>
        <div class="container mt-5">
            <h1 style="margin-bottom: 20px">Generador de reportes</h1>
            <form action="GenerarReporte" method="post">
                <div class="row">
                    <div class="col">
                        <label for="pais" class="form-label">País:</label>
                        <input type="text" id="pais" name="pais" class="form-control" required>
                    </div>
                    <div class="col">
                        <label for="region" class="form-label">Región:</label>
                        <select id="region" name="region" class="form-select">
                            <%
                                DAO data = new DAO();

                                ArrayList<String> regiones = data.getRegiones();

                                if (regiones != null) {
                                    for (String region : regiones) {
                            %>
                                        <option value="<%= region%>"><%= region%></option>
                            <%
                                    }
                                }
                            %>
                        </select>
                    </div>
                    <div class="col">
                        <label for="pdf" style="margin: 0 5px 5px 0"><input type="radio" id="pdf" name="file-type" value="pdf" checked />PDF </label>
                        <label for="excel" style="margin: 0 5px 5px 0"><input type="radio" id="excel" name="file-type" value="excel" />XLSX</label>
                    </div>
                    <div class="col">
                        <input type="submit" class="btn btn-primary" value="Generar">
                    </div>
                </div>
            </form>
        </div>
    </body>
</html>
