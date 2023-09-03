package ejercicio5;

import java.util.ArrayList;
import java.util.Date;

public class Turno {
    private int idTurno, hora, minuto;
    private Date fecha;
    private Medico medico;
    private Paciente paciente;

    public Turno() {
    }

    public Turno(int idTurno, int hora, int minuto, Date fecha, Medico medico, Paciente paciente) {
        this.idTurno = idTurno;
        this.hora = hora;
        this.minuto = minuto;
        this.fecha = fecha;
        this.medico = medico;
        this.paciente = paciente;
    }

    public int getIdTurno() {
        return idTurno;
    }

    public void setIdTurno(int idTurno) {
        this.idTurno = idTurno;
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
