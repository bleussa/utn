package bleussa;

import java.util.ArrayList;

public class recoleccionDeInformacion extends interfazIngresoInformacion{
    private String datosDeLosAfecutados;
    private String datosDeLosDirectamenteInterezados;

    public recoleccionDeInformacion(String comentariosAbiertosEnLinea, String formularioEnLinea, byte plataformaDeSoftware, ArrayList<Problema> problemas, ArrayList<Necesidad> necesidades, String datosDeLosAfecutados, String datosDeLosDirectamenteInterezados) {
        super(comentariosAbiertosEnLinea, formularioEnLinea, plataformaDeSoftware);
        this.datosDeLosAfecutados = datosDeLosAfecutados;
        this.datosDeLosDirectamenteInterezados = datosDeLosDirectamenteInterezados;
    }

    public recoleccionDeInformacion(String comentariosAbiertosEnLinea, String formularioEnLinea, byte plataformaDeSoftware, ArrayList<Problema> problemas, ArrayList<Necesidad> necesidades) {
        super(comentariosAbiertosEnLinea, formularioEnLinea, plataformaDeSoftware);
    }

    public recoleccionDeInformacion() {
        super();
    }

    public String getDatosDeLosAfecutados() {
        return datosDeLosAfecutados;
    }

    public void setDatosDeLosAfecutados(String datosDeLosAfecutados) {
        this.datosDeLosAfecutados = datosDeLosAfecutados;
    }

    public String getDatosDeLosDirectamenteInterezados() {
        return datosDeLosDirectamenteInterezados;
    }

    public void setDatosDeLosDirectamenteInterezados(String datosDeLosDirectamenteInterezados) {
        this.datosDeLosDirectamenteInterezados = datosDeLosDirectamenteInterezados;
    }

    public String conocer(){
        return "Conocer";
    }
}
