<%-- 
    Document   : ejercicio2a
    Created on : 14 oct. 2023, 20:18:01
    Author     : bleussa
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="util.Conexion"%>
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
            <h2>Listado de Personas</h2>
            <table class="table table-striped">
                <thead class="thead-dark">
                    <tr>
                        <th scope="col">ID</th>
                        <th scope="col">DNI</th>
                        <th scope="col">Nombre</th>
                        <th scope="col">Domicilio</th>
                      </tr>
                </thead>
                <tbody>
            <% 
                
                
                try {
                    // TRAEMOS LA CONEXION
                        Conexion conexion = new Conexion();
                        Connection conn = conexion.getConexion();
                        ResultSet rs;

                    // LOS INSERTAMOS EN LA BASE DE DATOS
                        String sqlQuery = "SELECT * FROM persona;";
                        Statement st = conn.createStatement();
                        rs = st.executeQuery(sqlQuery); 
                        
                        while (rs.next()){
                        
                            out.print("<tr>");
                            out.print("<td>" + rs.getString(1) + "</td>");
                            out.print("<td>" + rs.getString(2) + "</td>");
                            out.print("<td>" + rs.getString(3) + "</td>");
                            out.print("<td>" + rs.getString(4) + "</td>");
                            out.print("</tr>");
                        
                        }
                        
                        
                } catch (Exception ex){
                    out.print("[ERROR] " + ex.getMessage());
                }
            %>
                <tbody>
            </table>
        </div>
    </body>
</html>
