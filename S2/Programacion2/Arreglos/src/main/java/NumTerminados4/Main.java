package NumTerminados4;
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
        // BUSCAMOS E IMPRIMIMOS LOS TERMINADOS EN 4 Y SU POSICION
        for (int i = 0; i < numeros_an.length; i++) {
            if (numeros_an[i] % 10 == 4){
                System.out.println("El numero " + numeros_an[i] + " se encuentra en la posicion " + i);
            }
        }

    }

    public static void arrayList(){
        // LEEMOS LOS DIEZ NUMEROS
        ArrayList<Integer> numeros_al = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        while (numeros_al.size() < 10){
            System.out.print("Ingresa el numero: ");
            numeros_al.add(scan.nextInt());
        }
        // BUSCAMOS E IMPRIMIMOS LOS TERMINADOS EN 4 Y SU POSICION
        Iterator<Integer> it = numeros_al.iterator();
        while (it.hasNext()){
            Integer numero = it.next();
            if (numero % 10 == 4){
                System.out.println("El numero " + numero + " se encuentra en la posicion " + numeros_al.indexOf(numero));
            }
        }
    }
}
