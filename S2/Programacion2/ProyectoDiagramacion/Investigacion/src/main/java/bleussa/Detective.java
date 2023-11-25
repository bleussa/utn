package bleussa;

import java.util.ArrayList;

public class Detective extends Persona{
    // ATRIBUTOS
    private String numeroPlaca;

    // CONSTRUCTORES
    public Detective(String nombre, String apellido, Foto foto, ArrayList<MedioDeComunicacion> comunicaciones, ArrayList<Perfil> perfiles, String numeroPlaca) {
        super(nombre, apellido, foto, comunicaciones, perfiles);
        this.numeroPlaca = numeroPlaca;
    }

    // METODOS
    public String getNumeroPlaca() {
        return numeroPlaca;
    }
    public void setNumeroPlaca(String numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
    }
    public boolean investigarMafioso(Mafioso mafioso){
        if (mafioso.investigar()){
            return true;
        } else {
            return false;
        }
    }
}
