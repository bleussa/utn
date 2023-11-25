package bleussa.clase140323;

import java.util.ArrayList;

public class Jefe extends Empleado{
    private ArrayList<Encargado> encargadosCargo;
    private boolean oficinaPropia;

    public Jefe(ArrayList<Encargado> encargadosCargo, boolean oficinaPropia, int legajo, String obraSocial, double salario, int id, String nombre, String apellido, double estatura, int edad) {
        super(legajo, obraSocial, salario, id, nombre, apellido, estatura, edad);
        this.encargadosCargo = encargadosCargo;
    }

    public Jefe(int id, String nombre, String apellido, double estatura, int edad) {
        super(id, nombre, apellido, estatura, edad);
    }

    public ArrayList<Encargado> getEncargadosCargo() {
        return encargadosCargo;
    }

    public void setEncargadosCargo(ArrayList<Encargado> encargadosCargo) {
        this.encargadosCargo = encargadosCargo;
    }

    public boolean isOficinaPropia() {
        return oficinaPropia;
    }

    public void setOficinaPropia(boolean oficinaPropia) {
        this.oficinaPropia = oficinaPropia;
    }
    
    public void cargaHoraria(){
        System.out.println("6 HORAS");
    }
    
    public void cobrar(int cbu){
        
    };

    @Override
    public void cantidadHoras() {
        System.out.println("Trabajo 1hs");
    }
    
    
    
    public boolean contratar(Persona persona){
        return false;
    }
    public boolean contratar(ArrayList<Persona> personal){
        return false;
    }
    public boolean aumentoSalarial(Persona persona){
        return false;
    }
    
}
