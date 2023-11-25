package bleussa;

import java.util.ArrayList;

public class Materia {
    private String nombre;
    private ArrayList<Inscripcion> inscripciones = new ArrayList();

    public Materia() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Inscripcion> getInscripciones() {
        return inscripciones;
    }

    public void setInscripciones(ArrayList<Inscripcion> inscripciones) {
        this.inscripciones = inscripciones;
    }

    public void agregarInscripcion(Inscripcion inscripcion) {
        inscripciones.add(inscripcion);
        // inscripcion.getEstudiante().getInscripciones().add(inscripcion);
    }

}
