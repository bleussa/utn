package ar.com.bleussa.apiSpring.controladores;

import ar.com.bleussa.apiSpring.modelos.AgendaModelo;
import ar.com.bleussa.apiSpring.servicios.AgendaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/agendas")
public class AgendaControlador {

    @Autowired
    private AgendaServicio agendaServicio;

    @GetMapping()
    public ResponseEntity<ArrayList<AgendaModelo>> getAgendas(){
        ArrayList<AgendaModelo> agendas = this.agendaServicio.getAgendas();
        return ResponseEntity.status(HttpStatus.OK).body(this.agendaServicio.getAgendas());
    }

    @PostMapping(path = "/")
    public AgendaModelo saveAgenda(@RequestBody AgendaModelo agendaModelo){
        return this.agendaServicio.saveAgenda(agendaModelo);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<?> getAgendaById(@PathVariable long id) {
        Optional<AgendaModelo> agendaOptional = this.agendaServicio.getAgendaById(id);

        if (agendaOptional.isPresent()) {
            AgendaModelo agenda = agendaOptional.get();
            return ResponseEntity.status(HttpStatus.OK).body(agenda);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No se encontro");
        }
    }

    @PutMapping(path = "/{id}")
    public AgendaModelo updateAgendaById(@RequestBody AgendaModelo request, @PathVariable long id){
        return this.agendaServicio.updateAgendaById(request, id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteAgendaById(@PathVariable long id){
        boolean flag = this.agendaServicio.deleteAgendaById(id);
        if (flag){
            return "La agenda " + id + " fue eliminada!";
        } else {
            return "La agenda " + id + " no pudo ser eliminada!";
        }
    }


}
