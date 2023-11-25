package bleussa;

public class Auto extends Vehiculo implements Motor{
    // ATRIBUTOS
    private int puertas;

    // CONSTRUCTORES
    public Auto(int ruedas, String duenio, int puertas) {
        super(ruedas, duenio);
        this.puertas = puertas;
    }

    // METODOS
    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
    @Override
    public String tipo() {
        return "4 Cilindros - Diesel";
    }
    @Override
    public double precio() {
        return 1690000.00;
    }
    @Override
    public double velocidadMax() {
        return 220;
    }

    @Override
    public String toString() {
        return  "RUEDAS: " + this.getRuedas() + "\n" +
                "DUENIO: " + this.getDuenio() + "\n" +
                "PUERTAS: " + this.puertas + "\n" +
                "PRECIO: " + this.precio() + "\n" +
                "VEL_MAX: " + this.velocidadMax();
    }
}
