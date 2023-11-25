package NumMayor;
import java.util.ArrayList;
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
        // BUSCAMOS EL MAYOR Y SU POSICION
        int mayor = 0;
        int pos = 0;
        for (int i = 0; i < numeros_an.length; i++) {
            if (numeros_an[i] > mayor){
                mayor = numeros_an[i];
                pos = i;
            }
        }
        // IMPRIMIMOS EL RESULTADO
        System.out.println("El numero más grande se encuentra en la posicion " + pos + " y es el " + mayor);
    }

    public static void arrayList(){
        // LEEMOS LOS DIEZ NUMEROS
        ArrayList<Integer> numeros_al = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        while (numeros_al.size() < 10){
            System.out.print("Ingresa el numero: ");
            numeros_al.add(scan.nextInt());
        }
        // BUSCAMOS EL MAYOR Y SU POSICION
        int mayor = 0;
        int pos = 0;
        for (int i = 0; i < numeros_al.size(); i++) {
            if (numeros_al.size() > mayor){
                mayor = numeros_al.get(i);
                pos = i;
            }
        }
        // IMPRIMIMOS EL RESULTADO
        System.out.println("El numero más grande se encuentra en la posicion " + pos + " y es el " + mayor);
    }
}
