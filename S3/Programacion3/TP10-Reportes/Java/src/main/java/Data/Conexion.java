package Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static Connection connection = null;

    public static Connection getConnection() throws ClassNotFoundException {
        try {
            if (connection == null || connection.isClosed()) {

                Class.forName("com.mysql.jdbc.Driver");
                String URL = "jdbc:mysql://localhost:3306/world";
                String USER = "root";
                String PASSWORD = "";

                connection = DriverManager.getConnection(URL, USER, PASSWORD);
            }

        } catch (SQLException e) {
            System.out.println("[ERROR] " + e.getMessage());
        }
        return connection;
    }
}
