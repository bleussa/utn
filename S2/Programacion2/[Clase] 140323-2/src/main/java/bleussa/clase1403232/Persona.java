package bleussa.clase1403232;

public class Persona extends Animal{
    private String nombre;
    private int edad;
    private int dni;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    

    public Persona(int dni) {
        this.dni = dni;
    }
    
    
    @Override
    public void comer(){
        System.out.println("Estoy comiendo sentado y con cubiertos");
    }

    
}
