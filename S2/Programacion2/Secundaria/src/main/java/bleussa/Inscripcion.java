package bleussa;

public class Inscripcion {
    private Estudiante estudiante;
    private Materia materia;
    private int nota;

    public Inscripcion(Estudiante estudiante, Materia materia, int nota) {
        this.estudiante = estudiante;
        this.materia = materia;
        this.nota = nota;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}

