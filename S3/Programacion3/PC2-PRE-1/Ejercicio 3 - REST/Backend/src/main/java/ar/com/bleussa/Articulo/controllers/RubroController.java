package ar.com.bleussa.Articulo.controllers;

import ar.com.bleussa.Articulo.models.RubroModel;
import ar.com.bleussa.Articulo.services.RubroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/rubros")

public class RubroController {

    @Autowired
    private RubroService rubroService;

    @GetMapping()
    public ResponseEntity<ArrayList<RubroModel>> getRubros(){
        ArrayList<RubroModel> rubros = this.rubroService.getRubros();
        return ResponseEntity.status(HttpStatus.OK).body(rubros);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<?> getRubroById(@PathVariable long id) {
        Optional<RubroModel> rubroOptional = this.rubroService.getRubroById(id);

        if (rubroOptional.isPresent()) {
            RubroModel rubro = rubroOptional.get();
            System.out.println(rubro.getDescripcion());
            return ResponseEntity.status(HttpStatus.OK).body(rubro);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No se encontro");
        }
    }

}
