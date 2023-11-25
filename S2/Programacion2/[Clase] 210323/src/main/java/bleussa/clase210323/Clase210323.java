package bleussa.clase210323;

public class Clase210323 {

    public static void main(String[] args) {
        
        Empleado e1 = new Empleado("Juan", "Administracion");
        Empleado e2 = new Empleado("Sofia", "RRHH");
        Empleado e3 = new Empleado("Matias", "Trafico");
        
        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());

        System.out.println(Empleado.darIdSiguiente());
        
        
    }

}
