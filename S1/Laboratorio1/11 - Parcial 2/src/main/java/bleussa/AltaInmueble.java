package bleussa;

import java.util.ArrayList;

public class AltaInmueble {

    static Edificio edificio = new Edificio();

    // creamos un listado vacio de los tipos de ambiente
    static ArrayList<String> tiposDeAmbiente = new ArrayList<String>();


    // creamos un metodo para cargar los tipos de ambiente
    public static void cargarTiposDeCasa(){
        tiposDeAmbiente.add("C");
        tiposDeAmbiente.add("CC");
        tiposDeAmbiente.add("B");
        tiposDeAmbiente.add("BS");
        tiposDeAmbiente.add("E");
        tiposDeAmbiente.add("H");
    }

    public static void main(String[] args) {

        cargarTiposDeCasa();

        // ejecutamos el metodo que carga los datos del edificio
        edificio.cargarDatosEdificio(tiposDeAmbiente);
        edificio.mostrarDatosEdificio();

        // no logre encontrar la manera para que valide correctamente
        // el piso y la letra de cada departamento

    }

}
