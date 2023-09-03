package ejercicio1;

import java.util.ArrayList;

public class Expediente {
    
    private int id, numero;
    private String letra, descripcion, tipo, ambito;
    private ArrayList<Control> controles = new ArrayList();
    private Expediente expediente;
    private ArrayList<Expediente> expedientes;

    public Expediente() {
    }

    public Expediente(int id, int numero, String letra, String descripcion, String tipo, String ambito, Expediente expediente, ArrayList<Expediente> expedientes) {
        this.id = id;
        this.numero = numero;
        this.letra = letra;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.ambito = ambito;
        this.expediente = expediente;
        this.expedientes = expedientes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAmbito() {
        return ambito;
    }

    public void setAmbito(String ambito) {
        this.ambito = ambito;
    }

    public ArrayList<Control> getControles() {
        return controles;
    }

    public void setControles(ArrayList<Control> controles) {
        this.controles = controles;
    }

    public Expediente getExpediente() {
        return expediente;
    }

    public void setExpediente(Expediente expediente) {
        this.expediente = expediente;
    }

    public ArrayList<Expediente> getExpedientes() {
        return expedientes;
    }

    public void setExpedientes(ArrayList<Expediente> expedientes) {
        this.expedientes = expedientes;
    }

    /*
    Codifique en la clase Expediente un método denominado “public String
    getCaratulaExpediente()” que retorne la concatenación de los campos número, letra
    y descripción separados con guion medio -
    */
    public String getCaratulaExpediente(){
        return this.numero + "-" + this.letra + "-" + this.descripcion;
    }

    /*
    Codifique en la clase Expediente un método denominado “public String
    getControlesObligatorios ()” que retorne una lista separada con comas de la
    denominación de los controles obligatorios asociados al expedientes.
    */
    public String getControlesObligatorios(){
        String mensaje = "";
        for (int i = 0; i < this.controles.size(); i++) {
            if (this.controles.get(i).isEsObligatorio() == true){
                mensaje += this.controles.get(i).getDenominacion() + ", ";
            }
        }
        return mensaje;
    }

    /*
    Codifique en la clase Expediente un método denominado “public boolean
    getEstadoControles()” que retorne true en caso de que todos los estados de los
    controles obligatorios se encuentren aprobados, caso contrario retorne false.
    */
    public boolean getEstadoControles(){
        for (int i = 0; i < this.controles.size(); i++){
            if (!this.controles.get(i).getEstado().isAprobado()){
                return false;
            }
        }
        return true;
    }
    
    /*
    Codifique en la clase Expediente un método denominado “public
    List<Expediente> listaExpedientes()” que haciendo uso de RECURSIÓN retorne una
    lista de objetos Expediente asociados a él. (Nota: para resolver el ejercicio es
    recomendable usar un método auxiliar que realice la recursión)
    */
    public ArrayList<Expediente> listaExpedientes(){
        ArrayList<Expediente> arbolExpedientes = new ArrayList<>();
        this.listaRecursivo(this, arbolExpedientes);
        return arbolExpedientes;
    }
    
    private void listaRecursivo(Expediente expHijo, ArrayList<Expediente> listado){
        listado.add(expHijo);
        if(!expHijo.expedientes.isEmpty()){
            for(Expediente exp : this.getExpedientes()){
                listaRecursivo(exp, listado);
            }
        }
    }
}
    
    
