<%-- 
    Document   : ejercicio1a
    Created on : 14 oct. 2023, 15:49:41
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
            <table class="table">
                <tbody>
                <% 
                    int filaNro = 0;
                    int columnaNro = 0;
                    if (request.getParameter("fila") != null){
                        String fila = request.getParameter("fila");
                        filaNro = Integer.parseInt(fila);
                    }
                    if (request.getParameter("columna") != null){
                        String columna = request.getParameter("columna");
                        columnaNro = Integer.parseInt(columna);
                    }
                    
                    for (int i = 0; i < filaNro; i++){
                        out.print("<tr>");
                        for (int j = 0; j < columnaNro; j++){
                            out.print("<td>" + (i+1) + "." + (j+1) + "</td>");
                        }
                        out.print("</tr>");
                    }
                %>
                </tbody>
            </table>
        </div>
    </body>
</html>
