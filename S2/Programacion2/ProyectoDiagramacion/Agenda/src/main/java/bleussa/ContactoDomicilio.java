package bleussa;

public class ContactoDomicilio {
    // ATRIBUTOS
    private Integer idContactoDomicilio;
    private String descripcion;

    // CONSTRUCTOR
    public ContactoDomicilio(Integer idContactoDomicilio, String descripcion) {
        this.idContactoDomicilio = idContactoDomicilio;
        this.descripcion = descripcion;
    }

    // METODOS
    public Integer getIdContactoDomicilio() {
        return idContactoDomicilio;
    }
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
