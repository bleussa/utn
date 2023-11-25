package bleussa;

import java.util.ArrayList;

public class Boeing747 extends Vehiculo{
    // ATRIBUTOS
    private static int viajes;

    // CONSTRUCTORES
    public Boeing747(double velocidadPromedio, int velocidadMaxima, ArrayList<Rueda> ruedas) {
        super(velocidadPromedio, velocidadMaxima, ruedas);
    }

    // METODOS
    public int getViajes() {
        return viajes;
    }
    public void setViajes(int viajes) {
        this.viajes = viajes;
    }
    public void despegar(){
        System.out.println("El avion despego...");
    }
    public void aterrizar(){
        System.out.println("El avion aterrizo...");
    }
    public static void agregarViaje(){
        viajes++;
    }

    @Override
    public void esquivarObstaculo() {
        System.out.println("El avion esquivo pajaros...");
    }
}
