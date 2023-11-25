package bleussa;

public class ContactoTipo {
    // ATRIBUTOS
    private Integer idContactoTipo;
    private String descripcion;

    // CONSTRUCTOR
    public ContactoTipo(Integer idContactoTipo, String descripcion) {
        this.idContactoTipo = idContactoTipo;
        this.descripcion = descripcion;
    }
    public ContactoTipo(Integer idContactoTipo){
        this.idContactoTipo = idContactoTipo;
    }

    // METODOS
    public Integer getIdContactoTipo() {
        return idContactoTipo;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
