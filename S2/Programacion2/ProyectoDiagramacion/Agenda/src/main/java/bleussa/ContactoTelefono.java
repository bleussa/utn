package bleussa;

public class ContactoTelefono {
    // ATRIBUTOS
    private Integer idContactoTelefono;
    private String codigo;
    private String numero;

    // CONSTRUCTOR
    public ContactoTelefono(Integer idContactoTelefono, String codigo, String numero) {
        this.idContactoTelefono = idContactoTelefono;
        this.codigo = codigo;
        this.numero = numero;
    }

    // METODOS
    public Integer getIdContactoTelefono() {
        return idContactoTelefono;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
}
