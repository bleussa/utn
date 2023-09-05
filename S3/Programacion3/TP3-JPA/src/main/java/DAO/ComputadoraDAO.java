package DAO;

import entidades.Computadora;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ComputadoraDAO{

    SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

    public void crearComputadora(){
        Scanner sc = new Scanner(System.in);
        Session session = sessionFactory.openSession();

        try {

            System.out.println("[MENSAJE] Creando computadora...");
            System.out.println("Codigo:");
            String codigo = sc.nextLine();
            System.out.println("Marca:");
            String marca = sc.nextLine();
            System.out.println("Modelo:");
            String modelo = sc.nextLine();

            Computadora computadora = new Computadora(codigo, marca, modelo);

            // Empezamos la transaccion
            session.beginTransaction();

            // Guardamos el objeto
            session.saveOrUpdate(computadora);

            // Hacemos un commit de la transaccion
            session.getTransaction().commit();

            System.out.println("[MENSAJE] Registro guardado correctamente");

        } catch (Exception ex){
            System.out.println("[ERROR] " + ex.getMessage());
            // Hacemos un rollback de la transaccion en caso de fallo
            session.getTransaction().rollback();
        } finally {
            sessionFactory.close();
            session.close();
        }
    }

    public void crearComputadoraComponente(){
        Scanner sc = new Scanner(System.in);
        Session session = sessionFactory.openSession();
        ComponenteDAO componenteDAO = new ComponenteDAO();

        try {

            // Empezamos la transaccion
            session.beginTransaction();

            System.out.println("[MENSAJE] Creando computadora...");
            System.out.println("Codigo:");
            String codigo = sc.nextLine();
            System.out.println("Marca:");
            String marca = sc.nextLine();
            System.out.println("Modelo:");
            String modelo = sc.nextLine();

            Computadora computadora = new Computadora(codigo, marca, modelo);

            // Guardamos el objeto
            session.saveOrUpdate(computadora);

            do {
                System.out.println("[MENSAJE] Deseas agregar un componente adicional? (y/n)");
                String eleccionUsuario = sc.nextLine().toLowerCase();
                if (eleccionUsuario.equals("y")){
                    System.out.println(computadora.toString());
                    componenteDAO.crearComponente(computadora, session);
                } else if (eleccionUsuario.equals("n")) {
                    break;
                } else{
                    System.out.println("[ERROR] Seleccione 'y' o 'n'");
                }
            } while (true);

            // Hacemos un commit de la transaccion
            session.getTransaction().commit();

            System.out.println("[MENSAJE] Registro guardado correctamente");

        } catch (Exception ex){
            System.out.println("[ERROR] " + ex.getMessage());
            // Hacemos un rollback de la transaccion en caso de fallo
            session.getTransaction().rollback();
        } finally {
            sessionFactory.close();
            session.close();
        }
    }

    public List<Computadora> buscarComputadoras(){

        Session session = sessionFactory.openSession();
        List<Computadora> listaComputadoras = null;

        // Declaramos el query HQL
        String hqlQuery = "FROM Computadora c";

        try {
            // Empezamos la transaccion
            session.beginTransaction();

            // Creamos un listado de computadoras y ejecutamos el query
            listaComputadoras = session.createQuery(hqlQuery).getResultList();
            return listaComputadoras;
        } catch (Exception ex){
            System.out.println("[ERROR] " + ex.getMessage());
        } finally {
            session.close();
        }
        return listaComputadoras;
    }

    public Computadora buscarComputadora(int id){

        Session session = sessionFactory.openSession();
        Computadora computadora = null;

        // Declaramos el query HQL
        String hqlQuery = "FROM Computadora c WHERE c.id= :id";

        try {
            // Empezamos la transaccion
            session.beginTransaction();

            // Creamos una computadora y ejecutamos el query
            Query<Computadora> query = session.createQuery(hqlQuery, Computadora.class);
            query.setParameter("id", id);
            computadora = query.uniqueResult();

            if (computadora != null){
                return computadora;
            }

        } catch (Exception ex){
            System.out.println("[ERROR] " + ex.getMessage());
        } finally {
            session.close();
        }
        return computadora;
    }

}
