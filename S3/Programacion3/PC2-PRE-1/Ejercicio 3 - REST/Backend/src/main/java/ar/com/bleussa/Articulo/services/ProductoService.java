package ar.com.bleussa.Articulo.services;

import ar.com.bleussa.Articulo.DBConnection;
import ar.com.bleussa.Articulo.models.ProductoModel;
import ar.com.bleussa.Articulo.models.RubroModel;
import ar.com.bleussa.Articulo.repositories.IProductoRepo;
import ar.com.bleussa.Articulo.repositories.IRubroRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {

    @Autowired
    private IProductoRepo productoRepo;

    @Autowired
    IRubroRepo rubroRepo;

    public ArrayList<ProductoModel> getProductos(){
        List<ProductoModel> listado = productoRepo.findAll();

        return (ArrayList<ProductoModel>) productoRepo.findAll();
    }

    public ArrayList<ProductoModel> getProductosByRubro(long idRubro){
        ArrayList<ProductoModel> listado = new ArrayList<>();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = DBConnection.getConnection();

            // Crear la consulta SQL
            String sql = "SELECT * FROM productos WHERE rubro_id = '" + idRubro + "'";

            // Preparar la consulta
            stmt = conn.prepareStatement(sql);

            // Ejecutar la consulta
            rs = stmt.executeQuery();

            // Procesar los resultados y crear objetos ProductoModel
            while (rs.next()) {
                ProductoModel producto = new ProductoModel();
                producto.setId(rs.getLong("id"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setPrecio(rs.getDouble("precio"));
                Optional<RubroModel> rubro = rubroRepo.findById(idRubro);
                if (rubro.isPresent()){
                    producto.setRubro(rubro.get());
                }

                listado.add(producto);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }

        return listado;

    }

}
