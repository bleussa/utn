package bleussa;

public class Factura extends DocumentoVenta{
    // ATRIBUTOS
    private int numeroFactura;
    private TipoFactura tipoFactura;

    // CONSTRUCTORES
    public Factura() {
    }

    // METODOS
    public int getNumeroFactura() {
        return numeroFactura;
    }
    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }
    public TipoFactura getTipoFactura() {
        return tipoFactura;
    }
    public void setTipoFactura(TipoFactura tipoFactura) {
        this.tipoFactura = tipoFactura;
    }
}
