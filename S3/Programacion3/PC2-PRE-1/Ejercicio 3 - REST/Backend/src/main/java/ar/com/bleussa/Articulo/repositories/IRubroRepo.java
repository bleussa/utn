package ar.com.bleussa.Articulo.repositories;

import ar.com.bleussa.Articulo.models.RubroModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRubroRepo extends JpaRepository<RubroModel, Long> {

}
