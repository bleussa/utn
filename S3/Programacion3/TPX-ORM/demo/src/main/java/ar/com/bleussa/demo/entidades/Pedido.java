package ar.com.bleussa.demo.entidades;

import ar.com.bleussa.demo.util.Estado;
import ar.com.bleussa.demo.util.TipoEnvio;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Pedido implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Date fecha;

    private Estado estado;

    private Date horaEstimadaEntrega;

    private TipoEnvio tipoEnvio;

    private double total;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    private Factura factura;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DetallePedido> detallePedidos = new ArrayList<>();

}
