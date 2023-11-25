package bleussa;

public class Foto {
    // ATRIBUTOS
    private String pathToFile;
    private String nombre;
    private float tamanio;

    // CONSTRUCTORES
    public Foto() {
    }

    // ATRIBUTOS
    public String getPathToFile() {
        return pathToFile;
    }
    public void setPathToFile(String pathToFile) {
        this.pathToFile = pathToFile;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public float getTamanio() {
        return tamanio;
    }
    public void setTamanio(float tamanio) {
        this.tamanio = tamanio;
    }
}
