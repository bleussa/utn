package bleussa;

public class Moto extends Vehiculo implements Motor{
    // ATRIBUTOS
    private double cilindraje;

    // CONSTRUCTORES
    public Moto(int ruedas, String duenio, double cilindraje) {
        super(ruedas, duenio);
        this.cilindraje = cilindraje;
    }

    // METODOS
    public double getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }
    @Override
    public String tipo() {
        return "Monocilindrico - Nafta";
    }
    @Override
    public double precio() {
        return 850000.75;
    }
    @Override
    public double velocidadMax() {
        return 110;
    }

    @Override
    public String toString() {
        return  "RUEDAS: " + this.getRuedas() + "\n" +
                "DUENIO: " + this.getDuenio() + "\n" +
                "CILINDRAJE: " + this.cilindraje + "\n" +
                "PRECIO: " + this.precio() + "\n" +
                "VEL_MAX: " + this.velocidadMax();
    }
}
