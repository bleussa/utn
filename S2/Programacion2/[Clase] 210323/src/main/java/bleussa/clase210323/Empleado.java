package bleussa.clase210323;

public class Empleado {
    private String nombre;
    private String seccion;
    private int id;
    private static int idSiguiente = 1;

    public Empleado(String nombre, String seccion) {
        this.nombre = nombre;
        this.seccion = seccion;
        id = idSiguiente;
        idSiguiente++;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getSeccion() {
        return seccion;
    }
    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public static int getIdSiguiente() {
        return idSiguiente;
    }
    public static void setIdSiguiente(int idSiguiente) {
        Empleado.idSiguiente = idSiguiente;
    }
    
    
    @Override
    public String toString() {
        return "El nombre es " + getNombre() + " y la seccion es " + getSeccion() + " y la id es: " + getId();
    }
    
    public static String darIdSiguiente(){
        return "El ID Siguiente es: " + Empleado.getIdSiguiente();
    }
    
    
}
