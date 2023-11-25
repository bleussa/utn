package bleussa;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        // PARTE 5: ALGORITMOS - STRING
        /* Cree una aplicación de Consola que permita por parte del usuario el ingreso por
        teclado de una cadena de texto, posteriormente el sistema deberá permitir el
        ingreso de una segunda cadena de texto. Finalmente el sistema deberá emitir el
        mensaje “ENCONTRADO” o “NO ENCONTRADO” según sean el caso de que la
        segunda cadena existe o no existe en la primera cadena. Valide que la cantidad
        de caracteres de la segunda cadena sea menor o igual a la cantidad de
        caracteres de la primera cadena.  */

        /*
            String cadenaIngresada1, cadenaIngresada2;
            cadenaIngresada2 = " ";
            System.out.println("Ingrese la cadena 1: ");
            cadenaIngresada1 = scan.nextLine();
            do {
                System.out.println("Ingrese la cadena 2:");
                cadenaIngresada2 = scan.nextLine();
            } while (cadenaIngresada1.length() < cadenaIngresada2.length());
            if (cadenaIngresada1.contains(cadenaIngresada2)){
                System.out.println("VALOR ENCONTRADO");
            } else {
                System.out.println("VALOR NO ENCONTRADO");
            }
         */

        // PARTE 5: ALGORITMOS - REPETITIVA
        /* Diseñar un algoritmo que realice el promedio de N números. La cantidad de números a ingresar debe ser
        indicada por el usuario, valide que la cantidad de números a ingresar sea mayor a cero. Los números ingresados
        pueden ser decimales y serán ingresados por pantalla por el usuario. */

        /*
            int cantNumerosIngresados;
            float numeroIngresado, promedio;
            promedio = 0;
            do{
                System.out.println("Ingrese la cantidad de numeros: ");
                cantNumerosIngresados = scan.nextInt();
            } while (cantNumerosIngresados <= 0);
            for(int i = 0; i < cantNumerosIngresados; i++){
                do{
                    System.out.println("Ingrese valor " + (i+1));
                    numeroIngresado = scan.nextFloat();
                } while (numeroIngresado < 0);
                promedio = promedio + numeroIngresado;
            }
            promedio = promedio / cantNumerosIngresados;
            System.out.println("Tu promedio es: " + promedio);
        */

        // PARTE 5: ALGORITMOS - RECURSIVA
        /* Diseñar un algoritmo que solicite el ingreso de una cadena de texto y que posteriormente y mediante recursión
        muestre cada una de las letras de la cadena en forma individual por cada pasada de la recursión. Se recomienda
        usar charAt */

        /*
            System.out.println("Ingresar la cadena a deletrear recursivamente: ");
            String cadena = scan.nextLine();
            deletreoRecursivo(cadena);
        */

        // PARTE 5: ALGORITMOS - ARREGLO A
        /* Codifique un algoritmo que cargue en un array 10 números enteros
        mayores a 0, todos los números cargados deben ser distintos entre sí, al
        finalizar la carga, muestre los números cargados. Valide que no pueda
        cargarse el mismo número. */

        /*
            int [] array1 = new int[3];
            int indice = 0;
            while (indice < array1.length){
                System.out.println("Ingrese el dato");
                int numeroIngresado = scan.nextInt();
                boolean aceptado = true;
                for (int i = 0; i < indice; i++){
                    if (array1[i] == numeroIngresado){
                        aceptado = false;
                        System.out.println("ERROR: El numero ya existe");
                    }
                }
                if (aceptado) {
                    if (numeroIngresado > 0){
                        array1[indice] = numeroIngresado;
                        indice++;
                    } else {
                        System.out.println("ERROR: El numero ingresado debe ser mayor que 0");
                    }
                }
            }
            for (int i = 0; i < array1.length; i++){
                System.out.println(array1[i] + " ");
            }
         */

        // PARTE 5: ALGORITMOS - ARREGLO B
        /* Escribe un programa que busque un valor dentro de un array de integers y
        borre todas sus ocurrencias, reduciendo la dimensión del array. Es decir,
        no vale con poner cero en el lugar donde encontremos el valor */

        /*
            int[] array1 = {1,5,9,3,45,23,45,12,87,9,6,5};
            System.out.println("Elemento a eliminar: ");
            int elemetoDelete = scan.nextInt();
            int vecesEncontrado = 0;
            System.out.println(Arrays.toString(array1));
            int[] array2;
            for (int i = 0; i < array1.length; i++){
                if (array1[i] == elemetoDelete){
                    vecesEncontrado++;
                    for (int j = i; j < array1.length-1; j++){
                        array1[j] = array1[j+1];
                    }
                }
            }
            int array2Length = array1.length - vecesEncontrado;
            array2 = new int[array2Length];
            for (int i = 0; i < array2Length; i++){
                array2[i] = array1[i];
            }
            System.out.println(Arrays.toString(array2));
        */

        // PARTE 5: ALGORITMOS - ARREGLO C
        /* Desarrolla un programa Java para ser usado por los camareros de un restaurante,
        que sirva para tomar nota de los menús que los clientes van a tomar. Tenemos tres
        menús: #1, #2 y #3. Puedes identificar cada menú por el número: menú 1, menú 2 o
        menú 1 3. Menú 1-> $2500, Menú 2-> $3200, Menú 3-> $4500 */

        /*
            // PRIMER DATO A INGRESAR = CANTIDAD DE COMENSALES
            int cantidadComensales = 0;
            while (cantidadComensales <= 0 || cantidadComensales >= 7){
                System.out.println("Ingrese la cantidad de Comensales: ");
                cantidadComensales = scan.nextInt();
            }
            // SEGUNDO DATO A INGRESAR = MENU SELECCIONADO
            int [] menuSeleccionado = new int[cantidadComensales];
            for (int i = 0; i < menuSeleccionado.length; i++){
                menuSeleccionado[i] = 0;
                while (menuSeleccionado[i] <= 0 || menuSeleccionado[i] >= 4){
                    System.out.println("Introduce el menu pedido por el comensal " + (i + 1));
                    menuSeleccionado[i] = scan.nextInt();
                }
            }
            // MUESTRA DE DATOS
            int total = 0;
            for (int i = 0; i < cantidadComensales; i++){
                int costo = switch (menuSeleccionado[i]) {
                    case 1 -> 2500;
                    case 2 -> 3200;
                    case 3 -> 4500;
                    default -> 0;
                };
                total = total + costo;
                System.out.println("El comensal " + (i + 1) + " va a tomar el menu " + menuSeleccionado[i] + " con precio $" + costo);
            }
            System.out.println("El costo total a pagar por la mesa es de $" + total);
        */

        // PARTE 6: OBJETOS - PUNTO 3, 4 y 5.
            /*
                Cliente instancia1 = new Cliente("Alonso", "Eugenia", 27456987, 2698.85, 13654);
                Cliente instancia2 = new Cliente("Pereira", "Victor", 36214689, 3695.45, 12852);

                instancia1.mostrarCliente();
                System.out.println("########################");
                instancia2.setDni(26987456);
                instancia2.mostrarCliente();
            */
    }

    public static void deletreoRecursivo(String cadena){
        if (cadena.length() > 1){
            System.out.println(cadena.charAt(0));
            cadena = cadena.substring(1);
            deletreoRecursivo(cadena);
        } else {
            System.out.println(cadena);
        }
    }

}