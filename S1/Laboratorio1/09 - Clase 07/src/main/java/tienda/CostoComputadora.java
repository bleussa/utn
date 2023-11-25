package tienda;

import java.util.HashMap;
import java.util.Scanner;

public class CostoComputadora {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int seleccionUsuario = 0;

        while (seleccionUsuario != 2){
            System.out.println("## MENU ##");
            System.out.println("1. Generar presupuesto");
            System.out.println("2. Salir del menu");
            seleccionUsuario = scan.nextInt();

            switch (seleccionUsuario){
                case 1:
                    Computadora compu = Computadora.crearPresupuesto();
                    Computadora.mostrarPresupuesto(compu);
                    break;
                case 2:
                    System.out.println("Cerrando programa...");
                    break;
            }
        }

    }

}
