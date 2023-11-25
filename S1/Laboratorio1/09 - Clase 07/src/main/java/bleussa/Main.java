package bleussa;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        HashMap<String, Long> agenda = new HashMap<String, Long>();
        int seleccionUsuario = 0;

        while (seleccionUsuario != 4){
            System.out.println("## MENU ##");
            System.out.println("1. Cargar nuevo contacto en la agenda");
            System.out.println("2. Buscar telefono en la agenda");
            System.out.println("3. Mostrar todos los contactos");
            System.out.println("4. Salir del menu");
            seleccionUsuario = scan.nextInt();

            switch (seleccionUsuario){
                case 1:
                    scan = new Scanner(System.in);
                    String nombre;
                    System.out.println("Ingrese el nombre:");
                    nombre = scan.nextLine();
                    scan = new Scanner(System.in);
                    Long numero;
                    System.out.println("Ingrese el numero:");
                    numero = scan.nextLong();
                    crearContacto(nombre, numero, agenda);
                    break;
                case 2:
                    scan = new Scanner(System.in);
                    System.out.println("Ingrese el nombre:");
                    String nombreBusqueda = scan.nextLine();
                    buscarContacto(nombreBusqueda, agenda);
                    break;
                case 3:
                    listarContacto(agenda);
                    break;
            }
        }


    }

    public static void crearContacto(String nombre, long numero, HashMap<String, Long> lista){
        if (lista.containsKey(nombre)){
            System.out.println("El usuario ya existe en la agenda.");
        } else {
            lista.put(nombre, numero);
        }
    }

    public static void buscarContacto(String nombre, HashMap<String, Long> lista){
        if (lista.containsKey(nombre)){
            System.out.println(lista.get(nombre));
        } else {
            System.out.println("El contacto no se encontro en la agenda.");
        }
    }

    public static void listarContacto(HashMap<String, Long> lista){
        System.out.println("## LISTADO ##");
        for (String key: lista.keySet()){
            System.out.println(key + " - " + lista.get(key));
        }
    }
}

