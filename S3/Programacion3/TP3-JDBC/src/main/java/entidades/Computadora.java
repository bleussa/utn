package entidades;

import java.util.ArrayList;
import java.util.List;


public class Computadora {

    private int id;
    private String codigo;
    private String marca;
    private String modelo;
    private List<Componente> componentes = new ArrayList<>();

    public Computadora() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public List<Componente> getComponentes() {
        return componentes;
    }

    public void setComponentes(List<Componente> componentes) {
        this.componentes = componentes;
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "id=" + id +
                ", codigo='" + codigo + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", componentes=" + componentes +
                '}';
    }
}
