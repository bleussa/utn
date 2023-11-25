package bleuss;

import java.util.ArrayList;
import java.util.Scanner;

public class Problema2 {

    static Scanner scan;

    public static ArrayList<Integer> crearLista(){
        scan = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        int i = 1;
        while (lista.size() < 20){
            System.out.println("VALOR " + i + ": ");
            lista.add(scan.nextInt());
            i++;
        }
        return lista;
    }

    public static Integer mayor(ArrayList<Integer> lista){
        Integer mayor = lista.get(0);
        for (Integer i : lista){
            if (i > mayor) mayor = i;
        }
        return mayor;
    }

    public static Integer menor(ArrayList<Integer> lista){
        Integer menor = lista.get(0);
        for (Integer i : lista){
            if (i < menor) menor = i;
        }
        return menor;
    }

}
