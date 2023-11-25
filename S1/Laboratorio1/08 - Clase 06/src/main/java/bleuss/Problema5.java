package bleuss;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Problema5 {

    public static void cargarArray(ArrayList<Integer> lista){
        while (lista.size() < 50){
            lista.add((int) (Math.random() * 100));
        }
    }

    public static String busquedaSecuencial(ArrayList<Integer> lista, Integer valorBusqueda){
        for (Integer number : lista){
            if (number == valorBusqueda){
                return "Elemento " + number + " encontrado en la posicion " + lista.indexOf(valorBusqueda);
            }
        }
        return "Elemento no encontrado";
    }

}
