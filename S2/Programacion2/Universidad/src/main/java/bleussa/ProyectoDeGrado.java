package bleussa;

import java.util.ArrayList;

public class ProyectoDeGrado {
    private String alcance;
    private int costo;
    private String objetivo;
    private String planDeProyecto;
    private int tiempoDeRealizacion;
    private String titulo;
    private int viabilidad;
    private ArrayList<Estudiante> estudiantes = new ArrayList();
    private ejecucionDelProyecto ejecucionDelProyecto = new ejecucionDelProyecto();
    private Solucion solucion;


    public ProyectoDeGrado() {
    }

    public bleussa.ejecucionDelProyecto getEjecucionDelProyecto() {
        return ejecucionDelProyecto;
    }

    public Solucion getSolucion() {
        return solucion;
    }

    public void setSolucion(Solucion solucion) {
        this.solucion = solucion;
    }

    public void setEjecucionDelProyecto(bleussa.ejecucionDelProyecto ejecucionDelProyecto) {
        this.ejecucionDelProyecto = ejecucionDelProyecto;
    }

    public String getAlcance() {
        return alcance;
    }

    public void setAlcance(String alcance) {
        this.alcance = alcance;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getPlanDeProyecto() {
        return planDeProyecto;
    }

    public void setPlanDeProyecto(String planDeProyecto) {
        this.planDeProyecto = planDeProyecto;
    }

    public int getTiempoDeRealizacion() {
        return tiempoDeRealizacion;
    }

    public void setTiempoDeRealizacion(int tiempoDeRealizacion) {
        this.tiempoDeRealizacion = tiempoDeRealizacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getViabilidad() {
        return viabilidad;
    }

    public void setViabilidad(int viabilidad) {
        this.viabilidad = viabilidad;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
}


