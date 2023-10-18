package ar.com.bleussa.entidades;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class ProductoManufacturado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProducto;

    private String codigo;

    private int tiempoFabricacion;

    private String denominacion;

    private double precioVenta;

    private double margenGanancia;

    @ManyToOne(cascade = CascadeType.ALL)
    private Rubro rubro;

    @OneToMany(mappedBy = "productoManufacturado")
    private List<ProductoManufacturadoDetalle> productosManufacturadosDetalles = new ArrayList<>();

    @ManyToMany(mappedBy = "productosManufacturados")
    private List<SucursalEmpresa> sucursalesEmpresas = new ArrayList<>();

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getTiempoFabricacion() {
        return tiempoFabricacion;
    }

    public void setTiempoFabricacion(int tiempoFabricacion) {
        this.tiempoFabricacion = tiempoFabricacion;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public double getMargenGanancia() {
        return margenGanancia;
    }

    public void setMargenGanancia(double margenGanancia) {
        this.margenGanancia = margenGanancia;
    }

    public Rubro getRubro() {
        return rubro;
    }

    public void setRubro(Rubro rubro) {
        this.rubro = rubro;
    }

    public List<ProductoManufacturadoDetalle> getProductosManufacturadosDetalles() {
        return productosManufacturadosDetalles;
    }

    public void setProductosManufacturadosDetalles(List<ProductoManufacturadoDetalle> productosManufacturadosDetalles) {
        this.productosManufacturadosDetalles = productosManufacturadosDetalles;
    }

    public List<SucursalEmpresa> getSucursalesEmpresas() {
        return sucursalesEmpresas;
    }

    public void setSucursalesEmpresas(List<SucursalEmpresa> sucursalesEmpresas) {
        this.sucursalesEmpresas = sucursalesEmpresas;
    }

    /*
    Codifique en la clase ProductoManufacturado el método public void
    getPrecioVentaCalculado(){} que asigne al atributo precioVenta el precio de
    venta del articulo contemplando el precio de costo de los insumos y el margen de
    ganancia que se le aplica al producto.
    */

    public void getPrecioVentaCalculado() {
        double costosInsumos = 0;
        for (ProductoManufacturadoDetalle insumo : this.productosManufacturadosDetalles) {
            costosInsumos += insumo.getInsumo().getPrecioCosto();
        }
        this.precioVenta = costosInsumos + this.margenGanancia;
    }

}
