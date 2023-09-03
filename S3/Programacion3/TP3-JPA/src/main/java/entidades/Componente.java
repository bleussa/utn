package entidades;

import javax.persistence.*;

@Entity
public class Componente {

    @Id
    private int id;

    @Column
    private String nombre;

    @Column
    private String nroSerie;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Computadora computadora;

    public Componente() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNroSerie() {
        return nroSerie;
    }

    public void setNroSerie(String nroSerie) {
        this.nroSerie = nroSerie;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }
}
