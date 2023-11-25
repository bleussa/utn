package bleussalbert.trabajopractico2;

public class Recursividad {

    public static int sumaRecursiva(int numero){
        if (numero == 1){
            return 1;
        } else {
            return numero + sumaRecursiva(numero-1);
        }
    }

    public static int sumaDigitosRecursiva(int numero){
        if (numero==0){
            return 0;
        } else {
            return sumaDigitosRecursiva(numero / 10) + numero % 10;
        }
    }

    public static String fraseReves(String frase){
        if (frase.length() <= 1)
            return frase;
        else {
            // System.out.println(frase + " | " + frase.substring(1) + " | " + frase.charAt(0));
            return fraseReves(frase.substring(1)) + frase.charAt(0);
        }
    }

}
