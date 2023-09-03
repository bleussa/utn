package entidades;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Paciente extends Persona{

    @Column(unique = true)
    private int nroSocio;

    @OneToMany(mappedBy = "paciente", cascade = CascadeType.PERSIST)
    private List<Turno> turnos;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "fkHistoriaClinica")
    private HistoriaClinica historiaClinica;

    public Paciente(String nombre, String apellido, long dni, Domicilio domicilio, int idPaciente, int nroSocio, ArrayList<Turno> turnos, HistoriaClinica historiaClinica) {
        super(nombre, apellido, dni, domicilio);
        this.nroSocio = nroSocio;
        this.turnos = turnos;
        this.historiaClinica = historiaClinica;
    }

    public Paciente() {
    }

    public int getNroSocio() {
        return nroSocio;
    }

    public void setNroSocio(int nroSocio) {
        this.nroSocio = nroSocio;
    }

    public List<Turno> getTurnos() {
        return turnos;
    }

    public void setTurnos(List<Turno> turnos) {
        this.turnos = turnos;
    }

    public HistoriaClinica getHistoriaClinica() {
        return historiaClinica;
    }

    public void setHistoriaClinica(HistoriaClinica historiaClinica) {
        this.historiaClinica = historiaClinica;
    }
}
