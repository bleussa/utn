package primerEjercicio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(calcula(5, 0));

    }

    public static float divide(float a, float b) throws Exception{
        if (b == 0) throw new Exception();
        return a / b;
    };

    public static float calcula(float a, float b){
        Scanner scan = new Scanner(System.in);
        float result = 0;

        try {
            result = a - b + divide(a,b);
        } catch (Exception e) {
            System.out.println("ERROR: Intentaste dividir por 0 \n");
            System.out.println("Ingresa el dato a: ");
            float num1 = scan.nextFloat();
            System.out.println("Ingresa el dato b: ");
            float num2 = scan.nextFloat();
            return calcula(num1, num2);
        }

        return result;
    }





}