package bleussa;

public class DocumentoVenta implements Estado{
    // METODOS
    private int numeroDocumentoVenta;
    private double monto;
    private EstadoPedido estado;

    // CONSTRUCTOR
    public DocumentoVenta() {
    }

    // METODOS
    @Override
    public boolean estadoPedido(EstadoPedido estado) {
        return false;
    }
    public int getNumeroDocumentoVenta() {
        return numeroDocumentoVenta;
    }
    public void setNumeroDocumentoVenta(int numeroDocumentoVenta) {
        this.numeroDocumentoVenta = numeroDocumentoVenta;
    }
    public double getMonto() {
        return monto;
    }
    public void setMonto(double monto) {
        this.monto = monto;
    }
    public EstadoPedido getEstado() {
        return estado;
    }
    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }
}
