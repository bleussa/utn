package bleussa;

import java.util.ArrayList;

public class AltaBarrio {

    // Instanciamos el objeto barrio
    static Barrio barrio = new Barrio();

    // Creamos un listado vacio de los tipos de casa.
    static ArrayList<String> tiposDeCasa = new ArrayList<String>();

    // Creamos un metodo para cargar los tipos de casa
    public static void cargarTiposDeCasa(){
        tiposDeCasa.add("B");
        tiposDeCasa.add("S");
        tiposDeCasa.add("SS");
        tiposDeCasa.add("P");
    }


    public static void main(String[] args) {

        // Cargamos sus datos con el metodo cargarDatosBarrio
        barrio.cargarDatosBarrio(tiposDeCasa);

    }



}
