package bleussa;

abstract class Persona {
    // ATRIBUTOS
    private String nombre;
    private String apellido;
    private Integer idPersona;

    // CONSTRUCTOR
    public Persona(String nombre, String apellido, Integer idPersona) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.idPersona = idPersona;
    }

    // METODOS
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
    public Integer getIdPersona() {
        return idPersona;
    }
}
