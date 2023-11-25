package bleussa;

import java.util.ArrayList;

public class HondaXR25 extends Moto{
    // CONSTRUCTORES
    public HondaXR25(double velocidadPromedio, int velocidadMaxima, ArrayList<Rueda> ruedas) {
        super(velocidadPromedio, velocidadMaxima, ruedas);
    }

    // METODOS
    @Override
    public void esquivarObstaculo() {
        System.out.println("La tornado al monte...");
    }
}
