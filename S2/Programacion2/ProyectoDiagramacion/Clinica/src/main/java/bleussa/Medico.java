package bleussa;

import java.util.ArrayList;

public class Medico {
    // ATRIBUTOS
    private String nombreApellidos;
    private ArrayList<Paciente> pacientes = new ArrayList<>();

    // CONSTRUCTORES
    public Medico(String nombreApellidos) {
        this.nombreApellidos = nombreApellidos;
    }

    // METODOS
    public String getNombreApellidos() {
        return nombreApellidos;
    }
    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }
    public void addPaciente(Paciente paciente){
        this.pacientes.add(paciente);
    }
    public void removePaciente(Paciente paciente){
        this.pacientes.remove(paciente);
    }
    public int getCargaPacientes(){
        return this.pacientes.size();
    }
    public boolean tieneAlPaciente(Paciente paciente){
        for (Paciente p : pacientes){
            if (p == paciente){
                return true;
            }
        }
        return false;
    }
    public Paciente getPaciente(String nombre){
        for (Paciente p : pacientes) {
            if (p.getNombreApellidos().equals(nombre)){
                return p;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return nombreApellidos;
    }
}
