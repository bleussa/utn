package bleussa;

import java.util.ArrayList;

abstract class Moto extends Vehiculo{
    // ATRIBUTOS
    private int nroRueda = 2;

    // CONSTRUCTORES
    public Moto(double velocidadPromedio, int velocidadMaxima, ArrayList<Rueda> ruedas) {
        super(velocidadPromedio, velocidadMaxima, ruedas);
    }

    // METODOS
    public int getNroRueda() {
        return nroRueda;
    }
    public void setNroRueda(int nroRueda) {
        this.nroRueda = nroRueda;
    }
}
