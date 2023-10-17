package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    Connection conn;
    private static final String URL = "jdbc:mysql://localhost:3306/jsp";
    private static final String USUARIO = "root";
    private static final String CONTRASENA = "";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    
    public Connection getConexion() throws SQLException, ClassNotFoundException{
       
        try {
            
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, USUARIO, CONTRASENA);
            conn.setAutoCommit(false);
            System.out.println("[OK] Conexion Creada");
            
        } catch (SQLException ex){
            System.out.println("[ERROR] " + ex.getMessage());
        }
        
        
        return conn;
        
    }
    
}
