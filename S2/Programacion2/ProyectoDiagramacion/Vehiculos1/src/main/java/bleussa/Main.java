package bleussa;

public class Main {
    public static void main(String[] args) {

        // Creamos una bicicleta
        Bicicleta bicicleta = new Bicicleta(2, "Fernando", "Fibra de Carbono");

        // Creamos un auto
        Auto auto = new Auto(4, "Martina", 5);

        // Creamos una moto
        Moto moto = new Moto(2, "Maria", 149.5);

        System.out.println(bicicleta.toString());
        System.out.println("######");
        System.out.println(auto.toString());
        System.out.println("######");
        System.out.println(moto.toString());
    }
}