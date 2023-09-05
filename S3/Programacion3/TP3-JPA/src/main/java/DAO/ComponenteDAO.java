package DAO;

import entidades.Componente;
import entidades.Computadora;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;
import java.util.Scanner;

public class ComponenteDAO{

    SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

    public void crearComponente(){
        Scanner sc = new Scanner(System.in);
        Session session = sessionFactory.openSession();
        ComputadoraDAO computadoraDAO = new ComputadoraDAO();

        try {

            System.out.println("[MENSAJE] Creando componente...");
            System.out.println("Nombre:");
            String nombre = sc.nextLine();
            System.out.println("Nro Serie:");
            String nroSerie = sc.nextLine();
            System.out.println("Computadora ID:");
            int computadoraId = sc.nextInt();

            if (computadoraDAO.buscarComputadora(computadoraId) != null){
                Componente componente = new Componente(nombre, nroSerie, computadoraDAO.buscarComputadora(computadoraId));

                // Empezamos la transaccion
                session.beginTransaction();

                // Guardamos el objeto
                session.saveOrUpdate(componente);

                // Hacemos un commit de la transaccion
                session.getTransaction().commit();

                System.out.println("[MENSAJE] Registro guardado correctamente");
            } else {
                System.out.println("[MENSAJE] La ID no fue encontrada!");
            }

        } catch (Exception ex){
            System.out.println("[ERROR] " + ex.getMessage());
            // Hacemos un rollback de la transaccion en caso de fallo
            session.getTransaction().rollback();
        } finally {
            sessionFactory.close();
            session.close();
        }
    }

    public void crearComponente(Computadora computadora, Session session){
        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("[MENSAJE] Creando componente...");
            System.out.println("Nombre:");
            String nombre = sc.nextLine();
            System.out.println("Nro Serie:");
            String nroSerie = sc.nextLine();
            Componente componente = new Componente(nombre, nroSerie, computadora);

            // Guardamos el objeto
            session.saveOrUpdate(componente);

        } catch (Exception ex){
            System.out.println("[ERROR] " + ex.getMessage());
        }
    }

    public List<Componente> buscarComponentes(){

        Session session = sessionFactory.openSession();
        List<Componente> listaComponentes = null;

        // Declaramos el query HQL
        String hqlQuery = "FROM Componente c";

        try {
            // Empezamos la transaccion
            session.beginTransaction();

            // Creamos un listado de computadoras y ejecutamos el query
            listaComponentes = session.createQuery(hqlQuery).getResultList();
            return listaComponentes;
        } catch (Exception ex){
            System.out.println("[ERROR] " + ex.getMessage());
        } finally {
            session.close();
        }
        return listaComponentes;
    }

    public Componente buscarComponente(int id){

        Session session = sessionFactory.openSession();
        Componente componente = null;

        // Declaramos el query HQL
        String hqlQuery = "FROM Componente c WHERE c.id= :id";

        try {
            // Empezamos la transaccion
            session.beginTransaction();

            // Creamos una computadora y ejecutamos el query
            Query<Componente> query = session.createQuery(hqlQuery, Componente.class);
            query.setParameter("id", id);
            componente = query.uniqueResult();

            if (componente != null){
                return componente;
            }

        } catch (Exception ex){
            System.out.println("[ERROR] " + ex.getMessage());
        } finally {
            session.close();
        }
        return componente;
    }

}
