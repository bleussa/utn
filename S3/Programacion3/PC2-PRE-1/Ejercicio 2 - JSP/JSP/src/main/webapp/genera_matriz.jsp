<%-- 
    Document   : genera_matriz
    Created on : 8 nov. 2023, 00:22:03
    Author     : bleussa
--%>

<%@page import="java.util.Random"%>
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
            <%
            
                Random rand = new Random();
                int valorIngresado = Integer.parseInt(request.getParameter("nroImpar"));
                int[][] matriz1 = new int[valorIngresado][valorIngresado];
                
                for (int i = 0; i < matriz1.length; i++){
                    for (int j = 0; j < matriz1[0].length; j++){
                        matriz1[i][j] = rand.nextInt(99);
                    }
                }
                
                int[][] matriz2 = new int[2][valorIngresado];
                
                // COLUMNAS
                int sumaColumnaTotal = 0;
                for (int j = 0; j < valorIngresado; j++) {
                    int sumaColumna = 0;
                    for (int i = 0; i < valorIngresado; i++) {
                        sumaColumna += matriz1[i][j];
                    }
                    matriz2[0][j] = sumaColumna;
                    sumaColumnaTotal += sumaColumna;
                }

                // FILAS
                int sumaFilaTotal = 0;
                for (int i = 0; i < valorIngresado; i++) {
                    int sumaFila = 0;
                    for (int j = 0; j < valorIngresado; j++) {
                        sumaFila += matriz1[i][j];
                    }
                    matriz2[1][i] = sumaFila;
                    sumaFilaTotal += sumaFila;
                }
                
                out.print("<table class='table'>");
                for (int i = 0; i < matriz1.length; i++){
                    out.print("<tr>");
                    for (int j = 0; j < matriz1[0].length; j++){
                        out.print("<td>" + matriz1[i][j] + "</td>");
                    }
                    out.print("</tr>");
                }
                out.print("</table>");
                
                out.print("<h2>Matriz resultante</h2>");
                
                out.print("<table class='table'>");
                for (int i = 0; i < matriz2.length; i++){
                    out.print("<tr>");
                    for (int j = 0; j < matriz2[0].length; j++){
                        out.print("<td>" + matriz2[i][j] + "</td>");
                    }
                    out.print("</tr>");
                }
                out.print("</table>");
                out.print("<p>La suma de columnas es: " + sumaColumnaTotal + "</p>");
                out.print("<p>La suma de filas es: " + sumaFilaTotal + "</p>");
            %>
        </div>
    </body>
</html>
