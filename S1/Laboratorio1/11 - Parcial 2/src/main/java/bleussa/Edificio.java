package bleussa;

import java.util.ArrayList;
import java.util.Scanner;

public class Edificio {

    // atributos
    private String nombre;
    private String domicilio;
    private ArrayList<Departamento> departamentos = new ArrayList<Departamento>();

    // getters y setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDomicilio() {
        return domicilio;
    }
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    public ArrayList<Departamento> getDepartamentos() {
        return departamentos;
    }
    public void setDepartamentos(ArrayList<Departamento> departamentos) {
        this.departamentos = departamentos;
    }

    // constructores
    public Edificio(){};

    // metodos
    public void cargarDatosEdificio(ArrayList<String> tiposDeAmbiente){
        Scanner scan = new Scanner(System.in);
        System.out.println("MENSAJE: Carga de datos de edificio iniciada...");

        // NOMBRE DEL EDIFICIO
        while (true){
            System.out.println("Ingrese el nombre del edificio: ");
            String nombreIngresado = scan.nextLine();
            if (!nombreIngresado.isEmpty()){
                this.setNombre(nombreIngresado);
                break;
            } else {
                System.out.println("ERROR: El nombre no puede estar vacio!");
            }
        }

        // DOMICILIO DEL EDIFICIO
        while (true){
            System.out.println("Ingrese el domicilio del edificio: ");
            String domicilioIngresado = scan.nextLine();
            if (!domicilioIngresado.isEmpty()){
                this.setDomicilio(domicilioIngresado);
                break;
            } else {
                System.out.println("ERROR: El domicilio no puede estar vacio!");
            }
        }

        // DEPARTAMENTOS
        while (true){
            System.out.println("Desea cargar un departamento? S / N ");
            String cargarDepto = scan.nextLine();
            if (cargarDepto.equalsIgnoreCase("s")){
                this.departamentos.add(Departamento.crearDepartamento(tiposDeAmbiente, this.departamentos));
                System.out.println("MENSAJE: Departamento creado correctamente!");
            } else if (cargarDepto.equalsIgnoreCase("n")){
                System.out.println("MENSAJE: Carga de Departamento finalizada.");
                break;
            } else {
                System.out.println("ERROR: Digite 'S' o 'N'");
            }
        }

    }


    // mostrar la empresa
    public void mostrarDatosEdificio(){
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Edificio: " + this.getNombre());
        System.out.println("Domicilio: " + this.getDomicilio());
        for (Departamento depto : departamentos){
            System.out.println("|| --- --- --- DEPARTAMENTO --- --- --- ||");
            System.out.println("Piso: " + depto.getPisos());
            System.out.println("Letra: " + depto.getLetra());
            System.out.println("|| --- --- --- AMBIENTES    --- --- --- ||");
            for (Ambiente amb : depto.getHabitaciones()){
                System.out.println("Tipo de ambiente: " + amb.getTipo());
                System.out.println("Metros cuadrado: " + amb.getMetrosCuadrados());
                System.out.println("------------------------------------------");
            }
            System.out.println("Total de Metros Cuadrados Departamento: " + depto.getMetrosTotales());
            System.out.println(" ");
        }
        System.out.println("------------------------------------------");
        System.out.println(" ");

        double totalMetrosEdificio = 0;
        for (Departamento depto : departamentos){
            totalMetrosEdificio += depto.getMetrosTotales();
        }
        System.out.println("Total de Metros Cuadrados Edificio: " + totalMetrosEdificio );

    }


}
