package bleussa;

import java.util.ArrayList;

public class Persona {
    // ATRIBUTOS
    private String nombre, apellido;
    private Foto foto;
    private ArrayList<MedioDeComunicacion> comunicaciones = new ArrayList<>();
    private ArrayList<Perfil> perfiles = new ArrayList<>();

    // CONSTRUCTOR
    public Persona() {
    }
    public Persona(String nombre, String apellido, Foto foto, ArrayList<MedioDeComunicacion> comunicaciones, ArrayList<Perfil> perfiles) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.foto = foto;
        this.comunicaciones = comunicaciones;
        this.perfiles = perfiles;
    }


    // METODOS
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public ArrayList<Perfil> getPerfiles() {
        return perfiles;
    }
    public void setPerfiles(ArrayList<Perfil> perfiles) {
        this.perfiles = perfiles;
    }
    public Foto getFoto() {
        return foto;
    }
    public void setFoto(Foto foto) {
        this.foto = foto;
    }
    public ArrayList<MedioDeComunicacion> getComunicaciones() {
        return comunicaciones;
    }
    public void setComunicaciones(ArrayList<MedioDeComunicacion> comunicaciones) {
        this.comunicaciones = comunicaciones;
    }
}
