package controlador;

import conexion.Conexion;
import entidades.Componente;
import entidades.Computadora;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControladorComputadoras {

    // CREAMOS UNA CONEXION A LA BD
    Conexion conexion = new Conexion();
    Connection conn = conexion.getConnection();

    // METODO PARA CREAR UNA COMPUTADORA
    public void createComputadora() throws SQLException {
        Scanner sc = new Scanner(System.in);
        String sqlQuery = "INSERT INTO computadora (codigo,marca,modelo) VALUES (?, ?, ?)";
        String sqlQueryComponente = "INSERT INTO componente (id,nombre,nro_serie,fk_computadora) VALUES (?. ?, ?, ?)";
        PreparedStatement ps = null;
        PreparedStatement psComponente = null;

        try {
            ps = conn.prepareStatement(sqlQuery);

            System.out.println("[MENSAJE] Creando una computadora...");
            System.out.println("[DATO] Codigo:");
            String codigo = sc.nextLine();
            System.out.println("[DATO] Marca:");
            String marca = sc.nextLine();
            System.out.println("[DATO] Modelo:");
            String modelo = sc.nextLine();

            ps.setString(1, codigo);
            ps.setString(2, marca);
            ps.setString(3, modelo);
            ps.executeUpdate();

            psComponente = conn.prepareStatement(sqlQueryComponente);
            System.out.println("[MENSAJE] Creando un componente...");
            System.out.println("[DATO] ID:");
            int id = sc.nextInt();
            System.out.println("[DATO] Nombre:");
            String nombre = sc.next();
            System.out.println("[DATO] Numero de serie:");
            String nroSerie = sc.next();
            System.out.println("[DATO] ID Computadora:");
            int idComputadora = sc.nextInt();
            psComponente.setInt(1, id);
            psComponente.setString(2, nombre);
            psComponente.setString(3, nroSerie);
            psComponente.setInt(4, idComputadora);
            psComponente.executeUpdate();

            conn.commit();

        } catch (Exception ex){
            conn.rollback();
            System.out.println("[ERROR] " + ex.getMessage());
        } finally {
            if (ps != null){
                ps.close();
            }
        }
    }

    // METODO PARA TRAER COMPUTADORA POR ID
    public Computadora getComputadoraById(long id){
        Computadora computadora = null;
        ResultSet rs = null;
        String sqlQuery = "SELECT * FROM computadora WHERE id='" + id + "';";

        try {

            Statement statement = conn.createStatement();
            rs = statement.executeQuery(sqlQuery);

            if (rs.next()){
                computadora = new Computadora();
                computadora.setId(rs.getInt(1));
                computadora.setCodigo(rs.getString(2));
                computadora.setMarca(rs.getString(3));
                computadora.setModelo(rs.getString(4));
            }

        } catch (Exception ex){
            System.out.println("[ERROR] " + ex.getMessage());
        }

        return computadora;
    }

    // METODO PARA TRAER TODAS LAS COMPUTADORAS
    public List<Computadora> getComputadoras(){
        List<Computadora> computadoras = new ArrayList<>();
        ResultSet rs = null;
        String sqlQuery = "SELECT * FROM computadora";

        try {
            Statement statement = conn.createStatement();
            rs = statement.executeQuery(sqlQuery);

            while (rs.next()){
                Computadora computadora = new Computadora();

                computadora.setId(rs.getInt(1));
                computadora.setCodigo(rs.getString(2));
                computadora.setMarca(rs.getString(3));
                computadora.setModelo(rs.getString(4));

                computadoras.add(computadora);
            }
        } catch (Exception ex) {
            System.out.println("[ERROR] " + ex.getMessage());
        }
        return computadoras;
    }

}
