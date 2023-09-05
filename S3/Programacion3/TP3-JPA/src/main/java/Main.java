import DAO.ComponenteDAO;
import DAO.ComputadoraDAO;
import entidades.Componente;
import entidades.Computadora;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        gestorElementos();

    }

    public static void gestorElementos(){
        Scanner sc = new Scanner(System.in);


        System.out.println("# GESTOR DE ELEMENTOS #");
        boolean usuarioEligeBool = false;
        while (!usuarioEligeBool){
            System.out.println("\n[MENU DE ACCIONES]");
            System.out.println("1. Registrar una computadora");
            System.out.println("2. Registrar una computadora + componentes");
            System.out.println("3. Ver listado de computadoras");
            System.out.println("4. Buscar computadora por ID");
            System.out.println("5. Ver listado de componentes");
            System.out.println("6. Buscar componente por ID");
            System.out.println("7. Salir");

            int usuarioElige = 0;
            try {
                usuarioElige = Integer.parseInt(sc.nextLine());
            } catch (Exception ex){
                System.out.println("[ERROR] " + ex.getMessage());
            }

            switch (usuarioElige){
                case 1:
                    crearComputadora();
                    break;
                case 2:
                    crearComputadoraComponente();
                    break;
                case 3:
                    buscarComputadoras();
                    break;
                case 4:
                    buscarComputadora();
                    break;
                case 5:
                    buscarComponentes();
                    break;
                case 6:
                    buscarComponente();
                    break;
                case 7:
                    usuarioEligeBool = true;
                    break;
            }
        }
    }

    public static void crearComputadora(){
        ComputadoraDAO computadoraDAO = new ComputadoraDAO();
        computadoraDAO.crearComputadora();
    }

    public static void crearComputadoraComponente(){
        ComputadoraDAO computadoraDAO = new ComputadoraDAO();
        computadoraDAO.crearComputadoraComponente();
    }

    public static void buscarComputadora(){
        ComputadoraDAO computadoraDAO = new ComputadoraDAO();
        Scanner sc = new Scanner(System.in);

        System.out.println("[DATO] Inserte el ID de la computadora:");
        int idComputadora = sc.nextInt();

        Computadora computadora = computadoraDAO.buscarComputadora(idComputadora);

        if (computadora != null){
            // Mostramos las computadora
            System.out.println("ID, CODIGO, MARCA, MODELO");
            System.out.println("---------------------------------");
            System.out.println(computadora.getId() + ", " + computadora.getCodigo() + ", " + computadora.getMarca() + ", " + computadora.getModelo());
        } else {
            System.out.println("[MENSAJE] No se encontro computadora con ese ID...");
        }
    }

    public static void buscarComputadoras(){
        ComputadoraDAO computadoraDAO = new ComputadoraDAO();
        List<Computadora> listaComputadoras = computadoraDAO.buscarComputadoras();

        System.out.println("[DATO] Listado de computadoras:");

        // Mostramos las computadoras
        System.out.println("ID, CODIGO, MARCA, MODELO");
        System.out.println("---------------------------------");
        for (Computadora computadora : listaComputadoras) {
            System.out.println(computadora.getId() + ", " + computadora.getCodigo() + ", " + computadora.getMarca() + ", " + computadora.getModelo());
        }
    }

    public static void buscarComponentes(){
        ComponenteDAO componenteDAO = new ComponenteDAO();
        List<Componente> listaComponentes = componenteDAO.buscarComponentes();

        System.out.println("[DATO] Listado de componentes:");

        // Mostramos las computadoras
        System.out.println("ID, NOMBRE, NRO SERIE, ID COMPUTADORA");
        System.out.println("---------------------------------");
        for (Componente componente : listaComponentes) {
            System.out.println(componente.getId() + ", " + componente.getNombre() + ", " + componente.getNroSerie() + ", " + componente.getComputadora().getId());
        }
    }

    public static void buscarComponente(){
        ComponenteDAO componenteDAO = new ComponenteDAO();
        Scanner sc = new Scanner(System.in);

        System.out.println("[DATO] Inserte el ID del componente:");
        int idComponente = sc.nextInt();

        Componente componente = componenteDAO.buscarComponente(idComponente);

        if (componente != null){
            // Mostramos las computadora
            System.out.println("ID, NOMBRE, NRO SERIE, ID COMPUTADORA");
            System.out.println("---------------------------------");
            System.out.println(componente.getId() + ", " + componente.getNombre() + ", " + componente.getNroSerie() + ", " + componente.getComputadora().getId());
        } else {
            System.out.println("[MENSAJE] No se encontro componente con ese ID...");
        }
    }







}