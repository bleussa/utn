package bleussa;

public class TipoDeInfraccion {
    // ATRIBUTOS
    private int id_infrac;
    private String descripInfraccion;
    private String tipoGravedad;
    private double importeAsignadoInfraccion;
    private double porcentajeDescuento;

    // CONSTRUCTORES
    public TipoDeInfraccion(){};

    // METODOS
    public void infoTipoInfraccion(){
        System.out.println("infoTipoInfraccion");
    }
    public int getId_infrac() {
        return id_infrac;
    }
    public void setId_infrac(int id_infrac) {
        this.id_infrac = id_infrac;
    }
    public String getDescripInfraccion() {
        return descripInfraccion;
    }
    public void setDescripInfraccion(String descripInfraccion) {
        this.descripInfraccion = descripInfraccion;
    }
    public String getTipoGravedad() {
        return tipoGravedad;
    }
    public void setTipoGravedad(String tipoGravedad) {
        this.tipoGravedad = tipoGravedad;
    }
    public double getImporteAsignadoInfraccion() {
        return importeAsignadoInfraccion;
    }
    public void setImporteAsignadoInfraccion(double importeAsignadoInfraccion) {
        this.importeAsignadoInfraccion = importeAsignadoInfraccion;
    }
    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }
    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }
}
