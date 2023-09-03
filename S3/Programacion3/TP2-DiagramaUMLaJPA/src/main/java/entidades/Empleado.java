package entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
public class Empleado extends Persona{
    @Column(unique = true)
    private int nrolegajo;

    @Column
    private double sueldo;

    public Empleado(String nombre, String apellido, long dni, Domicilio domicilio, int nrolegajo, double sueldo) {
        super(nombre, apellido, dni, domicilio);
        this.nrolegajo = nrolegajo;
        this.sueldo = sueldo;
    }

    public Empleado() {

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
