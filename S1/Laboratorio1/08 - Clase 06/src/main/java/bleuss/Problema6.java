package bleuss;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;


public class Problema6 {

    static Scanner sc = new Scanner(System.in);

    public static void cargarArray(ArrayList<Integer> lista){
        while (lista.size() < 10){
            System.out.println("Numero a cargar: ");
            lista.add(sc.nextInt());
        }
    }

    public static ArrayList<Integer> ordenarArrayAsc(ArrayList<Integer> lista){
        Collections.sort(lista);
        return lista;
    }

    public static ArrayList<Integer> ordenarArrayDesc(ArrayList<Integer> lista){
        Collections.reverseOrder();
        return lista;
    }

}
