package bleussa;

public class Cliente {

    private String nombre;
    private String apellido;
    private int nroCliente;
    private int dni;
    private double sueldo;

    public Cliente(String apellido, String nombre, int dni, double sueldo, int nroCliente){
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.sueldo = sueldo;
        this.nroCliente = nroCliente;
    }

    public void mostrarCliente(){
        System.out.println("APELLIDO = " + apellido);
        System.out.println("NOMBRE = " + nombre);
        System.out.println("DNI = " + dni);
        // System.out.println("SUELDO = " + sueldo);
        // System.out.println("NRO CLIENTE = " + nroCliente);
    }


    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }
    public int getDni() { return dni; }
    public void setDni(int dni) {this.dni = dni;}
    public int getNroCliente() { return nroCliente; }
    public void setNroCliente(int nroCliente) { this.nroCliente = nroCliente; }
    public double getSueldo() { return sueldo; }
    public void setSueldo(double sueldo) { this.sueldo = sueldo; }
}
