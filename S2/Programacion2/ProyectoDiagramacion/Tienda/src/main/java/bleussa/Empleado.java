package bleussa;

public class Empleado extends Persona{
    // ATRIBUTOS
    private String fechaIngreso;
    private int nroLegajo;

    // CONSTRUCTORES

    public Empleado() {
    }
    public Empleado(int dni, String nombre, String apellido, long cuit) {
        super(dni, nombre, apellido, cuit);
    }
    public Empleado(int dni, String nombre, String apellido, long cuit, String fechaIngreso, int nroLegajo) {
        super(dni, nombre, apellido, cuit);
        this.fechaIngreso = fechaIngreso;
        this.nroLegajo = nroLegajo;
    }

    // METODOS
    public String getFechaIngreso() {
        return fechaIngreso;
    }
    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    public int getNroLegajo() {
        return nroLegajo;
    }
    public void setNroLegajo(int nroLegajo) {
        this.nroLegajo = nroLegajo;
    }
}
