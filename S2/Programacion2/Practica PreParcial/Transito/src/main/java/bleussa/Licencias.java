package bleussa;

import java.util.ArrayList;

public class Licencias {
    private int idLicencia, puntosInicialesLicencia;
    private String fechaDeVto;
    private ArrayList<ConductorLicencias> conductorLicencias = new ArrayList<>();

    public Licencias() {}

    public int getIdLicencia() {
        return idLicencia;
    }

    public void setIdLicencia(int idLicencia) {
        this.idLicencia = idLicencia;
    }

    public int getPuntosInicialesLicencia() {
        return puntosInicialesLicencia;
    }

    public void setPuntosInicialesLicencia(int puntosInicialesLicencia) {
        this.puntosInicialesLicencia = puntosInicialesLicencia;
    }

    public String getFechaDeVto() {
        return fechaDeVto;
    }

    public void setFechaDeVto(String fechaDeVto) {
        this.fechaDeVto = fechaDeVto;
    }

    public ArrayList<ConductorLicencias> getConductorLicencias() {
        return conductorLicencias;
    }

    public void setConductorLicencias(ArrayList<ConductorLicencias> conductorLicencias) {
        this.conductorLicencias = conductorLicencias;
    }
}
