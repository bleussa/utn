package bleussa.clase140323;

public class Empleado extends Persona implements Trabajar{
    
    private int legajo;
    private String obraSocial;
    private double salario;

    public Empleado(int legajo, String obraSocial, double salario, int id, String nombre, String apellido, double estatura, int edad) {
        super(id, nombre, apellido, estatura, edad);
        this.legajo = legajo;
        this.obraSocial = obraSocial;
        this.salario = salario;
    }

    public Empleado(int id, String nombre, String apellido, double estatura, int edad) {
        super(id, nombre, apellido, estatura, edad);
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(String obraSocial) {
        this.obraSocial = obraSocial;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void cargaHoraria(){
        System.out.println("8 HORAS");
    }
    
    public void cobrar(){
        
    };

    @Override
    public void cantidadHoras() {
        System.out.println("Trabajo 8hs");
    }

    @Override
    public void velocidad_promedio() {
        System.out.println("5 km/h");
    }
    
}
