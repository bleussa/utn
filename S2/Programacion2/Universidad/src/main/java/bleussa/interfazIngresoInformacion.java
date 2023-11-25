package bleussa;

import java.util.ArrayList;

public class interfazIngresoInformacion {
    private String comentariosAbiertosEnLinea;
    private String formularioEnLinea;
    private byte plataformaDeSoftware;

    public interfazIngresoInformacion(String comentariosAbiertosEnLinea, String formularioEnLinea, byte plataformaDeSoftware) {
        this.comentariosAbiertosEnLinea = comentariosAbiertosEnLinea;
        this.formularioEnLinea = formularioEnLinea;
        this.plataformaDeSoftware = plataformaDeSoftware;
    }

    public interfazIngresoInformacion() {

    }

    public String getComentariosAbiertosEnLinea() {
        return comentariosAbiertosEnLinea;
    }

    public void setComentariosAbiertosEnLinea(String comentariosAbiertosEnLinea) {
        this.comentariosAbiertosEnLinea = comentariosAbiertosEnLinea;
    }

    public String getFormularioEnLinea() {
        return formularioEnLinea;
    }

    public void setFormularioEnLinea(String formularioEnLinea) {
        this.formularioEnLinea = formularioEnLinea;
    }

    public byte getPlataformaDeSoftware() {
        return plataformaDeSoftware;
    }

    public void setPlataformaDeSoftware(byte plataformaDeSoftware) {
        this.plataformaDeSoftware = plataformaDeSoftware;
    }

    public String registroDeFormularioEnLinea(){
        return "registroDeFormularioEnLinea";
    }
}
