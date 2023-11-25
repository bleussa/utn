package bleussa.clase140323;

import java.util.ArrayList;

public class Encargado extends Empleado {
    private ArrayList<Operador> operadoresCargo;

    public Encargado(ArrayList<Operador> operadoresCargo, int legajo, String obraSocial, double salario, int id, String nombre, String apellido, double estatura, int edad) {
        super(legajo, obraSocial, salario, id, nombre, apellido, estatura, edad);
        this.operadoresCargo = operadoresCargo;
    }

    public Encargado(int id, String nombre, String apellido, double estatura, int edad) {
        super(id, nombre, apellido, estatura, edad);
    }
    
    public ArrayList<Operador> getOperadoresCargo() {
        return operadoresCargo;
    }

    public void setOperadoresCargo(ArrayList<Operador> operadoresCargo) {
        this.operadoresCargo = operadoresCargo;
    }
    
    public void cargaHoraria(){
        System.out.println("7 HORAS");
    }
    
    public void cobrar(){
        
    };
    
    public void asignarGuardia(Operador operador){
        
    }
    
}
