package ar.com.bleussa.demo.repositorios;

import ar.com.bleussa.demo.entidades.DetallePedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetallePedidoRepositorio extends JpaRepository<DetallePedido, Long> {
}
