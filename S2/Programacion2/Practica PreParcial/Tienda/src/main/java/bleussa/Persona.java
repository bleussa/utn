package bleussa;

public abstract class Persona {
    private int dniPersona;
    private String nombrePersona;
    private String apellidoPersona;

    public Persona() {
    }

    public int getDniPersona() {
        return dniPersona;
    }
    public void setDniPersona(int dniPersona) {
        this.dniPersona = dniPersona;
    }
    public String getNombrePersona() {
        return nombrePersona;
    }
    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }
    public String getApellidoPersona() {
        return apellidoPersona;
    }
    public void setApellidoPersona(String apellidoPersona) {
        this.apellidoPersona = apellidoPersona;
    }
}
