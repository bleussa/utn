package bleussalbert.trabajopractico2;

import java.util.Scanner;

public class OperacionFracciones {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int valor1 = sc.nextInt();
        int valor2 = sc.nextInt();
        int valor3 = sc.nextInt();
        int valor4 = sc.nextInt();

        Fraccion fraccion1 = new Fraccion(valor1, valor2);
        Fraccion fraccion2 = new Fraccion(valor3, valor4);

        Fraccion frac1 = new Fraccion();
        frac1 = frac1.sumarFracciones(fraccion1,fraccion2);
        System.out.println(frac1.getNumerador() + " / " + frac1.getDenominador());

        Fraccion frac2 = new Fraccion();
        frac2 = frac2.restarFracciones(fraccion1,fraccion2);
        System.out.println(frac2.getNumerador() + " / " + frac2.getDenominador());

        Fraccion frac3 = new Fraccion();
        frac3 = frac3.multiplicarFracciones(fraccion1,fraccion2);
        System.out.println(frac3.getNumerador() + " / " + frac3.getDenominador());

        Fraccion frac4 = new Fraccion();
        frac4 = frac4.dividirFracciones(fraccion1,fraccion2);
        System.out.println(frac4.getNumerador() + " / " + frac4.getDenominador());

    }

}
