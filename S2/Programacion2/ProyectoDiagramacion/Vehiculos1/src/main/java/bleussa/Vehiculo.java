package bleussa;

abstract class Vehiculo {
    // ATRIBUTOS
    private int ruedas;
    private String duenio;

    // CONSTRUCTORES
    public Vehiculo(int ruedas, String duenio) {
        this.ruedas = ruedas;
        this.duenio = duenio;
    }

    // METODOS
    public int getRuedas() {
        return ruedas;
    }
    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }
    public String getDuenio() {
        return duenio;
    }
    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }
    public double precio(){
        return 0;
    }
    public double velocidadMax(){
        return 0;
    }
}
