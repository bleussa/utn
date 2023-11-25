package bleussa;

import java.util.ArrayList;

public class Estudiante {
    private int aspiranteAGrado;
    private ArrayList<PersonalDocente> docentes = new ArrayList();
    private ejecucionDelProyecto ejecucionDelProyecto;
    private ProyectoDeGrado proyectoDeGrado;
    private ArrayList<EstudianteSolucion> estudianteSolucion = new ArrayList();
    private ArrayList<Universidad> universidades = new ArrayList();

    public Estudiante(int aspiranteAGrado, ArrayList<PersonalDocente> docentes, bleussa.ejecucionDelProyecto ejecucionDelProyecto, ProyectoDeGrado proyectoDeGrado, ArrayList<EstudianteSolucion> estudianteSolucion, ArrayList<Universidad> universidades) {
        this.aspiranteAGrado = aspiranteAGrado;
        this.docentes = docentes;
        this.ejecucionDelProyecto = ejecucionDelProyecto;
        this.proyectoDeGrado = proyectoDeGrado;
        this.estudianteSolucion = estudianteSolucion;
        this.universidades = universidades;
    }

    public Estudiante() {
    }


    public String estudiar(){
        return "Estudiar";
    }
    public String formarse(){
        return "formarse";
    }
    public String irALaUniversidad(){
        return "ir a la universidad";
    }

    public int getAspiranteAGrado() {
        return aspiranteAGrado;
    }

    public void setAspiranteAGrado(int aspiranteAGrado) {
        this.aspiranteAGrado = aspiranteAGrado;
    }

    public ArrayList<PersonalDocente> getDocentes() {
        return docentes;
    }

    public void setDocentes(ArrayList<PersonalDocente> docentes) {
        this.docentes = docentes;
    }

    public bleussa.ejecucionDelProyecto getEjecucionDelProyecto() {
        return ejecucionDelProyecto;
    }

    public void setEjecucionDelProyecto(bleussa.ejecucionDelProyecto ejecucionDelProyecto) {
        this.ejecucionDelProyecto = ejecucionDelProyecto;
    }

    public ProyectoDeGrado getProyectoDeGrado() {
        return proyectoDeGrado;
    }

    public void setProyectoDeGrado(ProyectoDeGrado proyectoDeGrado) {
        this.proyectoDeGrado = proyectoDeGrado;
    }

    public ArrayList<EstudianteSolucion> getEstudianteSolucion() {
        return estudianteSolucion;
    }

    public void setEstudianteSolucion(ArrayList<EstudianteSolucion> estudianteSolucion) {
        this.estudianteSolucion = estudianteSolucion;
    }

    public ArrayList<Universidad> getUniversidades() {
        return universidades;
    }

    public void setUniversidades(ArrayList<Universidad> universidades) {
        this.universidades = universidades;
    }
}
