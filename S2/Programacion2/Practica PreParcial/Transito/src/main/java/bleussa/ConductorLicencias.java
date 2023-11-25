package bleussa;

public class ConductorLicencias {
    private Conductor conductor;
    private Licencias licencia;

    public ConductorLicencias() {}

    public ConductorLicencias(Conductor conductor, Licencias licencia) {
        this.conductor = conductor;
        this.licencia = licencia;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public Licencias getLicencia() {
        return licencia;
    }

    public void setLicencia(Licencias licencia) {
        this.licencia = licencia;
    }
}
