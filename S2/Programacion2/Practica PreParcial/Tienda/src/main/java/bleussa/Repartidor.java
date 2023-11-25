package bleussa;

import java.util.ArrayList;

public class Repartidor extends Persona{
    private int numeroRepartidor;
    private ArrayList<Delivery> deliverys = new ArrayList<>();

    public Repartidor() {
    }

    public int getNumeroRepartidor() {
        return numeroRepartidor;
    }
    public void setNumeroRepartidor(int numeroRepartidor) {
        this.numeroRepartidor = numeroRepartidor;
    }

    public ArrayList<Delivery> getDeliverys() {
        return deliverys;
    }

    public void setDeliverys(ArrayList<Delivery> deliverys) {
        this.deliverys = deliverys;
    }
}
