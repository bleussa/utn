package ar.com.bleussa.demo.entidades;

import ar.com.bleussa.demo.util.TipoProducto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Producto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private TipoProducto tipoProducto;

    private int tiempoEstimadoCocina;

    private String denominacion;

    private Double precioVenta;

    private Double precioCompra;

    private int stockActual;

    private int stockMinimo;

    private String unidadMedida;

    private String foto;

    private String receta;

}
