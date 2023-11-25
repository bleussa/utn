package bleuss;

import java.util.ArrayList;
import java.util.Scanner;

public class Problema3 {

    public static ArrayList<Integer> crearLista(){
        ArrayList<Integer> lista = new ArrayList<>();
        while (lista.size() < 20){
            Integer num = (int)(Math.random() * 100);
            if (num % 2 == 0){
                lista.add(num);
            }
        }
        return lista;
    }

    public static Double promedio(ArrayList<Integer> lista){
        Double suma = 0.0;
        for (Integer i : lista){
            suma += i;
        }
        return suma / lista.size();
    }

    public static Integer mayoresPromedio(ArrayList<Integer> lista, Double promedio){
        Integer cant = 0;
        for (Integer i : lista){
            if (i > promedio){
                cant++;
            }
        }
        return cant;
    }

    public static Integer menorPromedio(ArrayList<Integer> lista, Double promedio){
        Integer cant = 0;
        for (Integer i : lista){
            if (i < promedio){
                cant++;
            }
        }
        return cant;
    }
}
