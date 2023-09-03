package ejercicio5;

import java.util.ArrayList;
import java.util.Date;

public class HistoriaClinica {
    private int idHistoriaClinica;
    private int numero;
    private Date fechaAlta;
    private Paciente paciente;
    private ArrayList<DetalleHistoriaClinica> detalleHistoriaClinica = new ArrayList<>();

    public HistoriaClinica(int idHistoriaClinica, int numero, Date fechaAlta, Paciente paciente, ArrayList<DetalleHistoriaClinica> detalleHistoriaClinica) {
        this.idHistoriaClinica = idHistoriaClinica;
        this.numero = numero;
        this.fechaAlta = fechaAlta;
        this.paciente = paciente;
        this.detalleHistoriaClinica = detalleHistoriaClinica;
    }

    public int getIdHistoriaClinica() {
        return idHistoriaClinica;
    }

    public void setIdHistoriaClinica(int idHistoriaClinica) {
        this.idHistoriaClinica = idHistoriaClinica;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public ArrayList<DetalleHistoriaClinica> getDetalleHistoriaClinica() {
        return detalleHistoriaClinica;
    }

    public void setDetalleHistoriaClinica(ArrayList<DetalleHistoriaClinica> detalleHistoriaClinica) {
        this.detalleHistoriaClinica = detalleHistoriaClinica;
    }
}


