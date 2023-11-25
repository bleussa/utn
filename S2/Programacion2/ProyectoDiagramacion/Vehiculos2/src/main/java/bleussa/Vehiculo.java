package bleussa;

import java.util.ArrayList;

abstract class Vehiculo implements Desplazable{
    // ATRIBUTOS
    private double velocidadPromedio;
    private int velocidadMaxima;
    public ArrayList<Rueda> ruedas = new ArrayList<>();

    // CONSTRUCTORES
    public Vehiculo(double velocidadPromedio, int velocidadMaxima, ArrayList<Rueda> ruedas) {
        this.velocidadPromedio = velocidadPromedio;
        this.velocidadMaxima = velocidadMaxima;
        this.ruedas = ruedas;
    }

    // METODOS
    public double getVelocidadPromedio() {
        return velocidadPromedio;
    }
    public void setVelocidadPromedio(double velocidadPromedio) {
        this.velocidadPromedio = velocidadPromedio;
    }
    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }
    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public ArrayList<Rueda> getRuedas() {
        return ruedas;
    }

    public void setRuedas(ArrayList<Rueda> ruedas) {
        this.ruedas = ruedas;
    }

    public void romperInercia(){
        System.out.println("El vehiculo rompio la incercia...");
    }
}
