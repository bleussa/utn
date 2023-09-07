package ar.com.bleussa.demo.repositorios;

import ar.com.bleussa.demo.entidades.Rubro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RubroRepositorio extends JpaRepository<Rubro,Long> {
}
