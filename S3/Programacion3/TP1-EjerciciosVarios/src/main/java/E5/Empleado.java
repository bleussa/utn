package ejercicio5;

public class Empleado extends Persona{
    private int idempleado, nrolegajo;
    private double sueldo;

    public Empleado(int idPersona, String nombre, String apellido, long dni, Domicilio domicilio, int idempleado, int nrolegajo, double sueldo) {
        super(idPersona, nombre, apellido, dni, domicilio);
        this.idempleado = idempleado;
        this.nrolegajo = nrolegajo;
        this.sueldo = sueldo;
    }

    public int getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(int idempleado) {
        this.idempleado = idempleado;
    }

    public int getNrolegajo() {
        return nrolegajo;
    }

    public void setNrolegajo(int nrolegajo) {
        this.nrolegajo = nrolegajo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
