package Data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAO {

    public ArrayList<String> getRegiones() throws ClassNotFoundException {
        Connection conn = null;

        if (conn == null) {
            conn = Conexion.getConnection();
        }
        
        ArrayList<String> regiones = new ArrayList<>();

        try {
            String sqlQuery = "SELECT DISTINCT region FROM country;";
            PreparedStatement ps = conn.prepareStatement(sqlQuery);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                String region = rs.getString("region");
                regiones.add(region);
            }
            
            if (rs != null) {
                rs.close();
            }
            
            if (ps != null) {
                ps.close();
            }
            
            conn.close();
            conn = null;

        } catch (SQLException e) {
            System.out.println("[ERROR] " + e.getMessage());
        }
        
        return regiones;
    }
    
    public ArrayList<String[]> getRegiones(String region, String nombre) throws ClassNotFoundException {
        Connection conn = null;

        if (conn == null) {
            conn = Conexion.getConnection();
        }
        
        ArrayList<String[]> regiones = new ArrayList<>();

        try {
            String sqlQuery = "SELECT ciudad.name, ciudad.population, pais.name, pais.region FROM city ciudad INNER JOIN country pais ON ciudad.CountryCode = pais.code WHERE pais.region = ? AND pais.name LIKE ? ORDER BY pais.name";
            PreparedStatement ps = conn.prepareStatement(sqlQuery);
            ps.setString(1, region);
            ps.setString(2, "%" + nombre + "%");
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                String[] row = new String[4];
                row[0] = rs.getString("ciudad.name");
                row[1] = rs.getString("ciudad.population");
                row[2] = rs.getString("pais.name");
                row[3] = rs.getString("pais.region");
                regiones.add(row);
            }
            
            if (rs != null) {
                rs.close();
            }
            
            if (ps != null) {
                ps.close();
            }
            
            conn.close();
            conn = null;

        } catch (SQLException e) {
            System.out.println("[ERROR] " + e.getMessage());
        }
        return regiones;
    }
}