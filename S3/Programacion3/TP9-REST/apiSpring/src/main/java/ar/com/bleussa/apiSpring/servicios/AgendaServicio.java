package ar.com.bleussa.apiSpring.servicios;

import ar.com.bleussa.apiSpring.modelos.AgendaModelo;
import ar.com.bleussa.apiSpring.repositorios.IAgendaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class AgendaServicio {

    @Autowired
    IAgendaRepositorio agendaRepositorio;

    public ArrayList<AgendaModelo> getAgendas(){
        return (ArrayList<AgendaModelo>) agendaRepositorio.findAll();
    }

    public AgendaModelo saveAgenda(AgendaModelo agendaModelo){
        return agendaRepositorio.save(agendaModelo);
    }

    public Optional<AgendaModelo> getAgendaById(long id){
        return agendaRepositorio.findById(id);
    }

    public AgendaModelo updateAgendaById(AgendaModelo request, long id){

        AgendaModelo agenda = agendaRepositorio.findById(id).get();
        agenda.setNombre(request.getNombre());
        agenda.setApellido(request.getApellido());
        agenda.setDomicilio(request.getDomicilio());
        agenda.setEmail(request.getEmail());
        agenda.setTelefono(request.getTelefono());
        agendaRepositorio.save(agenda);

        return agenda;
    }

    public Boolean deleteAgendaById(long id){
        try {
            this.agendaRepositorio.deleteById(id);
            return true;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

}
