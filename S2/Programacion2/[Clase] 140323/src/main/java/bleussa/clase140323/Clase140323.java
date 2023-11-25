package bleussa.clase140323;

import java.lang.instrument.Instrumentation;
import java.util.ArrayList;

public class Clase140323 {

    public static void main(String[] args) {
        
        // Creamos un jefe con solo la informacion de Persona
        Jefe joaquin = new Jefe(22468877, "Joaquin", "Derosas", 175, 54);        
        // Le agregamos la informacion de Empleado
        joaquin.setLegajo(2359);
        joaquin.setObraSocial("Sancor Salud");
        joaquin.setSalario(195000);
        
        ArrayList<String> Nombres = new ArrayList<>();
        
        // Le agregamos la informacion de Jefe
        joaquin.setOficinaPropia(true);

        ArrayList<Operador> operadores = new ArrayList<Operador>();
        
        
        // Creamos un encargado de cero
        Encargado alberto = new Encargado(operadores, 1879, "Sancor Salud", 25000, 44247063, "Alberto", "Bleuss", 172, 20);
        Operador facundo = new Operador(true, 158, "OSDE", 15000, 1575, "Facundo", "Gomez", 170, 25);
        
        // joaquin.cargaHoraria(); // METODO SOBREESCRITO
        // alberto.cargaHoraria(); // METODO SOBREESCRITO
        // facundo.cargaHoraria(); // METODO ORIGINAL
        
        Camion benz = new Camion(3, "Mercedes Benz", 2022, 2);
        
        accion(joaquin);
        accion(benz);
        accion(facundo);
        
        
    }
    
    public static void accion(Trabajar a){
        a.cantidadHoras();
        System.out.print("Velocidad promedio = ");
        a.velocidad_promedio();
    }
}
