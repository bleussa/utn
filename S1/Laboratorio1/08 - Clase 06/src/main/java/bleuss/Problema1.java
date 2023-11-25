package bleuss;

import java.util.ArrayList;
import java.util.Scanner;

public class Problema1 {

    static Scanner scan;
    public static void CrearArrayList() {
        scan = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        Integer valorIngresado;
        do{
            System.out.println("Ingrese un numero: ");
            valorIngresado = scan.nextInt();
            if (valorIngresado >= 0){
                array.add(valorIngresado);
            } else {
                System.out.println("Secuencia Finalizada");
            }
        } while (valorIngresado >= 0);

        for (int i = 0; i < array.size(); i++){
            System.out.print(array.get(i) + " ");
        }
    }
}
