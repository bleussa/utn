package NumPrimos2;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        // ARRAY NATIVO
        arrayNativo();

        // ARRAY LIST
        arrayList();

    }

    public static void arrayNativo(){
        // BUSCAMOS LOS PRIMEROS NUMEROS PRIMOS ENTRE 100 Y 300
        int[] numeros_an = new int[10];
        int pos = 0;
        for (int i = 100; i < 300; i++){
            boolean primo = true;
            if (i == 0 || i == 1 || i == 4){
                primo = false;
            } else {
                for (int x = 2; x < i / 2; x++){
                    if (i % x == 0){
                        primo = false;
                        break;
                    }
                }
            }
            if (primo && pos <= 9){
                numeros_an[pos] = i;
                pos++;
            }
        }
        // IMPRIMIMOS TODOS LOS NUMEROS PRIMOS QUE QUEDARON EN EL ARREGLO
        for (int i = 0; i < numeros_an.length; i++){
            System.out.println("ARREGLO NATIVO - POSICION " + i + " = " + numeros_an[i]);
        }
    }

    public static void arrayList(){
        // BUSCAMOS LOS PRIMEROS NUMEROS PRIMOS ENTRE 100 Y 300
        ArrayList<Integer> numeros_al = new ArrayList<>();
        int pos = 0;
        for (int i = 100; i < 300; i++){
            boolean primo = true;
            if (i == 0 || i == 1 || i == 4){
                primo = false;
            } else {
                for (int x = 2; x < i / 2; x++){
                    if (i % x == 0){
                        primo = false;
                        break;
                    }
                }
            }
            if (primo && numeros_al.size() < 10){
                numeros_al.add(i);
            }
        }
        // IMPRIMIMOS TODOS LOS NUMEROS PRIMOS QUE QUEDARON EN EL ARREGLO
        Iterator<Integer> it = numeros_al.iterator();
        while (it.hasNext()){
            Integer numero = it.next();
            System.out.println("ARREGLO ARRAYLIST - POSICION " + numeros_al.indexOf(numero) + " = " + numero);
        }
    }
}
