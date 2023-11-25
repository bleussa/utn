package bleussa;

import java.util.ArrayList;

public class Pedido implements Estado{
    private int numeroPedido;
    private double monto;
    private EstadoPedido estado;
    private Entrega entrega;
    private Pago pago = new Pago();
    private DocumentoVenta documentoVenta = new DocumentoVenta();
    private ArrayList<DetallePedido> detallesPedidos = new ArrayList<>();

    public Pedido() {
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
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

    public Entrega getEntrega() {
        return entrega;
    }

    public void setEntrega(Entrega entrega) {
        this.entrega = entrega;
    }

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }

    public DocumentoVenta getDocumentoVenta() {
        return documentoVenta;
    }

    public void setDocumentoVenta(DocumentoVenta documentoVenta) {
        this.documentoVenta = documentoVenta;
    }

    public ArrayList<DetallePedido> getDetallesPedidos() {
        return detallesPedidos;
    }

    public void setDetallesPedidos(ArrayList<DetallePedido> detallesPedidos) {
        this.detallesPedidos = detallesPedidos;
    }

    @Override
    public boolean estadoPedido(EstadoPedido estado) {
        return false;
    }
}
