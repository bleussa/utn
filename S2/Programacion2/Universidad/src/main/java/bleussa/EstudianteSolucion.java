package bleussa;

public class EstudianteSolucion {
    private Estudiante estudiante;
    private Solucion solucion;

    public EstudianteSolucion(Estudiante estudiante, Solucion solucion) {
        this.estudiante = estudiante;
        this.solucion = solucion;
    }

    public EstudianteSolucion() {

    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Solucion getSolucion() {
        return solucion;
    }

    public void setSolucion(Solucion solucion) {
        this.solucion = solucion;
    }
}
