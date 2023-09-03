package ejercicio3;

import ejercicio1.Expediente;

import java.util.ArrayList;

public class Persona {
    private String nombre, tipoDocumento, email, celular;
    private long nroDocumento;
    private int telefono;
    private ArrayList<Actividad> actividades = new ArrayList<>();
    private Sector sector;

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public long getNroDocumento() {
        return nroDocumento;
    }

    public void setNroDocumento(long nroDocumento) {
        this.nroDocumento = nroDocumento;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Actividad> getActividades() {
        return actividades;
    }

    public void setActividades(ArrayList<Actividad> actividades) {
        this.actividades = actividades;
    }

    public Sector getSector() {
        return sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }

    public double totalPuntosAsignados(){
        double totalPuntos = 0;
        for (Actividad actividad : this.getActividades()) {
            totalPuntos += actividad.getTipoActividad().getPuntosAsignados();
        }
        return totalPuntos;
    }

    public double totalPuntosAsignados(int codigo){
        double totalPuntos = 0;
        for (Actividad actividad : this.getActividades()) {
            if (codigo == actividad.getTipoActividad().getCodigo()){
                totalPuntos += actividad.getTipoActividad().getPuntosAsignados();
            }
        }
        return totalPuntos;
    }

    public double totalPuntosAsignados(int codigo, int anio){
        double totalPuntos = 0;
        for (Actividad actividad : this.getActividades()) {
            if (codigo == actividad.getTipoActividad().getCodigo() && anio == actividad.getFechaInicio().getYear()){
                totalPuntos += actividad.getTipoActividad().getPuntosAsignados();
            }
        }
        return totalPuntos;
    }
}
