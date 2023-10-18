package ar.com.bleussa;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Sector {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;

    private String denominacion;

    @OneToMany(mappedBy = "sector")
    private List<Empleado> empleados = new ArrayList<>();

    @ManyToOne(cascade = CascadeType.ALL)
    private Sector sector;

    @OneToMany
    private List<Sector> sectores = new ArrayList<>();

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public Sector getSector() {
        return sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }

    public List<Sector> getSectores() {
        return sectores;
    }

    public void setSectores(List<Sector> sectores) {
        this.sectores = sectores;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    /*
    Codifique en la clase Sector un método denominado “public List<Sector>
    getArbolSectores()” que retorne la totalidad de sectores hijos asociados al sector
    referido.
    */

    public List<Sector> getArbolSectores(){
        List<Sector> sectores = new ArrayList<>();
        this.listaRecursivo(this, sectores);
        return sectores;
    }

    private void listaRecursivo(Sector sectorHijo, List<Sector> listado){

        if(!sectorHijo.getSectores().isEmpty()){
            for(Sector sector : this.getSectores()){
                listaRecursivo(this, listado);
            }
        }

    }
}
