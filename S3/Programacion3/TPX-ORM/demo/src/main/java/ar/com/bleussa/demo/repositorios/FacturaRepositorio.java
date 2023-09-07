package ar.com.bleussa.demo.repositorios;

import ar.com.bleussa.demo.entidades.Factura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacturaRepositorio extends JpaRepository<Factura, Long> {


}
