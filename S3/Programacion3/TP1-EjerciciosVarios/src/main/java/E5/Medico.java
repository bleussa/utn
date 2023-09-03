package ejercicio5;

import java.util.ArrayList;

public class Medico extends Persona{
    private int idMedico, matricula;
    private long celular;
    private ArrayList<Especialidad> especialidades = new ArrayList<>();
    private ArrayList<Turno> turnos = new ArrayList<>();

    public Medico(int idPersona, String nombre, String apellido, long dni, Domicilio domicilio, int idMedico, int matricula, long celular, ArrayList<Especialidad> especialidades, ArrayList<Turno> turnos) {
        super(idPersona, nombre, apellido, dni, domicilio);
        this.idMedico = idMedico;
        this.matricula = matricula;
        this.celular = celular;
        this.especialidades = especialidades;
        this.turnos = turnos;
    }

    public Medico(int idPersona, String nombre, String apellido, long dni, Domicilio domicilio, int idMedico, int matricula, long celular) {
        super(idPersona, nombre, apellido, dni, domicilio);
        this.idMedico = idMedico;
        this.matricula = matricula;
        this.celular = celular;
    }

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }

    public ArrayList<Especialidad> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(ArrayList<Especialidad> especialidades) {
        this.especialidades = especialidades;
    }

    public ArrayList<Turno> getTurnos() {
        return turnos;
    }

    public void setTurnos(ArrayList<Turno> turnos) {
        this.turnos = turnos;
    }
}
