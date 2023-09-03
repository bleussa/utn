package entidades;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Especialidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEspecialidad;

    @Column
    private String denominacion;

    @ManyToMany(mappedBy = "especialidades")
    private List<Medico> medicos = new ArrayList<>();

    public Especialidad() {
    }

    public Especialidad(String denominacion) {
        this.denominacion = denominacion;
    }

    public int getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(int idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public List<Medico> getMedicos() {
        return medicos;
    }

    public void setMedicos(List<Medico> medicos) {
        this.medicos = medicos;
    }
}
