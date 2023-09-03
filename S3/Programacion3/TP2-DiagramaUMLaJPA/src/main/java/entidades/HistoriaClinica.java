package entidades;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "historiaClinica")
public class HistoriaClinica {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idHistoriaClinica;

    @Column
    private int numero;

    @Column
    private Date fechaAlta;

    @OneToOne(mappedBy = "historiaClinica")
    private Paciente paciente;

    @OneToMany(mappedBy = "historiaClinica")
    private List<DetalleHistoriaClinica> detalleHistoriaClinica;

    public HistoriaClinica(int idHistoriaClinica, int numero, Date fechaAlta, Paciente paciente, ArrayList<DetalleHistoriaClinica> detalleHistoriaClinica) {
        this.idHistoriaClinica = idHistoriaClinica;
        this.numero = numero;
        this.fechaAlta = fechaAlta;
        this.paciente = paciente;
        this.detalleHistoriaClinica = detalleHistoriaClinica;
    }

    public HistoriaClinica() {
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

    public List<DetalleHistoriaClinica> getDetalleHistoriaClinica() {
        return detalleHistoriaClinica;
    }

    public void setDetalleHistoriaClinica(ArrayList<DetalleHistoriaClinica> detalleHistoriaClinica) {
        this.detalleHistoriaClinica = detalleHistoriaClinica;
    }
}


