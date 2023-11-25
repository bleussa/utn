package bleussa;

import java.util.ArrayList;

abstract class Auto extends Vehiculo{
    // ATRIBUTOS
    private int nroRueda = 4;

    // CONSTRUCTORES
    public Auto(double velocidadPromedio, int velocidadMaxima, ArrayList<Rueda> ruedas) {
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
