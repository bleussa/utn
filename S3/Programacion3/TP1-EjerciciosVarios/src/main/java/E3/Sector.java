package ejercicio3;

import ejercicio1.Expediente;

import java.util.ArrayList;

public class Sector {
    private int numero;
    private String denominacion, tipo;
    private ArrayList<Sector> sectores = new ArrayList<>();
    private Sector sector;

    public Sector() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Sector> getSectores() {
        return sectores;
    }

    public void setSectores(ArrayList<Sector> sectores) {
        this.sectores = sectores;
    }

    public Sector getSector() {
        return sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }

    public void obtenerTotalSubsectores(Sector sector, ArrayList<Sector> sectores){
        sectores.add(sector);
        for (Sector str : sector.getSectores()) {
            obtenerTotalSubsectores(str, sectores);
        }
    }

}
