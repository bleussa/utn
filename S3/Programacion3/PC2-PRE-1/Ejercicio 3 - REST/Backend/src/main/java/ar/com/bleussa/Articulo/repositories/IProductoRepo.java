package ar.com.bleussa.Articulo.repositories;

import ar.com.bleussa.Articulo.models.ProductoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductoRepo  extends JpaRepository<ProductoModel, Long> {

}
