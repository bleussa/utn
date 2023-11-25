package bleussa;

import java.util.ArrayList;
import java.util.Scanner;

public class Barrio {

    // ATRIBUTOS
    private String nombre;
    private String localidad;
    private ArrayList<Manzana> manzanas = new ArrayList<Manzana>();

    // GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getLocalidad() {
        return localidad;
    }
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
    public ArrayList<Manzana> getManzanas() {
        return manzanas;
    }
    public void setManzanas(ArrayList<Manzana> manzanas) {
        this.manzanas = manzanas;
    }

    // METODOS
    public void cargarDatosBarrio(ArrayList<String> tiposDeCasa){
        Scanner scan = new Scanner(System.in);
        System.out.println("MENSAJE: Carga de datos de barrio iniciada...");

        // NOMBRE
        while (true){
            System.out.println("Ingrese el nombre del barrio: ");
            String nombreIngresado = scan.nextLine();
            if (!nombreIngresado.isEmpty()){
                this.setNombre(nombreIngresado);
                break;
            } else {
                System.out.println("ERROR: El nombre no puede estar vacio!");
            }
        }

        // LOCALIDAD
        while (true){
            System.out.println("Ingrese la localidad del barrio: ");
            String localidadIngresada = scan.nextLine();
            if (!localidadIngresada.isEmpty()){
                this.setLocalidad(localidadIngresada);
                break;
            } else {
                System.out.println("ERROR: La localidad no puede estar vacia!");
            }
        }

        // MANZANAS
        do{
            System.out.println("Desea cargar una manzana? S / N ");
            String cargarManzana = scan.nextLine();
            if (cargarManzana.equalsIgnoreCase("s")){
                this.manzanas.add(Manzana.crearManzana(tiposDeCasa, this.manzanas));
                System.out.println("MENSAJE: Manzana creada correctamente!");
            } else if (cargarManzana.equalsIgnoreCase("n")){
                System.out.println("MENSAJE: Carga de Manzanas finalizada.");
                break;
            } else {
                System.out.println("ERROR: Digite 'S' o 'N'");
            }
        } while(true);

    }

}
