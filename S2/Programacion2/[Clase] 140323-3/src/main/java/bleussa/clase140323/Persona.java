package bleussa.clase140323;

public abstract class Persona {
    
    protected int id;
    protected String nombre;
    protected String apellido;
    protected double estatura;
    protected int edad;

    public Persona(int id, String nombre, String apellido, double estatura, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.estatura = estatura;
        this.edad = edad;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    // METODOS PROPIOS
   
    
    
    
    
}
