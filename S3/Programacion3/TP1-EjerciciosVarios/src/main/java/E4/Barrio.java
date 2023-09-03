package ejercicio4;

import java.util.ArrayList;

public class Barrio {
    private long id;
    private String nombre, empresaConstructora;
    private ArrayList<Vivienda> viviendas = new ArrayList<>();

    public Barrio() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmpresaConstructora() {
        return empresaConstructora;
    }

    public void setEmpresaConstructora(String empresaConstructora) {
        this.empresaConstructora = empresaConstructora;
    }

    public ArrayList<Vivienda> getViviendas() {
        return viviendas;
    }

    public void setViviendas(ArrayList<Vivienda> viviendas) {
        this.viviendas = viviendas;
    }

    public double getSuperficieTotalTerreno(){
        double superficie = 0;

        for (Vivienda vivienda : this.getViviendas()) {
            superficie += vivienda.getSuperficieTerreno();
        }

        return superficie;
    }

    public double getSuperficieTotalCubierta(){
        double superficieTotalCubierta = 0;
        for (Vivienda vivienda : this.getViviendas()) {
            superficieTotalCubierta += vivienda.getMetrosCuadradosCubiertos();
        }
        return superficieTotalCubierta;
    }
}
