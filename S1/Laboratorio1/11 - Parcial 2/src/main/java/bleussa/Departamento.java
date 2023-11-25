package bleussa;

import java.util.ArrayList;
import java.util.Scanner;

public class Departamento {

    // atributos
    private int pisos;
    private String letra;
    private ArrayList<Ambiente> habitaciones = new ArrayList<Ambiente>();
    private double metrosTotales;

    // getters y setters
    public int getPisos() {
        return pisos;
    }
    public void setPisos(int pisos) {
        this.pisos = pisos;
    }
    public String getLetra() {
        return letra;
    }
    public void setLetra(String letra) {
        this.letra = letra;
    }
    public ArrayList<Ambiente> getHabitaciones() {
        return habitaciones;
    }
    public void setHabitaciones(ArrayList<Ambiente> habitaciones) {
        this.habitaciones = habitaciones;
    }
    public double getMetrosTotales() {
        return metrosTotales;
    }
    public void setMetrosTotales(double metrosTotales) {
        this.metrosTotales = metrosTotales;
    }

    // constructores
    public Departamento(){};

    // metodos
    public static Departamento crearDepartamento(ArrayList<String> tiposDeAmbiente, ArrayList<Departamento> departamentos){

        Departamento deptoCreado = new Departamento();
        Scanner scan = new Scanner(System.in);

        // PISO Y LETRA
        while (true) {
            System.out.println("Ingrese el piso: ");
            Integer pisoIngresado = scan.nextInt();
            while(true){
                if(!pisoIngresado.toString().isEmpty()){
                    break;
                }
                System.out.println("ERROR: El piso no puede estar vacio!");
                pisoIngresado = scan.nextInt();
            }
            boolean pisoRepetido = false;
            for (Departamento depto : departamentos) {
                if(depto.getPisos() == pisoIngresado){
                    pisoRepetido = true;
                    break;
                }
            }
            if(!pisoRepetido){
                while (true) {
                    System.out.println("Ingrese la letra: ");
                    String letraIngresada = scan.next();
                    while(true){
                        if(!letraIngresada.isEmpty()){
                            break;
                        }
                        System.out.println("ERROR: La letra no puede estar vacia!");
                        letraIngresada = scan.next();
                    }
                    boolean letraRepetida = false;
                    for (Departamento depto : departamentos) {
                        if(depto.getLetra().equalsIgnoreCase(letraIngresada)){
                            letraRepetida = true;
                            break;
                        }
                    }
                    if(!letraRepetida && !pisoRepetido){
                        deptoCreado.setPisos(pisoIngresado);
                        deptoCreado.setLetra(letraIngresada);
                        break;
                    } else {
                        System.out.println("ERROR: La letra ingresada ya existe!");
                    }
                    letraRepetida = false;
                }
                break;
            } else {
                System.out.println("ERROR: El piso ingresado ya existe!");
            }
            pisoRepetido = false;
        }

        // HABITACIONES
        while (true){
            System.out.println("Desea cargar un ambiente? S / N ");
            String cargarAmbiente = scan.next();
            if (cargarAmbiente.equalsIgnoreCase("s")){
                deptoCreado.habitaciones.add(Ambiente.crearAmbiente(tiposDeAmbiente));
                System.out.println("MENSAJE: Ambiente creado correctamente!");
            } else if (cargarAmbiente.equalsIgnoreCase("n")){
                System.out.println("MENSAJE: Carga de Departamento finalizada.");
                break;
            } else {
                System.out.println("ERROR: Digite 'S' o 'N'");
            }
        }

        double metrosTotales = 0;
        metrosTotales = totalMetrosCuadradosDepartamento(deptoCreado);
        deptoCreado.setMetrosTotales(metrosTotales);

        return deptoCreado;
    }

    public static double totalMetrosCuadradosDepartamento(Departamento depto){
        double sumaMetrosCuadrados = 0;
        for (Ambiente amb : depto.getHabitaciones()){
            sumaMetrosCuadrados += amb.getMetrosCuadrados();
        }

        return sumaMetrosCuadrados;
    };


}
