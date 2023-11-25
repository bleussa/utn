package bleussalbert.trabajopractico2;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author bleussa
 */
public class FuncionesPrograma {

    public static String getFechaString(Date fecha, DateFormat format){
        String fechaString = format.format(fecha);
        return "LA FECHA ES " + fechaString;
    }

    public static String getFechaDate(int dia, int mes, int anio) throws ParseException {

        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        String inputFecha = dia + "/" + mes + "/" + anio;

        Date fechaDate = format.parse(inputFecha);

        String mostrarFecha = format.format(fechaDate);

        return "LA FECHA ES " + inputFecha;
    }
    
}
