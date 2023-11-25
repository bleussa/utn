package bleussa;

public class Diagnostico {
    // ATRIBUTOS
    private String texto;
    private Tratamiento tratamiento = new Tratamiento();
    private TipoDiagnostico tipo;

    // CONSTRUCTORES
    public Diagnostico(String texto, TipoDiagnostico tipoDiagnostico) {
        this.texto = texto;
        this.tratamiento = new Tratamiento();
        this.tipo = tipoDiagnostico;
    }

    // METODOS
    public String getTexto() {
        return texto;
    }
    public Tratamiento getTratamiento() {
        return tratamiento;
    }
    public TipoDiagnostico getTipoDiagnostico() {
        return tipo;
    }
    public void setTratamiento(Tratamiento tratamiento) {
        this.tratamiento = tratamiento;
    }
}
