package bleussa;

import java.util.ArrayList;

public class Clinica {
    // ATRIBUTOS
    private ArrayList<Especialidad> especialidades = new ArrayList<>();

    // CONSTRUCTORES
    public Clinica(ArrayList<Especialidad> especialidades) {
        this.especialidades = especialidades;
    }

    // METODOS
    public void addEspecialidad(Especialidad especialidad){
        this.especialidades.add(especialidad);
    }
    public void buscarEspecialidadPaciente(Paciente paciente){
        /* PENDIENTE */
    }
    public Especialidad obtenerEspecialidad(String especialidad){
        for (Especialidad c : especialidades){
            if (c.getNombre().equals(especialidad)){
                return c;
            }
        }
        return null;
    }

    public ArrayList<Especialidad> getEspecialidades() {
        return especialidades;
    }
}
