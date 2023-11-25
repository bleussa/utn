package bleussa;

public class Main {
    public static void main(String[] args) {

        // CREAMOS DOS TIPOS
        ContactoTipo contactoTipo1 = new ContactoTipo(1, "Familia");    // MANERA 1
        ContactoTipo contactoTipo2 = new ContactoTipo(2);                           // MANERA 2
        contactoTipo2.setDescripcion("Trabajo");

        // CREAMOS TRES DOMICILIOS
        ContactoDomicilio contactoDomicilio1 = new ContactoDomicilio(1, "Neuquen 2029");
        ContactoDomicilio contactoDomicilio2 = new ContactoDomicilio(2, "San Martin 102");
        ContactoDomicilio contactoDomicilio3 = new ContactoDomicilio(3, "Espana 698");

        // CREAMOS CINCO TELEFONOS
        ContactoTelefono contactoTelefono1 = new ContactoTelefono(1, "+54", "2616592256");
        ContactoTelefono contactoTelefono2 = new ContactoTelefono(2, "+22", "1659785669");
        ContactoTelefono contactoTelefono3 = new ContactoTelefono(3, "+55", "9651475621");
        ContactoTelefono contactoTelefono4 = new ContactoTelefono(4, "+54", "2617894563");
        ContactoTelefono contactoTelefono5 = new ContactoTelefono(5, "+54", "2614447855");

        // CREAMOS TRES CONTACTOS
        Contacto contacto1 = new Contacto("Fernando", "Bleuss", 2, 1, contactoTipo1);
        Contacto contacto2 = new Contacto("Mauricio", "Campos", 3, 2, contactoTipo2);
        Contacto contacto3 = new Contacto("Sofia", "Vega", 4, 3, contactoTipo2);

        // SUMAMOS DOMICILIOS A ESOS CONTACTOS
        contacto1.addDomicilio(contactoDomicilio1);
        contacto2.addDomicilio(contactoDomicilio2);
        contacto2.addDomicilio(contactoDomicilio3);
        contacto3.addDomicilio(contactoDomicilio3);

        // SUMAMOS NUMEROS A ESOS CONTACTOS
        contacto1.addTelefono(contactoTelefono1);
        contacto1.addTelefono(contactoTelefono2);
        contacto2.addTelefono(contactoTelefono3);
        contacto3.addTelefono(contactoTelefono4);
        contacto3.addTelefono(contactoTelefono5);

        // CREAMOS UN USUARIO
        Usuario user1 = new Usuario("Alberto", "Bleuss", 1, 1, "@bleussa", "Ae#22$t_a");

        // LE SUMAMOS CONTACTOS
        user1.addContacto(contacto1);
        user1.addContacto(contacto2);
        user1.addContacto(contacto3);

        // IMPRIMIMOS TODA LA INFORMACION DEL USUARIO NAVEGANDO ENTRE OBJETOS
        imprimirUsuario(user1);

    }

    public static void imprimirUsuario(Usuario usuario){
        // USUARIO + PERSONA
        System.out.println("\033[0;31m" + "# R E P O R T E   D E   U S U A R I O #####" + "\033[0m");
        System.out.println("# NOMBRE COMPLETO: " + usuario.getNombre() + " " + usuario.getApellido());
        System.out.println("# USUARIO: " + usuario.getUsuario());
        System.out.println("# PASSWORD: " + usuario.getPassword());
        System.out.println("# ID PERSONA: " + usuario.getIdPersona());
        System.out.println("# ID USUARIO: " + usuario.getIdUsuario() + "\n");

        // CONTACTOS
        System.out.println("\033[0;31m" + "# R E P O R T E   D E   C O N T A C T O S #" + "\033[0m");

        for (Contacto contacto : usuario.getContactos()){
            System.out.println("# ID CONTACTO: " + contacto.getIdContacto());
            System.out.println("# NOMBRE COMPLETO: " + contacto.getNombre() + " " + contacto.getApellido());
            System.out.println("# TIPO: " + contacto.getTipo().getDescripcion() + " (ID = " + contacto.getTipo().getIdContactoTipo() + ")");
            for (ContactoDomicilio domicilio : contacto.getDomicilios()){
                System.out.println("# DOMICILIO: " + domicilio.getDescripcion() + " (ID = " + domicilio.getIdContactoDomicilio() + ")");
            }
            for (ContactoTelefono telefono : contacto.getTelefonos()){
                System.out.println("# TELEFONO: " + telefono.getCodigo() + " " + telefono.getNumero() + " (ID = " + telefono.getIdContactoTelefono() + ")");
            }
            System.out.println("-------------------------------------------");
        }

    }
}