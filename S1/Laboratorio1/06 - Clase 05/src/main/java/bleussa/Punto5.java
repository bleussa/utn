package bleussa;

import java.util.Arrays;
import java.util.Scanner;

public class Punto5 {

    Scanner sc = new Scanner(System.in);

    public void crearArray(){
        int cantFilas = 0;
        while (cantFilas < 2){
            System.out.println("CANTIDAD FILAS: ");
            cantFilas = sc.nextInt();
        }
        int cantColum = 0;
        while (cantColum < 2){
            System.out.println("CANTIDAD COLUMNAS: ");
            cantColum = sc.nextInt();
        }
        int[][] array = new int[cantFilas][cantColum];
        int total = 0;
        for (int fila = 0; fila < array.length; fila++){
            for (int columna = 0; columna < array[0].length; columna++){
                System.out.println("FILA " + fila + ", COLUMNA " + columna + ": ");
                array[fila][columna] = sc.nextInt();
                total += array[fila][columna];
            }
        }
        for (int fila = 0; fila < array.length; fila++){
            for (int columna = 0; columna < array[0].length; columna++){
                if (array[fila][columna] < 10) {
                    System.out.print("0" + array[fila][columna] + " | ");
                } else{
                    System.out.print(array[fila][columna] + " | ");
                }
            }
            System.out.println("");
        }

        int promedio = total / (cantFilas * cantColum);
        System.out.println("");
        System.out.println("El promedio es: " + promedio);

        boolean encontrado = false;
        for (int fila = 0; fila < array.length; fila++){
            for (int columna = 0; columna < array[0].length; columna++){
               if (array[fila][columna] == promedio){
                   System.out.println("El valor " + promedio + " fue encontrado en la Fila " + fila + " y en la Columna " + columna);
                   encontrado = true;
               }
            }
        }
        if (!encontrado){
            System.out.println("El valor " + promedio + " no fue encontrado...");
        }
    }

}
