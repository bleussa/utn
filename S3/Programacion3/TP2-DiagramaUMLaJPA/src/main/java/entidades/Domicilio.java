package entidades;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Domicilio implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDomicilio;

    @Column
    private String localidad;

    @Column
    private String calle;

    @Column
    private int numero;

    @OneToOne(mappedBy = "domicilio")
    private Persona persona;

    public Domicilio() {
    }

    public Domicilio(String localidad, String calle, int numero) {
        this.localidad = localidad;
        this.calle = calle;
        this.numero = numero;
    }

    public int getIdDomicilio() {
        return idDomicilio;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
