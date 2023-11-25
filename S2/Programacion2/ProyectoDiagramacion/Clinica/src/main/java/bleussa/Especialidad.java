package bleussa;

import java.util.ArrayList;

public class Especialidad {
    // ATRIBUTOS
    private String nombre;
    private ArrayList<Habitacion> habitaciones = new ArrayList<>();
    private ArrayList<Medico> medicos = new ArrayList<>();

    // CONSTRUCTORES
    public Especialidad(String nombre) {
        this.nombre = nombre;
    }

    // METODOS
    public String getNombre() {
        return nombre;
    }
    public ArrayList<Habitacion> getHabitaciones() {
        return habitaciones;
    }
    public ArrayList<Medico> getMedicos() {
        return medicos;
    }

    public Medico getMedico(String nombre){
        for (Medico m : medicos) {
            if (m.getNombreApellidos().equals(nombre)){
                return m;
            }
        }
        return null;
    }

    public void addHabitacion(Habitacion habitacion){
        this.habitaciones.add(habitacion);
    }
    public void removeHabitacion(Habitacion habitacion){
        this.habitaciones.remove(habitacion);
    }
    public void addMedico(Medico medico){
        this.medicos.add(medico);
    }
    public void removeMedico(Medico medico){
        this.medicos.remove(medico);
    }

}
