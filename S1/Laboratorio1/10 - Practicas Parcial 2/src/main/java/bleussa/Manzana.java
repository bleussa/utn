package bleussa;

import java.util.ArrayList;
import java.util.Scanner;

public class Manzana {

    // ATRIBUTOS
    private double superficie;
    private String letra;
    private ArrayList<Casa> casas;

    // GETTERS Y SETTERS
    public double getSuperficie() {
        return superficie;
    }
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }
    public String getLetra() {
        return letra;
    }
    public void setLetra(String letra) {
        this.letra = letra;
    }
    public ArrayList<Casa> getCasas() {
        return casas;
    }
    public void setCasas(ArrayList<Casa> casas) {
        this.casas = casas;
    }

    // CONSTRUCTORES
    public Manzana(){};

    // METODOS
    public static Manzana crearManzana(ArrayList<String> tiposDeCasa, ArrayList<Manzana> listaManzanas){
        Manzana manzana = new Manzana();
        Scanner scan = new Scanner(System.in);

        // SUPERFICIE
        while (true){
            System.out.println("Ingrese la superficie de la manzana: ");
            Double superficieIngresada = scan.nextDouble();
            if (!superficieIngresada.toString().isEmpty()){
                manzana.setSuperficie(superficieIngresada);
                break;
            } else {
                System.out.println("ERROR: La superficie no puede estar vacia!");
            }
        }

        // LETRA
        while (true) {
            System.out.println("Ingrese la letra: ");
            String letraIngresada = scan.next();
            while(true){
                if(letraIngresada.trim().length() != 0) break;
                System.out.println("La letra no puede ser vacia");
                letraIngresada = scan.nextLine();
            }
            boolean repetida = false;
            for (Manzana mnzn : listaManzanas) {
                if(mnzn.getLetra().equalsIgnoreCase(letraIngresada)){
                    repetida = true;
                    break;
                }
            }
            if(!repetida){
                manzana.setLetra(letraIngresada);
                break;
            } else {
                System.out.println("ERROR: La letra ingresada ya existe!");
            }
            repetida = false;
        }





        return manzana;
    }

}
