<%-- 
    Document   : ejercicio2a
    Created on : 14 oct. 2023, 20:18:01
    Author     : bleussa
--%>

<%@page import="java.sql.PreparedStatement"%>
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
            <% 
                
                
                try {
                    // TRAEMOS LA CONEXION
                        Conexion conexion = new Conexion();
                        Connection conn = conexion.getConexion();
                        PreparedStatement ps;
                    
                    // TRAEMOS LOS VALORES DEL FORMULARIO
                        int dni = Integer.parseInt(request.getParameter("dni"));
                        String nombre = request.getParameter("nombre");
                        String domicilio = request.getParameter("domicilio");

                    // LOS INSERTAMOS EN LA BASE DE DATOS
                        String sqlQuery = "INSERT INTO persona (dni, nombre, domicilio) VALUES (?, ?, ?);";
                        ps = conn.prepareStatement(sqlQuery);
                        ps.setInt(1, dni);
                        ps.setString(2, nombre);
                        ps.setString(3, domicilio);
                        out.println("<h2>Información guardada correctamente</h2>");
                        ps.executeUpdate();
                        conn.commit();
                        
                } catch (Exception ex){
                    out.print("[ERROR] " + ex.getMessage());
                }
            %>
        </div>
    </body>
</html>
