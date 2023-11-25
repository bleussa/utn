package bleussa;

import java.util.ArrayList;

public class Recopilacion extends recoleccionDeInformacion{
    private String datosMayorFavorabilidad;
    private String datosMayorUrgencia;

    public Recopilacion(String comentariosAbiertosEnLinea, String formularioEnLinea, byte plataformaDeSoftware, ArrayList<Problema> problemas, ArrayList<Necesidad> necesidades, String datosDeLosAfecutados, String datosDeLosDirectamenteInterezados, String datosMayorFavorabilidad, String datosMayorUrgencia) {
        super(comentariosAbiertosEnLinea, formularioEnLinea, plataformaDeSoftware, problemas, necesidades, datosDeLosAfecutados, datosDeLosDirectamenteInterezados);
        this.datosMayorFavorabilidad = datosMayorFavorabilidad;
        this.datosMayorUrgencia = datosMayorUrgencia;
    }

    public Recopilacion(String comentariosAbiertosEnLinea, String formularioEnLinea, byte plataformaDeSoftware, ArrayList<Problema> problemas, ArrayList<Necesidad> necesidades, String datosDeLosAfecutados, String datosDeLosDirectamenteInterezados) {
        super(comentariosAbiertosEnLinea, formularioEnLinea, plataformaDeSoftware, problemas, necesidades, datosDeLosAfecutados, datosDeLosDirectamenteInterezados);
    }

    public Recopilacion() {

    }

    public String getDatosMayorFavorabilidad() {
        return datosMayorFavorabilidad;
    }

    public void setDatosMayorFavorabilidad(String datosMayorFavorabilidad) {
        this.datosMayorFavorabilidad = datosMayorFavorabilidad;
    }

    public String getDatosMayorUrgencia() {
        return datosMayorUrgencia;
    }

    public void setDatosMayorUrgencia(String datosMayorUrgencia) {
        this.datosMayorUrgencia = datosMayorUrgencia;
    }

    public String filtrar(){
        return "Filtrar";
    }
    public String priorizar(){
        return "Priorizar";
    }
}
