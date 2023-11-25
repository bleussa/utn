package bleuss;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // EJERCICIO 01
        /* Cree un ArrayList<Integer>, que permita asignar los valores numéricos
        manualmente (los que tú quieras) hasta ingresar un valor menor a 0,
        mostrar los números por pantalla. Solicite los números mediante un bucle. */

        // Problema1.CrearArrayList();



        // EJERCICIO 02
        /*
            a) lea 20 números decimales ingresados por teclado por el usuario y los
            coloque en un ArrayList<Double>.
            b) determine y muestre el mayor de los números en el arreglo
            c) determine y muestre el menor de los números del arreglo calcule y
            muestre el rango (diferencia entre el mayor y el menor) de los
            elementos en el arreglo
        */

        /*
            ArrayList<Integer> lista = Problema2.crearLista();
            Integer mayor = Problema2.mayor(lista);
            Integer menor = Problema2.menor(lista);
            System.out.println("El mayor es " + mayor);
            System.out.println("El menor es " + menor);
            System.out.println("El rango es " + (mayor - menor));
        */



        // EJERCICIO 03
        /* Codifique una aplicación para almacenar en un ArrayList<Integer>
        aleatoriamente 20 números enteros positivos pares del 1 al 100, de los
        cuales se desea saber:
            a) su promedio aritmético
            b) cuántos de los números son iguales al promedio aritmético
            c) cuántos de los números son mayores que el promedio aritmético
            d) cuántos de los números son menores que el promedio aritmético
        */

        /*
            ArrayList<Integer> lista = Problema3.crearLista();
            Double promedio = Problema3.promedio(lista);
            Integer mayorPromedio = Problema3.mayoresPromedio(lista, promedio);
            Integer menorPromedio = Problema3.menorPromedio(lista, promedio);

            System.out.println("LISTA = " + lista);
            System.out.println("PROMEDIO = " + promedio);
            System.out.println("> PROMEDIO = " + mayorPromedio);
            System.out.println("< PROMEDIO = " + menorPromedio);
        */


        // EJERCICIO 04
        /* Codifique una aplicación que permita almacenar palabras en un
        ArrayList<String> hasta que se ingrese la palabra “salir”, al finalizar
        muestre por pantalla:
            a) Las palabras ingresadas
            b) Indicar cuál de las palabras ingresadas posee más caracteres
            c) Indicar si se ingresaron o no palabras iguales o repetidas
            d) Mostrar las palabras repetidas ingresadas y cuantas veces se repitió esa
            palabra
        */

        /*
            ArrayList<String> lista = Problema4.crearLista();
            String palabraLarga = Problema4.mayor(lista);
            String palabraRepetida = Problema4.palabraRepetida(lista)? "SI": "NO";
            System.out.println("PALABRAS = " + lista);
            System.out.println("PALABRA MAS LARGA = " + palabraLarga);
            System.out.println("PALABRAS REPETIDAS = " + palabraRepetida);
            Map<String, Integer> mapaFrecuencias = Problema4.palabrasRepetidas(lista);
            for (HashMap.Entry<String, Integer> entry : mapaFrecuencias.entrySet()) {
                if(entry.getValue() > 1)
                    System.out.printf("Palabra '%s' repetida %d veces. \n", entry.getKey(), entry.getValue());
            }
         */



        // EJERCICIO 05
        /* Realice una búsqueda secuencial en un ArrayList<Integer> que contenga
        50 elementos generados aleatoriamente mediante la función java random.
        Realice una búsqueda secuencial de la siguiente forma:
            - se lee el valor que se desea buscar;
            - se compara la primera posición;
                - si son iguales;
                    - fin de la búsqueda.
                - De lo contrario, compararlo con la segunda posición, y así sucesivamente.
                - Si se llega al final del arreglo y no se encontró el valor, debe indicarlo
                con un mensaje apropiado.
                - Si se encuentra, se debe especificar la posición que ese valor ocupa en
                la lista por primera vez.
        */

        /*
            ArrayList<Integer> lista = new ArrayList<Integer>();
            Problema5.cargarArray(lista);
            System.out.println("Ingrese el número a buscar");
            int valorBusqueda = scan.nextInt();

            System.out.println("LISTADO = " + lista);
            System.out.println(Problema5.busquedaSecuencial(lista, valorBusqueda));
        */



        // EJERCICIO 06
        /* Codifique una aplicación que solicite y cargue en una ArrayList<Integer> 10
        dígitos enteros, luego cree dos nuevas ArrayList<Integer> y asigne a la
        primera los números ingresados por el usuario de forma ascendente y en la
        segunda de forma descendente. Muestre las 2 listas por pantalla. */


            ArrayList<Integer> lista = new ArrayList<Integer>();
            Problema6.cargarArray(lista);

            ArrayList<Integer> listaAsc = (ArrayList)lista.clone();
            ArrayList<Integer> listaDesc = (ArrayList)lista.clone();
            Collections.sort(listaAsc);
            Collections.sort(listaDesc,Collections.reverseOrder());

            System.out.println("LISTADO = " + lista);
            System.out.println("LISTADO ASC = " + listaAsc);
            System.out.println("LISTA DESC = " + listaDesc);


    }


}