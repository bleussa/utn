package conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    Connection conn;
    String url = "jdbc:mysql://";
    String user = "root";
    String pass = "";
    String host = "localhost";
    String port = "3306";
    String db = "pcsql";
    String driver = "com.mysql.cj.jdbc.Driver";

    public Connection getConnection(){
        // VALIDAMOS QUE NO EXISTA OTRA CONEXION (SINGLETONE)
        if (conn != null){
            return conn;
        }

        // INTENTAMOS HACER UNA CONEXION
        try{
            // TRAEMOS EL DRIVER
            Class.forName(driver);

            // CREAMOS EL LINK DE LA CONEXION
            String urlConnection = url + host + ":" + port + "/" + db;

            // CREAMOS LA CONEXION AGREGANDO usuario Y contrasenia
            conn = DriverManager.getConnection(urlConnection, user, pass);

            conn.setAutoCommit(false);

        } catch (Exception ex){
            System.out.println("[ERROR] " + ex.getMessage());
        }

        // System.out.println("[MENSAJE] Conexion creada correctamente!");
        return conn;
    }

    public void closeConnection(){
        if (conn != null){
            try {
                conn.close();
            } catch (Exception ex){
                System.out.println("[ERROR] " + ex.getMessage());
            }
        } else {
            System.out.println("[INFO] No existen conexiones abiertas!");
        }
    }

}
