package NumMayorPrimo;
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
            boolean primo = true;
            if (numeros_an[i] == 0 || numeros_an[i] == 1 || numeros_an[i] == 4){
                primo = false;
            } else {
                for (int x = 2; x < numeros_an[i] / 2; x++){
                    if (numeros_an[i] % x == 0){
                        primo = false;
                        break;
                    }
                }
            }
            if (primo && numeros_an[i] > mayor){
                mayor = numeros_an[i];
                pos = i;
            }
        }
        // IMPRIMIMOS EL RESULTADO
        System.out.println("El numero primo más grande se encuentra en la posicion " + pos + " y es el " + mayor);
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
            boolean primo = true;
            if (numeros_al.get(i) == 0 || numeros_al.get(i) == 1 || numeros_al.get(i) == 4){
                primo = false;
            } else {
                for (int x = 2; x < numeros_al.get(i) / 2; x++){
                    if (numeros_al.get(i) % x == 0){
                        primo = false;
                        break;
                    }
                }
            }
            if (primo && numeros_al.get(i) > mayor){
                mayor = numeros_al.get(i);
                pos = i;
            }
        }
        // IMPRIMIMOS EL RESULTADO
        System.out.println("El numero primo más grande se encuentra en la posicion " + pos + " y es el " + mayor);
    }
}
