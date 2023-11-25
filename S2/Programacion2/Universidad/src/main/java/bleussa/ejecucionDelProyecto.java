package bleussa;

import java.util.ArrayList;

public class ejecucionDelProyecto {
    private String proyectoDeGradoTerminado;
    private int recursosDisponibles;
    private Resultado resultado = new Resultado();
    private ArrayList<PersonalDocente> docentes = new ArrayList();
    private ArrayList<Estudiante> estudiantes = new ArrayList();

    public ejecucionDelProyecto() {
    }


    public String comenzarDesarrolloDelProyecto() {
        return "Comenzar desarrollo del proyecto";
    }

    public String finalizarDesarrolloDelProyecto() {
        return "Finalizar desarrollo del proyecto";
    }

    public String getProyectoDeGradoTerminado() {
        return proyectoDeGradoTerminado;
    }

    public void setProyectoDeGradoTerminado(String proyectoDeGradoTerminado) {
        this.proyectoDeGradoTerminado = proyectoDeGradoTerminado;
    }

    public int getRecursosDisponibles() {
        return recursosDisponibles;
    }

    public void setRecursosDisponibles(int recursosDisponibles) {
        this.recursosDisponibles = recursosDisponibles;
    }

    public Resultado getResultado() {
        return resultado;
    }

    public void setResultado(Resultado resultado) {
        this.resultado = resultado;
    }

    public ArrayList<PersonalDocente> getDocentes() {
        return docentes;
    }

    public void setDocentes(ArrayList<PersonalDocente> docentes) {
        this.docentes = docentes;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

}
