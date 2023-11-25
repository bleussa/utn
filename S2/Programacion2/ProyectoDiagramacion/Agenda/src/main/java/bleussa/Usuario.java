package bleussa;

import java.util.ArrayList;

public class Usuario extends Persona{
    // ATRIBUTOS
    private Integer idUsuario;
    private String usuario;
    private String password;
    private ArrayList<Contacto> contactos = new ArrayList<>();

    // CONSTRUCTOR
    public Usuario(String nombre, String apellido, Integer idPersona, Integer idUsuario, String usuario, String password) {
        super(nombre, apellido, idPersona);
        this.idUsuario = idUsuario;
        this.usuario = usuario;
        this.password = password;
    }

    // METODOS
    public Integer getIdUsuario() {
        return idUsuario;
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public ArrayList<Contacto> getContactos() {
        return contactos;
    }
    public void addContacto(Contacto contacto) {
        this.contactos.add(contacto);
    }
}
