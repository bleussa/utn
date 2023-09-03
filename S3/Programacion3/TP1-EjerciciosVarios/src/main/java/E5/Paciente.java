package ejercicio5;

import java.util.ArrayList;

public class Paciente extends Persona{
    private int idPaciente, nroSocio;
    private ArrayList<Turno> turnos = new ArrayList<>();
    private HistoriaClinica historiaClinica;

    public Paciente(int idPersona, String nombre, String apellido, long dni, Domicilio domicilio, int idPaciente, int nroSocio, ArrayList<Turno> turnos, HistoriaClinica historiaClinica) {
        super(idPersona, nombre, apellido, dni, domicilio);
        this.idPaciente = idPaciente;
        this.nroSocio = nroSocio;
        this.turnos = turnos;
        this.historiaClinica = historiaClinica;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public int getNroSocio() {
        return nroSocio;
    }

    public void setNroSocio(int nroSocio) {
        this.nroSocio = nroSocio;
    }

    public ArrayList<Turno> getTurnos() {
        return turnos;
    }

    public void setTurnos(ArrayList<Turno> turnos) {
        this.turnos = turnos;
    }

    public HistoriaClinica getHistoriaClinica() {
        return historiaClinica;
    }

    public void setHistoriaClinica(HistoriaClinica historiaClinica) {
        this.historiaClinica = historiaClinica;
    }
}
