package ejercicio1;

import java.util.ArrayList;

public class Control {
    private int id;
    private String denominacion;
    private boolean esObligatorio;
    private ArrayList<Expediente> expedientes = new ArrayList<>();
    private EstadoControl estado;

    public Control(int id, String denominacion, boolean esObligatorio, EstadoControl estado) {
        this.id = id;
        this.denominacion = denominacion;
        this.esObligatorio = esObligatorio;
        this.estado = estado;
    }

    public Control() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public boolean isEsObligatorio() {
        return esObligatorio;
    }

    public void setEsObligatorio(boolean esObligatorio) {
        this.esObligatorio = esObligatorio;
    }

    public ArrayList<Expediente> getExpedientes() {
        return expedientes;
    }

    public void setExpedientes(ArrayList<Expediente> expedientes) {
        this.expedientes = expedientes;
    }

    public EstadoControl getEstado() {
        return estado;
    }

    public void setEstado(EstadoControl estado) {
        this.estado = estado;
    }
}
