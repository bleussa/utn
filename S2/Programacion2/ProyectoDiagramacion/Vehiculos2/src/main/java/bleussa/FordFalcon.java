package bleussa;

import java.util.ArrayList;

public class FordFalcon extends Auto{
    public FordFalcon(double velocidadPromedio, int velocidadMaxima, ArrayList<Rueda> ruedas) {
        super(velocidadPromedio, velocidadMaxima, ruedas);
    }

    @Override
    public void esquivarObstaculo() {
        System.out.println("Hidraulica la direccion del falcon, una manteca...");
    }
}
