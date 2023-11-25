package bleussa;

public class Cama {
    // ATRIBUTOS
    private Paciente paciente;

    // CONSTRUCTORES
    public Cama() {}

    // METODOS
    public Paciente getPaciente() {
        return paciente;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    public boolean esOcupada(){
        if (this.paciente == null){
            return false;
        } else {
            return true;
        }
    }

}
