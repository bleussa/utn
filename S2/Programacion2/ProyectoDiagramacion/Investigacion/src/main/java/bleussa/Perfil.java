package bleussa;

public class Perfil {
    // ATRIBUTOS
    private int tipoPerfil;
    private String descripcion;

    // CONSTRUCTOR
    public Perfil() {}

    // METODOS
    public int getTipoPerfil() {
        return tipoPerfil;
    }
    public void setTipoPerfil(int tipoPerfil) {
        this.tipoPerfil = tipoPerfil;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
