package entidades;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class DetalleHistoriaClinica implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDetalleHC;

    @Column
    private Date fechaAtencion;

    @Column
    private String sintomas;

    @Column
    private String diagnostico;

    @Column
    private String observaciones;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fkHistoriaClinica")
    private HistoriaClinica historiaClinica;

    public DetalleHistoriaClinica(int idDetalleHC, Date fechaAtencion, String sintomas, String diagnostico, String observaciones, HistoriaClinica historiaClinica) {
        this.idDetalleHC = idDetalleHC;
        this.fechaAtencion = fechaAtencion;
        this.sintomas = sintomas;
        this.diagnostico = diagnostico;
        this.observaciones = observaciones;
        this.historiaClinica = historiaClinica;
    }

    public DetalleHistoriaClinica() {
    }

    public int getIdDetalleHC() {
        return idDetalleHC;
    }

    public void setIdDetalleHC(int idDetalleHC) {
        this.idDetalleHC = idDetalleHC;
    }

    public Date getFechaAtencion() {
        return fechaAtencion;
    }

    public void setFechaAtencion(Date fechaAtencion) {
        this.fechaAtencion = fechaAtencion;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public HistoriaClinica getHistoriaClinica() {
        return historiaClinica;
    }

    public void setHistoriaClinica(HistoriaClinica historiaClinica) {
        this.historiaClinica = historiaClinica;
    }
}
