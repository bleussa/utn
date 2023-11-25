package bleussa;

import java.util.ArrayList;

public class Problema {
    private String definir;
    private ArrayList<interfazIngresoInformacion> interfazIngresoInformaciones = new ArrayList();

    public Problema(String definir) {
        this.definir = definir;
    }

    public Problema() {

    }

    public ArrayList<interfazIngresoInformacion> getInterfazIngresoInformaciones() {
        return interfazIngresoInformaciones;
    }

    public void setInterfazIngresoInformaciones(ArrayList<interfazIngresoInformacion> interfazIngresoInformaciones) {
        this.interfazIngresoInformaciones = interfazIngresoInformaciones;
    }

    public String efectosIndeseables() {
        return "Efectos Indeseables";
    }

    public String getDefinir() {
        return definir;
    }

    public void setDefinir(String definir) {
        this.definir = definir;
    }
}
