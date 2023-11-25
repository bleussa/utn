package bleussa;

public class MejorAlumno {

    public MejorAlumno(){};

    public MejorAlumno(Alumno [] alumnos){
        double aux = 0;
        int mejorAlumno = 0;
        for (int i = 0; i < alumnos.length; i++){
            if (alumnos[i].getPromedioNotas() > aux){
                mejorAlumno = i;
                aux = alumnos[i].getPromedioNotas();
            }
        }
        System.out.println("");
        System.out.println("-- MEJOR PROMEDIO --");
        System.out.println("APELLIDO: " + alumnos[mejorAlumno].getApellido());
        System.out.println("NOMBRE: " + alumnos[mejorAlumno].getNombre());
        System.out.println("LEGAJO: " + alumnos[mejorAlumno].getLegajo());
        // System.out.println("NOTAS: " + alumnos[mejorAlumno].getNotas(););
        System.out.println("PROMEDIO: " + alumnos[mejorAlumno].getPromedioNotas());
    }
}
