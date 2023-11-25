package bleussa;

import java.util.ArrayList;

public class Mafioso extends Persona implements Investigable{
    // ATRIBUTOS
    private ArrayList<Lugar> lugaresFrecuentes = new ArrayList<>();

    // CONSTRUCTORES


    public Mafioso(String nombre, String apellido, Foto foto, ArrayList<MedioDeComunicacion> comunicaciones, ArrayList<Perfil> perfiles, ArrayList<Lugar> lugaresFrecuentes) {
        super(nombre, apellido, foto, comunicaciones, perfiles);
        this.lugaresFrecuentes = lugaresFrecuentes;
    }

    // METODOS
    public ArrayList<Lugar> getLugaresFrecuentes() {
        return lugaresFrecuentes;
    }
    public void setLugaresFrecuentes(ArrayList<Lugar> lugaresFrecuentes) {
        this.lugaresFrecuentes = lugaresFrecuentes;
    }
    public void addLugar(Lugar lugar){
        this.lugaresFrecuentes.add(lugar);
    }
    public void removeLugar(Lugar lugar){
        this.lugaresFrecuentes.remove(lugar);
    }
    @Override
    public boolean investigar() {
        if (this.getNombre().equals("Pablo")){
            return true;
        } else {
            return false;
        }
    }
}
