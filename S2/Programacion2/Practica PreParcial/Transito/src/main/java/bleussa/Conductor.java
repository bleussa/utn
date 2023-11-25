package bleussa;

import java.util.ArrayList;

public class Conductor extends Persona{
    private String domicilio;
    private ArrayList<ConductorLicencias> conductorLicencias = new ArrayList<>();

    public Conductor() {}

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public ArrayList<ConductorLicencias> getConductorLicencias() {
        return conductorLicencias;
    }

    public void setConductorLicencias(ArrayList<ConductorLicencias> conductorLicencias) {
        this.conductorLicencias = conductorLicencias;
    }
}
