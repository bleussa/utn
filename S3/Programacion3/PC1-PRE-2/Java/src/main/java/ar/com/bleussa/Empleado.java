package ar.com.bleussa;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int legajo;

    private String nombreCompleto;
    private String domicilio;

    @ManyToOne(cascade = CascadeType.ALL)
    private Sector sector;

    @OneToMany(mappedBy = "empleado")
    private List<BonoSueldo> bonosSueldo = new ArrayList<>();

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public Sector getSector() {
        return sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }

    public List<BonoSueldo> getBonosSueldo() {
        return bonosSueldo;
    }

    public void setBonosSueldo(List<BonoSueldo> bonosSueldo) {
        this.bonosSueldo = bonosSueldo;
    }

    /*
    Codifique en la clase Empleado un método denominado “public double
    getTotalBonoSueldoXPeriodo(int mes, int anio)” que retorne el total del bono de
    sueldo del empleado para un mes y año especifico.
    */
    public double getTotalBonoSueldoXPeriodo(int mes, int anio) {
        for (BonoSueldo bono : this.getBonosSueldo()) {
            if (bono.getAnio() == anio && bono.getMes() == mes){
                return bono.getTotal();
            }
        }
        return -1;
    }
}
