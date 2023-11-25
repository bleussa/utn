package video1parte2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Escribi un dia de la semana: ");
        String dia = scan.next();

        DiasSemana dias = DiasSemana.valueOf(dia.toUpperCase());

        System.out.println(dias.toString());
    }
}