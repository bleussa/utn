package bleussa;

public class Pago implements Estado{
    private int numeroPago;
    private String descripcion;
    private EstadoPedido estado;
    private double montoTotal;

    public Pago() {
    }


    public int getNumeroPago() {
        return numeroPago;
    }
    public void setNumeroPago(int numeroPago) {
        this.numeroPago = numeroPago;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    @Override
    public boolean estadoPedido(EstadoPedido estado) {
        return false;
    }
}
