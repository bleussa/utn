package RepeticionesNumMayor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // ARRAY NATIVO
        arrayNativo();

        // ARRAY LIST
        arrayList();

    }

    public static void arrayNativo(){
        // LEEMOS LOS DIEZ NUMEROS
        int[] numeros_an = new int[10];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < numeros_an.length; i++) {
            System.out.print("Ingresa el numero: ");
            numeros_an[i] = scan.nextInt();
        }
        // BUSCAMOS EL MAYOR
        int mayor = 0;
        for (int i = 0; i < numeros_an.length; i++) {
            if (numeros_an[i] > mayor){
                mayor = numeros_an[i];
            }
        }
        // IMPRIMIMOS LA CANTIDAD DE VECES QUE SE REPITIO EL VALOR
        int cant_repetidas = 0;
        for (int i = 0; i < numeros_an.length; i++) {
            if (numeros_an[i] == mayor){
                cant_repetidas++;
            }
        }
        System.out.println("El numero " + mayor + " se repitio " + cant_repetidas);

    }

    public static void arrayList(){
        // LEEMOS LOS DIEZ NUMEROS
        ArrayList<Integer> numeros_al = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        while (numeros_al.size() < 10){
            System.out.print("Ingresa el numero: ");
            numeros_al.add(scan.nextInt());
        }
        // BUSCAMOS EL MAYOR
        int mayor = 0;
        Iterator<Integer> it = numeros_al.iterator();
        while (it.hasNext()){
            Integer numero = it.next();
            if (numero > mayor){
                mayor = numero;
            }
        }
        // IMPRIMIMOS LA CANTIDAD DE VECES QUE SE REPITIO EL VALOR
        int cant_repetidas = 0;
        Iterator<Integer> it2 = numeros_al.iterator();
        while (it2.hasNext()){
            Integer numero = it2.next();
            if (numero == mayor){
                cant_repetidas++;
            }
        }
        System.out.println("El numero " + mayor + " se repitio " + cant_repetidas);
    }
}

