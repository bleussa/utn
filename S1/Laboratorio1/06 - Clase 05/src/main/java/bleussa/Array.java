package bleussa;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

    Scanner sc = new Scanner(System.in);
    Algoritmo ar = new Algoritmo();

    public int[] crearArray(){
        System.out.println("## CREACION DEL ARRAY ##");
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++){
            System.out.println("INGRESE EL VALOR DE " + (i+1) + ":");
            array[i] = sc.nextInt();
        }
        return array;
    }

    public void ordenarArray(int[] array){
        System.out.println("");
        System.out.println("## ORDENAMIENTO DEL ARRAY ## ");
        int eleccionAlgoritmo = opcionAlgoritmo();
        String eleccionOrden = opcionOrden();

        System.out.println("");
        System.out.print("Configuracion Utilizada: Algoritmo ");
        switch (eleccionAlgoritmo) {
            case 1 -> {
                System.out.print("Insercion, Orden ");
                ar.algoritmoInsersionO(array, eleccionOrden);
            }
            case 2 -> {
                System.out.print("Burbuja, Orden ");
                ar.algoritmoBurbujaO(array, eleccionOrden);
            }
            case 3 -> {
                System.out.print("Seleccion, Orden ");
                ar.algoritmoSeleccionO(array, eleccionOrden);
            }
        }
    }

    public void mostrarAlgoritmo(int[] array){
        System.out.println("");
        System.out.print("## ARREGLO: ");
        for (int j : array) {
            System.out.print(j + "  ");
        }
        System.out.print("##");
    }

    public int opcionAlgoritmo(){
        int numeroIngresado = 0;
        while (numeroIngresado <= 0 || numeroIngresado >= 4){
            System.out.println("Que Algoritmo desea utilizar?");
            System.out.println("1. Insercion");
            System.out.println("2. Burbuja");
            System.out.println("3. Seleccion");
            numeroIngresado = sc.nextInt();
        }
        return numeroIngresado;
    }

    public String opcionOrden(){
        int numeroIngresado = 0;
        while (numeroIngresado <= 0 || numeroIngresado >= 3){
            System.out.println("Que orden desea utilizar?");
            System.out.println("1. Ascendente");
            System.out.println("2. Descendente");
            numeroIngresado = sc.nextInt();
        }
        String opcionIngresada = "";
        if(numeroIngresado == 1){
            opcionIngresada = "ASC";
        } else {
            opcionIngresada = "DESC";
        }
        return opcionIngresada;
    }
}
