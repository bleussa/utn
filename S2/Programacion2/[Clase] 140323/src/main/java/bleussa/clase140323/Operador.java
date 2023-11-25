package bleussa.clase140323;

public class Operador extends Empleado{
    private boolean tieneGuardia;

    public Operador(boolean tieneGuardia, int legajo, String obraSocial, double salario, int id, String nombre, String apellido, double estatura, int edad) {
        super(legajo, obraSocial, salario, id, nombre, apellido, estatura, edad);
        this.tieneGuardia = tieneGuardia;
    }

    public Operador(int id, String nombre, String apellido, double estatura, int edad) {
        super(id, nombre, apellido, estatura, edad);
    }

    public boolean isTieneGuardia() {
        return tieneGuardia;
    }

    public void setTieneGuardia(boolean tieneGuardia) {
        this.tieneGuardia = tieneGuardia;
    }
   
    
    
}
