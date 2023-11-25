package bleussa;

import java.util.ArrayList;

public class Necesidad {
    private String definir;
    private ArrayList<interfazIngresoInformacion> interfazIngresoInformaciones = new ArrayList();

    public Necesidad(String definir) {
        this.definir = definir;
    }

    public Necesidad() {
    }

    public ArrayList<interfazIngresoInformacion> getInterfazIngresoInformaciones() {
        return interfazIngresoInformaciones;
    }

    public void setInterfazIngresoInformaciones(ArrayList<interfazIngresoInformacion> interfazIngresoInformaciones) {
        this.interfazIngresoInformaciones = interfazIngresoInformaciones;
    }

    public String getDefinir() {
        return definir;
    }

    public void setDefinir(String definir) {
        this.definir = definir;
    }

    public String insatisfaccion(){
        return "Insatisfaccion";
    }
}
