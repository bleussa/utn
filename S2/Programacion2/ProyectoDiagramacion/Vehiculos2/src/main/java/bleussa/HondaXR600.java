package bleussa;

import java.util.ArrayList;

public class HondaXR600 extends Moto{
    public HondaXR600(double velocidadPromedio, int velocidadMaxima, ArrayList<Rueda> ruedas) {
        super(velocidadPromedio, velocidadMaxima, ruedas);
    }

    @Override
    public void esquivarObstaculo() {
        System.out.println("...");
    }
}
