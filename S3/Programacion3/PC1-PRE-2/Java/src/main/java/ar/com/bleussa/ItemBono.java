package ar.com.bleussa;

import jakarta.persistence.*;

@Entity
public class ItemBono {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String codigo;

    private String descripcion;

    private double monto;

    private boolean esRemunerativo;

    @ManyToOne(cascade = CascadeType.ALL)
    private BonoSueldo bonoSueldo;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public boolean isEsRemunerativo() {
        return esRemunerativo;
    }

    public void setEsRemunerativo(boolean esRemunerativo) {
        this.esRemunerativo = esRemunerativo;
    }

    public BonoSueldo getBonoSueldo() {
        return bonoSueldo;
    }

    public void setBonoSueldo(BonoSueldo bonoSueldo) {
        this.bonoSueldo = bonoSueldo;
    }
}
