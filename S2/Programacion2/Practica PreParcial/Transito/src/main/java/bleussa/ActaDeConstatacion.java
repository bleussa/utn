package bleussa;

import java.util.ArrayList;

public class ActaDeConstatacion {
    private ArrayList<Infraccion> infracciones = new ArrayList<>();
    private String fechaDeLabrado, FechaVtoPagoVolun, horaDeLabrado, lugarDeConstatacion, observaciones;
    private int idActa;
    private OrganizacionEstatal organizacionEstatal;
    private Vehiculo vehiculo;
    private EstadoDelActa estadoDelActa;
    private AutoridadDeConstatacion autoridadDeConstatacion;
    private Licencias licencias;
    private Ruta ruta;

    public ActaDeConstatacion() {
    }

    public ArrayList<Infraccion> getInfracciones() {
        return infracciones;
    }

    public void setInfracciones(ArrayList<Infraccion> infracciones) {
        this.infracciones = infracciones;
    }

    public String getFechaDeLabrado() {
        return fechaDeLabrado;
    }

    public void setFechaDeLabrado(String fechaDeLabrado) {
        this.fechaDeLabrado = fechaDeLabrado;
    }

    public String getFechaVtoPagoVolun() {
        return FechaVtoPagoVolun;
    }

    public void setFechaVtoPagoVolun(String fechaVtoPagoVolun) {
        FechaVtoPagoVolun = fechaVtoPagoVolun;
    }

    public String getHoraDeLabrado() {
        return horaDeLabrado;
    }

    public void setHoraDeLabrado(String horaDeLabrado) {
        this.horaDeLabrado = horaDeLabrado;
    }

    public String getLugarDeConstatacion() {
        return lugarDeConstatacion;
    }

    public void setLugarDeConstatacion(String lugarDeConstatacion) {
        this.lugarDeConstatacion = lugarDeConstatacion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public int getIdActa() {
        return idActa;
    }

    public void setIdActa(int idActa) {
        this.idActa = idActa;
    }

    public OrganizacionEstatal getOrganizacionEstatal() {
        return organizacionEstatal;
    }

    public void setOrganizacionEstatal(OrganizacionEstatal organizacionEstatal) {
        this.organizacionEstatal = organizacionEstatal;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public EstadoDelActa getEstadoDelActa() {
        return estadoDelActa;
    }

    public void setEstadoDelActa(EstadoDelActa estadoDelActa) {
        this.estadoDelActa = estadoDelActa;
    }

    public AutoridadDeConstatacion getAutoridadDeConstatacion() {
        return autoridadDeConstatacion;
    }

    public void setAutoridadDeConstatacion(AutoridadDeConstatacion autoridadDeConstatacion) {
        this.autoridadDeConstatacion = autoridadDeConstatacion;
    }

    public Licencias getLicencias() {
        return licencias;
    }

    public void setLicencias(Licencias licencias) {
        this.licencias = licencias;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }
}
