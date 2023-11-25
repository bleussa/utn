package bleussa;

import java.util.ArrayList;
import java.util.Scanner;

public class Ambiente {

    // atributos
    private String tipo = new String();
    private double metrosCuadrados;

    // getters y setters
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }
    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    // constructores
    public Ambiente(){};

    // metodos
    public static Ambiente crearAmbiente(ArrayList<String> tiposDeAmbiente){

        Scanner scan = new Scanner(System.in);
        Ambiente ambienteCreado = new Ambiente();

        // TIPO DE AMBIENTE
        while (true){
            System.out.println("Ingrese el tipo de ambiente: ");
            boolean tipoEncontrado = false;
            String ambienteIngresado = scan.next();
            for (String tipo : tiposDeAmbiente){
                if (ambienteIngresado.equals(tipo)){
                    switch (ambienteIngresado) {
                        case "C" -> ambienteCreado.setTipo(tiposDeAmbiente.get(0));
                        case "CC" -> ambienteCreado.setTipo(tiposDeAmbiente.get(1));
                        case "B" -> ambienteCreado.setTipo(tiposDeAmbiente.get(2));
                        case "BS" -> ambienteCreado.setTipo(tiposDeAmbiente.get(3));
                        case "E" -> ambienteCreado.setTipo(tiposDeAmbiente.get(4));
                        case "H" -> ambienteCreado.setTipo(tiposDeAmbiente.get(5));
                    }
                    tipoEncontrado = true;
                }
            }
            if (tipoEncontrado){
                break;
            } else {
                System.out.println("ERROR: El tipo ingresado no existe.");
                System.out.println("Listado de tipos: ");
                for (String tipo : tiposDeAmbiente){
                    System.out.println("- " + tipo);
                }
            }
        }

        // METROS CUADRADOS
        while (true){
            System.out.println("Ingrese los metros cuadrados: ");
            Double metrosIngresado = scan.nextDouble();
            if (metrosIngresado > 0){
                ambienteCreado.setMetrosCuadrados(metrosIngresado);
                break;
            } else {
                System.out.println("ERROR: Los metros cuadrados deben ser mayor a 0.");
            }
        }

        return ambienteCreado;
    }


}
