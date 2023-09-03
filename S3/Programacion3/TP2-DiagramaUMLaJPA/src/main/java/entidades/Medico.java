package entidades;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Medico extends Persona{

    @Column(name = "matricula", unique = true)
    private int matricula;

    @Column
    private long celular;

    @OneToMany(mappedBy = "medico", cascade = CascadeType.PERSIST)
    private List<Turno> turnos;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "medico_especialidad",
            joinColumns = @JoinColumn(name = "fkMedico"),
            inverseJoinColumns = @JoinColumn(name = "fkEspecialidad")
    )
    private List<Especialidad> especialidades = new ArrayList<>();


    public Medico(String nombre, String apellido, long dni, Domicilio domicilio, int matricula, long celular) {
        super(nombre, apellido, dni, domicilio);
        this.matricula = matricula;
        this.celular = celular;
    }

    public Medico() {

    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }

    public List<Turno> getTurnos() {
        return turnos;
    }

    public void setTurnos(List<Turno> turnos) {
        this.turnos = turnos;
    }

    public List<Especialidad> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(List<Especialidad> especialidades) {
        this.especialidades = especialidades;
    }
}
