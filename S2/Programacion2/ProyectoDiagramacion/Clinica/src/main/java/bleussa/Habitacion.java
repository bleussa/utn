package bleussa;

import java.util.ArrayList;

public class Habitacion {
    // ATRIBUTOS
    private static int siguienteNumero = 1;
    private int numero;
    private ArrayList<Cama> camas = new ArrayList<>();

    // CONSTRUCTORES
    public Habitacion(int numero) {
        this.numero = numero;
    }

    // METODOS
    public int getNumero() {
        return numero;
    }
    public ArrayList<Cama> getCamas() {
        return camas;
    }
    public int getNumCamas() {
        return this.camas.size();
    }
    public void addCama(Cama cama){
        this.camas.add(cama);
    }
    public Cama getCama(int index){
        return this.camas.get(index);
    }
    public void ingresaPaciente(Paciente paciente){
        for (Cama cama : camas){
            if (cama.esOcupada()){
                System.out.println("[MENSAJE] La cama " + camas.indexOf(cama) + " esta ocupada.");
            } else {
                cama.setPaciente(paciente);
                System.out.println("[MENSAJE] La cama " + camas.indexOf(cama) + " fue asignada al paciente " + paciente.getNombreApellidos());
                break;
            }
        }
    }
    public int getNumeroCamaPaciente(Paciente paciente){
        for (Cama cama: camas) {
            if (cama.getPaciente() == paciente){
                return camas.indexOf(cama);
            }
        }
        return 0;
    }
    public void quitarPaciente(Paciente paciente){
        for (Cama cama: camas) {
            if (cama.getPaciente() == paciente){
                camas.remove(cama);
            }
        }
    }
    @Override
    public String toString() {
        return "Habitacion " + numero +" (Cantidad de camas: " + camas.size() + ")";
    }
}
