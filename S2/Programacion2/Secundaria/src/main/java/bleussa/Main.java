package bleussa;

public class Main {
    public static void main(String[] args) {

        Estudiante facundo = new Estudiante();
        facundo.setNombre("Facundo");
        facundo.setApellido("Gomez");
        facundo.setEdad(25);

        Estudiante fernando = new Estudiante();
        fernando.setNombre("Fernando");
        fernando.setApellido("Lero");
        fernando.setEdad(52);

        Materia matematicas = new Materia();
        matematicas.setNombre("Matematicas");

        Materia lengua = new Materia();
        lengua.setNombre("Lengua");

        Materia fisica = new Materia();
        fisica.setNombre("Fisica");

        Inscripcion i1 = new Inscripcion(facundo, matematicas, 8);
        facundo.agregarInscripcion(i1);
        matematicas.agregarInscripcion(i1);

        for (Inscripcion i : facundo.getInscripciones()) {
            System.out.println(facundo.getNombre() + " cursa: " + i.getMateria().getNombre());
        }

        for (Inscripcion i : matematicas.getInscripciones()) {
            System.out.println(matematicas.getNombre() + " tiene a : " + i.getEstudiante().getNombre());
        }

    }
}