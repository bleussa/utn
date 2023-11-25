/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.trabajopractico3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author bleussa
 */
public class TrabajoPractico3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // EJERCICIO 1 //
        /* ¿Qué sucede si tratamos de acceder un elemento fuera del tamaño del 
        array?*/


        // EJERCICIO 2 // 
        /* Crea un array o arreglo unidimensional con un tamaño de 5, asignale 
        los valores numéricos manualmente (los que tú quieras) y muestralos por 
        pantalla. */
        
        /*    
            int tamanoArreglo = 5;
            int[] arreglo = new int[tamanoArreglo];
            
            for (int i = 0; i < tamanoArreglo; i++){
                arreglo[i] = sc.nextInt(); 
            }
            
            for (int i = 0; i < tamanoArreglo; i++){
                System.out.println(arreglo[i]);
            }
        */


        // EJERCICIO 3 // 
        /* Crea un array o arreglo unidimensional donde tú le indiques el tamaño
        por teclado y crear una función que rellene el array o arreglo con los 
        múltiplos de un numero pedido por teclado. Por ejemplo, si defino un 
        array de tamaño 5 y elijo un 3 en la función, el array contendrá 3, 6, 
        9, 12, 15.  */
        
        /*
            System.out.println("Ingrese el tamaño del arreglo:");
            int tamanoArreglo = sc.nextInt();
            System.out.println("Ingrese el numero deseado:");
            int numElegido = sc.nextInt();
            int[] arreglo = new int[tamanoArreglo];
            
            rellenarArray(arreglo, tamanoArreglo, numElegido);
            mostrarArray(arreglo, tamanoArreglo);
        */


        // EJERCICIO 4 //
        /*  */
        
        /*
            int tamanoArreglo = 5;
            double[] arreglo = new double[tamanoArreglo];
            for (int i = 0; i < tamanoArreglo; i++){
                System.out.println("Ingrese el valor " + (i+1) + ":");
                arreglo[i] = sc.nextDouble(); 
            }
            
            double mayor = arreglo[0];
            double menor = arreglo[0];
            
            for (int i = 0; i < tamanoArreglo; i++){
                if (arreglo[i] > mayor){
                    mayor = arreglo[i];
                }
                if (arreglo[i] < menor){
                    menor = arreglo[i];
                }
            }
            
            System.out.println("El mayor es: " + mayor);         
            System.out.println("El menor es: " + menor);
            System.out.println("El rango es: " + (mayor - menor));
        */


        // EJERCICIO 5 //
        
        /*
            double[] arreglo = new double[20];
            double suma = 0;
            double promedio = 0;
            int contadorIguales = 0; int contadorMayores = 0; int contadorMenores = 0;
            for (int i = 0; i < 20; i++){
                arreglo[i] = (int)(Math.random() * 50) * 2;
                suma = suma + arreglo[i];
            }
            promedio = suma / 20;
            for (int i = 0; i < 20; i++){
                if(promedio == arreglo[i]){
                    contadorIguales = contadorIguales + 1;
                } else if(promedio < arreglo[i]){
                    contadorMayores = contadorMayores + 1;
                } else {
                    contadorMenores = contadorMenores + 1;
                }
            }

            System.out.println("a) El promedio es: " + promedio);
            System.out.println("b) Cantidad de nros iguales al promedio: " + contadorIguales);
            System.out.println("c) Cantidad de nros mayores al promedio: " + contadorMayores);
            System.out.println("d) Cantidad de nros menores al promedio: " + contadorMenores);
        */


        // EJERCICIO 6 //
        /*  */

        /*
            int tamanoArreglo = 50;
            int[] arreglo = new int[tamanoArreglo];

            for(int i = 0; i < tamanoArreglo; i++){
                arreglo[i] = (int)(Math.random() * 10);
                System.out.println(arreglo[i]);
            }

            int valorBusqueda, posicionEncontrada = 0;
            System.out.println("Ingresar el valor a buscar: ");
            valorBusqueda = sc.nextInt();

            for (int i = 0; i < tamanoArreglo; i++){
                if (valorBusqueda == arreglo[i]){
                    posicionEncontrada = i + 1;
                    break;
                }
            }

            if (posicionEncontrada != 0){
                System.out.println("El valor se encontro en la posicion " + posicionEncontrada);
            } else {
                System.out.println("El valor no se encontro!");
            }
        */


        // EJERCICIO 7 //
        /* Escriba una aplicación que solicite y cargue en un arreglo 10 dígitos
        enteros, luego cree dos nuevos arreglos y asigne al primero los números
        ingresados por el usuario de forma ascendente y en el segundo de forma
        descendente. Muestre los 2 arreglos por pantalla.*/

        /*
            int[] arreglo = new int[10];
            boolean ordenado = false;
            boolean ordenado2 = false;
            int temp;

            for (int i = 0;i < 10; i++){
                System.out.println("Ingrese el valor de " + (i+1) + ":");
                arreglo[i] = sc.nextInt();
            }

            System.out.print("El arreglo original es: ");
            for (int i = 0; i < 10; i++){
                System.out.print(arreglo[i] + " ");
            }

            int[] arregloMayorMenor, arregloMenorMayor;
            arregloMayorMenor = arreglo;
            arregloMenorMayor = arreglo;

            while(!ordenado) {
                ordenado = true;
                for (int i = 0; i < 10 - 1; i++) {
                    if (arregloMayorMenor[i] < arregloMayorMenor[i+1]) {
                        temp = arregloMayorMenor[i];
                        arregloMayorMenor[i] = arregloMayorMenor[i+1];
                        arregloMayorMenor[i+1] = temp;
                        ordenado = false;
                    }
                }
            }

            System.out.println(" ");
            System.out.print("El arreglo Mayor a menor es: ");
            for (int i = 0; i < 10; i++){
                System.out.print(arregloMayorMenor[i] + " ");
            }

            while(!ordenado2) {
                ordenado2 = true;
                for (int i = 0; i < 10 - 1; i++) {
                    if (arregloMenorMayor[i] > arregloMenorMayor[i+1]) {
                        temp = arregloMenorMayor[i];
                        arregloMenorMayor[i] = arregloMenorMayor[i+1];
                        arregloMenorMayor[i+1] = temp;
                        ordenado2 = false;
                    }
                }
            }

            System.out.println(" ");
            System.out.print("El arreglo Menor a mayor es: ");
            for (int i = 0; i < 10; i++){
                System.out.print(arregloMenorMayor[i] + " ");
            }
        */


        // EJERCICIO 8 //
        /*  */

        /*
            System.out.println("Ingresar los numeros separados por '-'");
            String inputUser = sc.nextLine();

            String[] arrayUser = inputUser.split("-");
            int [] arrayUserInt = new int[arrayUser.length];
            int suma = 0;
            double promedio = 0;

            for (int i = 0; i < arrayUser.length; i++){
                arrayUserInt[i] = Integer.parseInt(arrayUser[i]);
                suma = suma + arrayUserInt[i];
                promedio = suma / arrayUserInt.length;
            }

            System.out.println("La suma de todos los elementos es: " + suma);
            System.out.println("El promedio de todos los elementos es: " + promedio);
        */


        // EJERCICIO 9 //
        /*  */

        /*
            int nroDocumento = sc.nextInt();

            String nroDocumentoConLetra = obtenerLetra(nroDocumento);

            System.out.println("DNI SIN LETRA = " + nroDocumento);
            System.out.println("DNI CON LETRA = " + nroDocumentoConLetra);
        */


        // EJERCICIO 10 //
        /* Dado 2 array de enteros, el primero de tamaño 5 y el segundo de
        tamaño 10, pedir los valores numéricos enteros para cargar cada uno
        de los arreglos, cree un tercer arreglo de tamaño 10 que contenga
        en casa posición la suma de la multiplicación de cada elemento
        del array uno por cada elemento del array 2 */

        /*
            int[] array1 = new int[2];
            for (int i = 0; i < array1.length; i++){
                System.out.println("Valor " + (i + 1));
                array1[i] = sc.nextInt();
            }
            int[] array2 = new int[5];
            for (int i = 0; i < array2.length; i++){
                System.out.println("Valor " + (i + 1));
                array2[i] = sc.nextInt();
            }

            int[] array3 = new int[2];

            for (int i = 0; i < array2.length; i++){
                for (int x = 0; x < array1.length; x++){
                    array3[x] = array3[x] + array1[x] * array2[i];
                }
            }


            for (int i = 0; i < array3.length; i++){
                System.out.println("Array 3 pos " + i + ": " + array3[i]);
            }
        */


    }

        /*
        public static void rellenarArray(int[] array, int tamanoArray, int numElegido){
            for (int i = 0; i < tamanoArray; i++){
                    array[i] = numElegido * (i + 1);
            }
        }

        public static void mostrarArray(int[] array ,int tamanoArray){
            for (int i = 0; i < tamanoArray; i++){
                    System.out.println(array[i]);
            }
        }

        public static String obtenerLetra(int nroDocumento){
            int letra = nroDocumento % 23;
            String[] letras = {"T", "R", "A", "G", "M", "W", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

            return nroDocumento + letras[letra];
        }
        */



        
        
}
