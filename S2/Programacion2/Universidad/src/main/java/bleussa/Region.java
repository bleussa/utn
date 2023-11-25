package bleussa;

import java.util.ArrayList;

public class Region {
    private String aspectoSocioCulturales;
    private String nivelGrupal;
    private String nivelPersonal;
    private String parteEspecificaDelPais;
    private ArrayList<Problema> problemas = new ArrayList();
    private ArrayList<Necesidad> necesidades = new ArrayList();
    private ArrayList<Universidad> universidades = new ArrayList();

    public Region(String aspectoSocioCulturales, String nivelGrupal, String nivelPersonal, String parteEspecificaDelPais, ArrayList<Problema> problemas, ArrayList<Necesidad> necesidades) {
        this.aspectoSocioCulturales = aspectoSocioCulturales;
        this.nivelGrupal = nivelGrupal;
        this.nivelPersonal = nivelPersonal;
        this.parteEspecificaDelPais = parteEspecificaDelPais;
        this.problemas = problemas;
        this.necesidades = necesidades;
    }

    public Region() {
    }

    public ArrayList<Universidad> getUniversidades() {
        return universidades;
    }

    public void setUniversidades(ArrayList<Universidad> universidades) {
        this.universidades = universidades;
    }

    public String getAspectoSocioCulturales() {
        return aspectoSocioCulturales;
    }

    public void setAspectoSocioCulturales(String aspectoSocioCulturales) {
        this.aspectoSocioCulturales = aspectoSocioCulturales;
    }

    public String getNivelGrupal() {
        return nivelGrupal;
    }

    public void setNivelGrupal(String nivelGrupal) {
        this.nivelGrupal = nivelGrupal;
    }

    public String getNivelPersonal() {
        return nivelPersonal;
    }

    public void setNivelPersonal(String nivelPersonal) {
        this.nivelPersonal = nivelPersonal;
    }

    public String getParteEspecificaDelPais() {
        return parteEspecificaDelPais;
    }

    public void setParteEspecificaDelPais(String parteEspecificaDelPais) {
        this.parteEspecificaDelPais = parteEspecificaDelPais;
    }

    public ArrayList<Problema> getProblemas() {
        return problemas;
    }

    public void setProblemas(ArrayList<Problema> problemas) {
        this.problemas = problemas;
    }

    public ArrayList<Necesidad> getNecesidades() {
        return necesidades;
    }

    public void setNecesidades(ArrayList<Necesidad> necesidades) {
        this.necesidades = necesidades;
    }

    public char cotidianidad(){
        return 'A';
    }

}
