package bleussa;

public class TarjetaDeCredito {
    // ATRIBUTOS
    private String fechaIngreso;
    private double limite;

    // CONSTRUCTORES

    public TarjetaDeCredito() {
    }
    public TarjetaDeCredito(String fechaIngreso, double limite) {
        this.fechaIngreso = fechaIngreso;
        this.limite = limite;
    }

    // METODOS
    public String getFechaIngreso() {
        return fechaIngreso;
    }
    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    public double getLimite() {
        return limite;
    }
    public void setLimite(double limite) {
        this.limite = limite;
    }
}
