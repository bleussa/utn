
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import util.Conexion;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bleussa
 */
public class Main {
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        
        
        Conexion conexion = new Conexion();
        Connection conn = conexion.getConexion();
        PreparedStatement ps;
        
        if (conn == null){
            System.out.println("null");
        }
        
        
    }
    
}
