package bleussa;

import java.util.ArrayList;

public class Contacto extends Persona{
    // ATRIBUTOS
    private Integer idContacto;
    private ContactoTipo tipo;
    private ArrayList<ContactoDomicilio> domicilios = new ArrayList<>();
    private ArrayList<ContactoTelefono> telefonos = new ArrayList<>();

    // CONSTRUCTOS FULL
    public Contacto(String nombre, String apellido, Integer idPersona, Integer idContacto, ContactoTipo tipo) {
        super(nombre, apellido, idPersona);
        this.idContacto = idContacto;
        this.tipo = tipo;
    }

    // METODOS
    public Integer getIdContacto() {
        return idContacto;
    }
    public ContactoTipo getTipo() {
        return tipo;
    }
    public void setTipo(ContactoTipo tipo) {
        this.tipo = tipo;
    }
    public ArrayList<ContactoDomicilio> getDomicilios() {
        return domicilios;
    }
    public void addDomicilio(ContactoDomicilio domicilio){
        this.domicilios.add(domicilio);
    }
    public ArrayList<ContactoTelefono> getTelefonos() {
        return telefonos;
    }
    public void addTelefono(ContactoTelefono telefono){
        this.telefonos.add(telefono);
    }

}
