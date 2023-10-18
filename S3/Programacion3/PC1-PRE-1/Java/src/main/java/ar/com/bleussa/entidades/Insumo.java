package ar.com.bleussa.entidades;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Insumo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idInsumo;

    private String denominacion;
    private double precioCosto;
    private int stockActual;
    private String unidadMedida;

    @OneToMany(mappedBy = "insumo")
    private List<ProductoManufacturadoDetalle> productosManufacturadosDetalles = new ArrayList<>();

    public int getIdInsumo() {
        return idInsumo;
    }

    public void setIdInsumo(int idInsumo) {
        this.idInsumo = idInsumo;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public double getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(double precioCosto) {
        this.precioCosto = precioCosto;
    }

    public int getStockActual() {
        return stockActual;
    }

    public void setStockActual(int stockActual) {
        this.stockActual = stockActual;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public List<ProductoManufacturadoDetalle> getProductosManufacturadosDetalles() {
        return productosManufacturadosDetalles;
    }

    public void setProductosManufacturadosDetalles(List<ProductoManufacturadoDetalle> productosManufacturadosDetalles) {
        this.productosManufacturadosDetalles = productosManufacturadosDetalles;
    }
}
