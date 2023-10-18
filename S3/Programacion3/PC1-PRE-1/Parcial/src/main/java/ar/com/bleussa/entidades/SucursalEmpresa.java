package ar.com.bleussa.entidades;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class SucursalEmpresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSucursal;

    private String razonSocial;
    private String cuit;
    private long telefono;
    private String email;

    @ManyToMany
    @JoinTable(name = "productos_has_empresas", joinColumns = @JoinColumn(name = "id_sucursal_empresa"), inverseJoinColumns = @JoinColumn(name = "id_producto_manufacturado"))
    private List<ProductoManufacturado> productosManufacturados = new ArrayList<>();

    public int getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(int idSucursal) {
        this.idSucursal = idSucursal;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<ProductoManufacturado> getProductosManufacturados() {
        return productosManufacturados;
    }

    public void setProductosManufacturados(List<ProductoManufacturado> productosManufacturados) {
        this.productosManufacturados = productosManufacturados;
    }

    /*
    Codifique en la clase SucursalEmpresa el método public List
    <ProductoManufacturado> getProductosXTiempoFabricacion (int
    tiempoMaximo) {} que recupere y retorne la totalidad de productos
    manufacturados asociados a la Sucursal cuyo tiempo de fabricación sea menor o
    igual al tiempo máximo indicado.
    */
    public List<ProductoManufacturado> getProductosXTiempoFabricacion (int tiempoMaximo) {
        List<ProductoManufacturado> productoManufacturados = new ArrayList<>();

        for (ProductoManufacturado producto : this.productosManufacturados) {
            if (producto.getTiempoFabricacion() <= tiempoMaximo){
                productoManufacturados.add(producto);
            }
        }

        return productoManufacturados;
    }
}
