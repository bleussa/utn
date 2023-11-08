package ar.com.bleussa.Articulo.controllers;

import ar.com.bleussa.Articulo.models.ProductoModel;
import ar.com.bleussa.Articulo.models.RubroModel;
import ar.com.bleussa.Articulo.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping()
    public ResponseEntity<ArrayList<ProductoModel>> getRubros(){
        ArrayList<ProductoModel> productos = this.productoService.getProductos();
        return ResponseEntity.status(HttpStatus.OK).body(productos);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<ArrayList<ProductoModel>> getProductoByRubro(@PathVariable long id) {
        ArrayList<ProductoModel> productos = this.productoService.getProductosByRubro(id);
        return ResponseEntity.status(HttpStatus.OK).body(productos);
    }

}
