package bleussa;

import java.util.ArrayList;

public class Barco extends Vehiculo{
    // CONSTRUCTOR
    public Barco(double velocidadPromedio, int velocidadMaxima, ArrayList<Rueda> ruedas) {
        super(velocidadPromedio, velocidadMaxima, ruedas);
    }
    @Override
    public void esquivarObstaculo() {
        System.out.println("Dobla el timonel...");
    }
}
