package ejercicio5;

import java.util.Date;

public class DetalleHistoriaClinica {
    private int idDetalleHC;
    private Date fechaAtencion;
    private String sintomas, diagnostico, observaciones;
    private HistoriaClinica historiaClinica;

    public DetalleHistoriaClinica(int idDetalleHC, Date fechaAtencion, String sintomas, String diagnostico, String observaciones, HistoriaClinica historiaClinica) {
        this.idDetalleHC = idDetalleHC;
        this.fechaAtencion = fechaAtencion;
        this.sintomas = sintomas;
        this.diagnostico = diagnostico;
        this.observaciones = observaciones;
        this.historiaClinica = historiaClinica;
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
