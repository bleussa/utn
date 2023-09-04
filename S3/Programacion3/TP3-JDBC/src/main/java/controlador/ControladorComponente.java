package controlador;

import conexion.Conexion;
import entidades.Componente;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControladorComponente {

    // CREAMOS UNA CONEXION A LA BD
    Conexion conexion = new Conexion();
    Connection conn = conexion.getConnection();

    // METODO PARA CREAR UN COMPONENTE
    public void createComponente(long idComputadora) throws SQLException {
        Scanner sc = new Scanner(System.in);
        String sqlQuery = "INSERT INTO componente (nombre,nro_serie,fk_computadora) VALUES (?, ?, ?)";
        PreparedStatement ps = null;

        try {
            ps = conn.prepareStatement(sqlQuery);

            System.out.println("[MENSAJE] Creando un componente...");
            System.out.println("[DATO] Nombre:");
            String nombre = sc.nextLine();
            System.out.println("[DATO] Numero de serie:");
            String nroSerie = sc.nextLine();

            ps.setString(1, nombre);
            ps.setString(2, nroSerie);
            ps.setLong(3, idComputadora);
            ps.executeUpdate();

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

    // METODO PARA TRAER COMPONENTE POR ID
    public Componente getComponenteById(long id){
        ControladorComputadoras ctrlComputadoras = new ControladorComputadoras();
        Componente componente = null;
        ResultSet rs = null;
        String sqlQuery = "SELECT * FROM componente WHERE id='" + id + "';";

        try {

            Statement statement = conn.createStatement();
            rs = statement.executeQuery(sqlQuery);

            if (rs.next()){
                componente = new Componente();
                componente.setId(rs.getInt(1));
                componente.setNombre(rs.getString(2));
                componente.setNroSerie(rs.getString(3));
                componente.setComputadora(ctrlComputadoras.getComputadoraById(rs.getInt("fk_computadora")));
            }

        } catch (Exception ex){
            System.out.println("[ERROR] " + ex.getMessage());
        }

        return componente;
    }

    // METODO PARA TRAER TODOS LOS COMPONENTES
    public List<Componente> getComponentes(){
        ControladorComputadoras ctrlComputadoras = new ControladorComputadoras();
        List<Componente> componentes = new ArrayList<>();
        ResultSet rs = null;
        String sqlQuery = "SELECT * FROM componente";

        try {
            Statement statement = conn.createStatement();
            rs = statement.executeQuery(sqlQuery);

            while (rs.next()){
                Componente componente = new Componente();

                componente.setId(rs.getInt(1));
                componente.setNombre(rs.getString(2));
                componente.setNroSerie(rs.getString(3));
                componente.setComputadora(ctrlComputadoras.getComputadoraById(rs.getInt("fk_computadora")));

                componentes.add(componente);
            }
        } catch (Exception ex) {
            System.out.println("[ERROR] " + ex.getMessage());
        }
        return componentes;
    }

}
