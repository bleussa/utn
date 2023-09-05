import conexion.Conexion;
import controlador.ControladorComponente;
import controlador.ControladorComputadoras;
import entidades.Componente;
import entidades.Computadora;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
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
                    System.out.println("2. Registrar un componente");
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
                            crearComponente();
                            break;
                        case 3:
                            buscarComputadoras();
                            break;
                        case 4:
                            buscarComputadorasID();
                            break;
                        case 5:
                            buscarComponentes();
                            break;
                        case 6:
                            buscarComponentesID();
                            break;
                        case 7:
                            usuarioEligeBool = true;
                            break;
                    }
                }
            }

    public static void crearComputadora(){
        ControladorComputadoras ctrlComputadoras = new ControladorComputadoras();
        try {
            ctrlComputadoras.createComputadora();
        } catch (Exception e) {
            System.out.println("[ERROR] " + e.getMessage());
        }
    }

    public static void crearComponente(){
        ControladorComputadoras ctrlComputadoras = new ControladorComputadoras();
        ControladorComponente ctrlComponentes = new ControladorComponente();
        Scanner sc = new Scanner(System.in);
        Computadora computadora = null;

        do {
            System.out.println("[DATO] Inserte el ID de la computadora:");
            int idComputadora = sc.nextInt();
            computadora = ctrlComputadoras.getComputadoraById(idComputadora);
        } while (computadora == null);

        try {
            ctrlComponentes.createComponente(computadora.getId());
        } catch (Exception e){
            System.out.println("[ERROR] " + e.getMessage());
        }
    }

    public static void buscarComputadoras(){
        ControladorComputadoras ctrlComputadoras = new ControladorComputadoras();
        List<Computadora> computadoras = ctrlComputadoras.getComputadoras();
        System.out.println("[DATO] Listado de computadoras:");
        System.out.println("ID, CODIGO, MARCA, MODELO");
        for (Computadora computadora : computadoras) {
            System.out.println(computadora.getId() + ", " + computadora.getCodigo() + ", " + computadora.getMarca() + ", " + computadora.getModelo());
        }
    }

    public static void buscarComputadorasID(){
        ControladorComputadoras ctrlComputadoras = new ControladorComputadoras();
        Scanner sc = new Scanner(System.in);
        Computadora computadora = null;

        do {
            System.out.println("[DATO] Inserte el ID de la computadora:");
            int idComputadora = sc.nextInt();
            computadora = ctrlComputadoras.getComputadoraById(idComputadora);
        } while (computadora == null);


        System.out.println("[DATO] Computadora encontrada:");
        System.out.println("ID, CODIGO, MARCA, MODELO");
        System.out.println(computadora.getId() + ", " + computadora.getCodigo() + ", " + computadora.getMarca() + ", " + computadora.getModelo());
    }

    public static void buscarComponentes(){
        ControladorComponente ctrlComponentes = new ControladorComponente();
        List<Componente> componentes = ctrlComponentes.getComponentes();
        System.out.println("[DATO] Listado de componentes:");
        System.out.println("ID, NOMBRE, NRO SERIE, COMPUTADORA ID");
        for (Componente componente : componentes) {
            System.out.println(componente.getId() + ", " + componente.getNombre() + ", " + componente.getNroSerie() + ", " + componente.getComputadora().getId());
        }
    }

    public static void buscarComponentesID(){
        ControladorComponente ctrlComponentes = new ControladorComponente();
        Scanner sc = new Scanner(System.in);
        Componente componente = null;

        do {
            System.out.println("[DATO] Inserte el ID del componente:");
            int idComponente = sc.nextInt();
            componente = ctrlComponentes.getComponenteById(idComponente);
        } while (componente == null);


        System.out.println("[DATO] Componente encontrado:");
        System.out.println("ID, NOMBRE, NRO SERIE, COMPUTADORA ID");
        System.out.println(componente.getId() + ", " + componente.getNombre() + ", " + componente.getNroSerie() + ", " + componente.getComputadora().getId());
    }

}