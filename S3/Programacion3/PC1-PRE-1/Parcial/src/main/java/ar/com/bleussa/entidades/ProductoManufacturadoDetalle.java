package ar.com.bleussa.entidades;

import javax.persistence.*;

@Entity
public class ProductoManufacturadoDetalle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDetalleProducto;

    private int cantidad;

    @ManyToOne(cascade = CascadeType.ALL)
    private ProductoManufacturado productoManufacturado;

    @ManyToOne(cascade = CascadeType.ALL)
    private Insumo insumo;

    public int getIdDetalleProducto() {
        return idDetalleProducto;
    }

    public void setIdDetalleProducto(int idDetalleProducto) {
        this.idDetalleProducto = idDetalleProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public ProductoManufacturado getProductoManufacturado() {
        return productoManufacturado;
    }

    public void setProductoManufacturado(ProductoManufacturado productoManufacturado) {
        this.productoManufacturado = productoManufacturado;
    }

    public Insumo getInsumo() {
        return insumo;
    }

    public void setInsumo(Insumo insumo) {
        this.insumo = insumo;
    }
}
