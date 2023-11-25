package bleussa;

import java.util.ArrayList;

public class Paciente {
    // ATRIBUTOS
    private String nsip;
    private String nombreApellidos;
    private char sexo;
    private Fecha fechaNacimiento = new Fecha();
    private ArrayList<Diagnostico> diagnosticos = new ArrayList<>();

    // CONSTRUCTORES
    public Paciente(String nsip, String nombreApellidos, char sexo, Fecha fechaNacimiento) {
        this.nsip = nsip;
        this.nombreApellidos = nombreApellidos;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
    }

    // METODOS
    public String getNsip() {
        return nsip;
    }
    public String getNombreApellidos() {
        return nombreApellidos;
    }
    public char getSexo() {
        return sexo;
    }
    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }
    public ArrayList<Diagnostico> getDiagnosticos() {
        return diagnosticos;
    }
    public Diagnostico getUltimoDiagnostico(){
       return this.diagnosticos.get(this.diagnosticos.size() - 1);
    }
}
