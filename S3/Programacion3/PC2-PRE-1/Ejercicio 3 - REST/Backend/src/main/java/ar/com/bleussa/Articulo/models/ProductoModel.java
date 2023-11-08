package ar.com.bleussa.Articulo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "productos")
public class ProductoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String descripcion;

    private double precio;

    @ManyToOne
    private RubroModel rubro;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public RubroModel getRubro() {
        return rubro;
    }

    public void setRubro(RubroModel rubro) {
        this.rubro = rubro;
    }
}
