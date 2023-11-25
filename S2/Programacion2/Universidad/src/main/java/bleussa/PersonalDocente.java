package bleussa;

import java.util.ArrayList;

public class PersonalDocente {
    private String conocimiento;
    private String experiencia;
    private int trayectoria;
    private Recopilacion recopilacion;
    private ejecucionDelProyecto proyecto;
    private Estudiante estudiante;
    private ArrayList<Universidad> universidades = new ArrayList();

    public PersonalDocente(String conocimiento, String experiencia, int trayectoria, Recopilacion recopilacion, ejecucionDelProyecto proyecto, Estudiante estudiante, ArrayList<Universidad> universidades) {
        this.conocimiento = conocimiento;
        this.experiencia = experiencia;
        this.trayectoria = trayectoria;
        this.recopilacion = recopilacion;
        this.proyecto = proyecto;
        this.estudiante = estudiante;
        this.universidades = universidades;
    }

    public PersonalDocente() {

    }

    public String evaluar(){
        return "Evaluar";
    }
    public String funcionDeSeguimiento(){
        return "Funcion de Seguimiento";
    }
    public String gestion(){
        return "Gestion";
    }
    public String orientar(){
        return "Orientar";
    }

    public String getConocimiento() {
        return conocimiento;
    }

    public void setConocimiento(String conocimiento) {
        this.conocimiento = conocimiento;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public int getTrayectoria() {
        return trayectoria;
    }

    public void setTrayectoria(int trayectoria) {
        this.trayectoria = trayectoria;
    }

    public Recopilacion getRecopilacion() {
        return recopilacion;
    }

    public void setRecopilacion(Recopilacion recopilacion) {
        this.recopilacion = recopilacion;
    }

    public ejecucionDelProyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(ejecucionDelProyecto proyecto) {
        this.proyecto = proyecto;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public ArrayList<Universidad> getUniversidades() {
        return universidades;
    }

    public void setUniversidades(ArrayList<Universidad> universidades) {
        this.universidades = universidades;
    }
}
