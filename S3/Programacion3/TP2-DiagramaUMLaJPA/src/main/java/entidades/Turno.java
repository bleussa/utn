package entidades;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Turno {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idTurno;

    @Column
    private int hora;

    @Column
    private int minuto;

    @Column
    private Date fecha;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "fkMedico")
    private Medico medico;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "fkPaciente")
    private Paciente paciente;

    public Turno() {
    }

    public Turno(int hora, int minuto, Date fecha, Medico medico, Paciente paciente) {
        this.hora = hora;
        this.minuto = minuto;
        this.fecha = fecha;
        this.medico = medico;
        this.paciente = paciente;
    }

    public int getIdTurno() {
        return idTurno;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}
