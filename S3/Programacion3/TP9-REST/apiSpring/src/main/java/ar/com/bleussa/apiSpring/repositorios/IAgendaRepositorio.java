package ar.com.bleussa.apiSpring.repositorios;

import ar.com.bleussa.apiSpring.modelos.AgendaModelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAgendaRepositorio extends JpaRepository<AgendaModelo, Long> {



}
