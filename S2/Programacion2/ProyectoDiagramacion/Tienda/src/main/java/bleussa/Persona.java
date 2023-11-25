package bleussa;

abstract class Persona {
    // ATRIBUTOS
    private int dni;
    private String nombre, apellido;
    private long cuit;

    // CONSTRUCTORES

    public Persona() {
    }

    public Persona(int dni, String nombre, String apellido, long cuit) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuit = cuit;
    }

    // METODOS
    public int getDni() {
        return dni;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public long getCuit() {
        return cuit;
    }
    public void setCuit(long cuit) {
        this.cuit = cuit;
    }
}
