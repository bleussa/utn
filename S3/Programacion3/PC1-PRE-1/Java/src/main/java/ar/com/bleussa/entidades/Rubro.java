package ar.com.bleussa.entidades;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Rubro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRubro;

    private String denominacion;

    @OneToMany(mappedBy = "rubro")
    private List<ProductoManufacturado> productosManufacturados = new ArrayList<>();

    @ManyToOne(cascade = CascadeType.ALL)
    private Rubro rubro;

    @OneToMany
    private List<Rubro> rubros = new ArrayList<>();

    public int getIdRubro() {
        return idRubro;
    }

    public void setIdRubro(int idRubro) {
        this.idRubro = idRubro;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public List<ProductoManufacturado> getProductosManufacturados() {
        return productosManufacturados;
    }

    public void setProductosManufacturados(List<ProductoManufacturado> productosManufacturados) {
        this.productosManufacturados = productosManufacturados;
    }

    public Rubro getRubro() {
        return rubro;
    }

    public void setRubro(Rubro rubro) {
        this.rubro = rubro;
    }

    public List<Rubro> getRubros() {
        return rubros;
    }

    public void setRubros(List<Rubro> rubros) {
        this.rubros = rubros;
    }

    /*
    Codifique en la clase Rubro el método public List<ProductoManufacturado>
    getProductosXRubro(){} que recupere y retorne la totalidad de productos
    manufacturados asociados al rubro, contemplando la jerarquía de rubros
    existente, es decir hay se debe retornar los productos del rubro inicial y de todos
    los hijos. Ayuda: Use Recursión.
    */
    public ArrayList<ProductoManufacturado> getProductosXRubro(){
        ArrayList<ProductoManufacturado> productosManufacturados = new ArrayList<>();

        this.listaRecursivo(this, productosManufacturados);

        return productosManufacturados;
    }

    private void listaRecursivo(Rubro rubroHijo, ArrayList<ProductoManufacturado> listado){

        if(!rubroHijo.getProductosManufacturados().isEmpty()){
            for(ProductoManufacturado producto : this.getProductosManufacturados()){
                listaRecursivo(this, listado);
            }
        }

    }

    /*
    Codifique en la clase Rubro el método public ProductoManufacturado
    getProductoMayorPrecio(){} que recupere y retorne el producto con mayor
    precio de venta asociado al Rubro, reutilice los métodos b y c desarrollados
    anteriormente
    */
    public ProductoManufacturado getProductoMayorPrecio(){
        ArrayList<ProductoManufacturado> productos = getProductosXRubro();
        ProductoManufacturado productoMasCaro = productos.get(0);

        for (ProductoManufacturado producto : productos) {
            if (producto.getPrecioVenta() > productoMasCaro.getPrecioVenta()){
                productoMasCaro = producto;
            }
        }

        return productoMasCaro;
    }
}
