package bleuss;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problema4 {

    static Scanner scan;

    public static ArrayList<String> crearLista(){
        scan = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        while (1 == 1){
            System.out.println("PALABRA: ");
            String valorIngresado = scan.next();
            if (!valorIngresado.equalsIgnoreCase("salir")){
                lista.add(valorIngresado);
            } else {
                break;
            }
        }
        return lista;
    }

    public static String mayor(ArrayList<String> lista){
        String palabraLarga = lista.get(0);
        for (String i : lista){
            if (i.length() > palabraLarga.length())
                palabraLarga = i;
        }
        return palabraLarga;
    }

    public static boolean palabraRepetida(ArrayList<String> lista){
        for (int i = 0; i < lista.size(); i++) {
            if (lista.subList((i + 1), lista.size()).contains(lista.get(i))) {
                return true;
            }
        }
        return false;
    }

    public static Map<String, Integer> palabrasRepetidas(ArrayList<String> listaPalabras) {
        Map<String, Integer> palabrasRepetidas = new HashMap<>();
        for (String palabra : listaPalabras) {
            if (palabrasRepetidas.containsKey(palabra)) {
                palabrasRepetidas.put(palabra, palabrasRepetidas.get(palabra) + 1);
            } else {
                palabrasRepetidas.put(palabra, 1);
            }
        }
        return palabrasRepetidas;

    }

}
