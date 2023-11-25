package video1parte1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Escribi un dia de la semana: ");
        String dia = scan.next();

        DiasSemana dias = DiasSemana.valueOf(dia.toUpperCase());

        switch (dias){
            case LUNES:
            case MARTES:
            case MIERCOLES:
            case JUEVES:
            case VIERNES:
                System.out.println("El día " + dias.name().toLowerCase() + " es laborable");
                break;
            case SABADO:
            case DOMINGO:
                System.out.println("El día " + dias.name().toLowerCase() + " no es laborable");
                break;
        }
    }
}