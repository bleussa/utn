package video2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Mes[] meses = Mes.values();

        System.out.print("Escribe un numero de dias: ");
        int dias = scan.nextInt();

        for(int i = 0; i < meses.length; i++){
            if(meses[i].getNumDias() == dias){
                System.out.println(meses[i].toString());
            }
        }
    }
}
