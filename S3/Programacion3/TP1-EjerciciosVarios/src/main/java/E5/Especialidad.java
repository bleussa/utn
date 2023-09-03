package ejercicio5;

import java.util.ArrayList;

public class Especialidad {
    private int idEspecialidad;
    private String denominacion;
    private ArrayList<Medico> medicos = new ArrayList<>();

    public Especialidad() {
    }

    public Especialidad(int idEspecialidad, String denominacion) {
        this.idEspecialidad = idEspecialidad;
        this.denominacion = denominacion;
    }

    public int getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(int idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public ArrayList<Medico> getMedicos() {
        return medicos;
    }

    public void setMedicos(ArrayList<Medico> medicos) {
        this.medicos = medicos;
    }
}
