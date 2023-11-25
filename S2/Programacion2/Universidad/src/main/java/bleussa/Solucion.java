package bleussa;

import java.util.ArrayList;

public class Solucion {
    private String alternativas;
    private ArrayList<EstudianteSolucion> estudianteSolucion = new ArrayList();

    public Solucion(String alternativas, ArrayList<EstudianteSolucion> estudianteSolucion) {
        this.alternativas = alternativas;
        this.estudianteSolucion = estudianteSolucion;
    }

    public Solucion() {
    }

    public String getAlternativas() {
        return alternativas;
    }

    public void setAlternativas(String alternativas) {
        this.alternativas = alternativas;
    }

    public ArrayList<EstudianteSolucion> getEstudianteSolucion() {
        return estudianteSolucion;
    }

    public void setEstudianteSolucion(ArrayList<EstudianteSolucion> estudianteSolucion) {
        this.estudianteSolucion = estudianteSolucion;
    }
}
