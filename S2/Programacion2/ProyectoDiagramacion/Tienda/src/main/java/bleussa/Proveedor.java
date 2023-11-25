package bleussa;

public class Proveedor extends Persona implements EstadoCuenta{
    // ATRIBUTOS
    private String nombreComercial;

    // CONSTRUCTORES
    public Proveedor(int dni, String nombre, String apellido, long cuit, String nombreComercial) {
        super(dni, nombre, apellido, cuit);
        this.nombreComercial = nombreComercial;
    }

    // METODOS
    public String getNombreComercial() {
        return nombreComercial;
    }
    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }
    @Override
    public boolean problemaVerazCodeme() {
        return false;
    }
}
