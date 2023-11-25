package bleussa;

import java.util.ArrayList;

public class Infraccion {
    private String descripInfraccion;
    private double importeInfraccion;
    private ArrayList<TipoDeInfraccion> infraccionNomenclada = new ArrayList();

    public Infraccion() {}

    public String getDescripInfraccion() {
        return descripInfraccion;
    }

    public void setDescripInfraccion(String descripInfraccion) {
        this.descripInfraccion = descripInfraccion;
    }

    public double getImporteInfraccion() {
        return importeInfraccion;
    }

    public void setImporteInfraccion(double importeInfraccion) {
        this.importeInfraccion = importeInfraccion;
    }

    public ArrayList<TipoDeInfraccion> getInfraccionNomenclada() {
        return infraccionNomenclada;
    }

    public void setInfraccionNomenclada(ArrayList<TipoDeInfraccion> infraccionNomenclada) {
        this.infraccionNomenclada = infraccionNomenclada;
    }
}
