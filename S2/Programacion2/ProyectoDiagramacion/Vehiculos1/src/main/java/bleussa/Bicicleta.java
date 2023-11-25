package bleussa;

public class Bicicleta extends Vehiculo{
    // ATRIBUTOS
    private String materialCuadro;

    // CONSTRUCTORES
    public Bicicleta(int ruedas, String duenio, String materialCuadro) {
        super(ruedas, duenio);
        this.materialCuadro = materialCuadro;
    }

    // METODOS
    public String getMaterialCuadro() {
        return materialCuadro;
    }
    public void setMaterialCuadro(String materialCuadro) {
        this.materialCuadro = materialCuadro;
    }

    @Override
    public double precio() {
        return 75000.99;
    }
    @Override
    public double velocidadMax() {
        return 50;
    }

    @Override
    public String toString() {
        return  "RUEDAS: " + this.getRuedas() + "\n" +
                "DUENIO: " + this.getDuenio() + "\n" +
                "MATERIAL_CUADRO: " + this.getMaterialCuadro() + "\n" +
                "PRECIO: " + this.precio() + "\n" +
                "VEL_MAX: " + this.velocidadMax();
    }
}
