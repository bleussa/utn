package bleussa;

public class Factura {
    // ATRIBUTOS
    private Empleado empleado;
    private Cliente cliente;
    private int nroFactura;
    private String fecha;
    private double monto;

    // CONSTRUCTORES
    public Factura(Empleado empleado, Cliente cliente, int nroFactura, String fecha, double monto) {
        this.empleado = new Empleado();
        this.cliente = new Cliente();
        this.nroFactura = nroFactura;
        this.fecha = fecha;
        this.monto = monto;
    }

    // METODOS
    public Empleado getEmpleado() {
        return empleado;
    }
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public int getNroFactura() {
        return nroFactura;
    }
    public void setNroFactura(int nroFactura) {
        this.nroFactura = nroFactura;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public double getMonto() {
        return monto;
    }
    public void setMonto(double monto) {
        this.monto = monto;
    }
}
