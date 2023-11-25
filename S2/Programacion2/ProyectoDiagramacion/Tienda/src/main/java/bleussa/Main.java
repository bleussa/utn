package bleussa;

public class Main {
    public static void main(String[] args) {

        // Creamos una factura
        Factura factura1 = new Factura(new Empleado(), new Cliente(), 19754, "15-04-2023", 13590);

        factura1.getEmpleado().setNombre("Fernando");
        factura1.getEmpleado().setApellido("Krueger");
        factura1.getEmpleado().setFechaIngreso("12-01-2019");
        factura1.getEmpleado().setNroLegajo(326);
        factura1.getEmpleado().setCuit(20246293695L);
        factura1.getEmpleado().setDni(24629369);

        factura1.getCliente().setNombre("Esteban");
        factura1.getCliente().setApellido("Fritz");
        factura1.getCliente().setCuit(25326587892L);
        factura1.getCliente().setDni(32658789);
        factura1.getCliente().setCredit(new TarjetaDeCredito());
        factura1.getCliente().getCredit().setFechaIngreso("21-03-2023");
        factura1.getCliente().getCredit().setLimite(97590);

        imprimirFactura(factura1);
    }

    public static void imprimirFactura(Factura factura){
        System.out.println("##### FACTURA " + factura.getNroFactura() + " #####");
        System.out.println("FECHA: " + factura.getFecha());
        System.out.println("MONTO: " + factura.getMonto());
        System.out.println("DATOS DEL CLIENTE:");
        System.out.println("    NOMBRE COMPLETO: " + factura.getCliente().getNombre() + " " + factura.getCliente().getApellido());
        System.out.println("    CUIT: " + factura.getCliente().getCuit());
        System.out.println("    DNI: " + factura.getCliente().getDni());
        System.out.println("    MEDIO DE PAGO: TARJETA DE CREDITO, INGRESO: " + factura.getCliente().getCredit().getFechaIngreso() + ", LIMITE: " + factura.getCliente().getCredit().getLimite());
        System.out.println("DATOS DEL EMPLEADO:");
        System.out.println("    NOMBRE COMPLETO: " + factura.getEmpleado().getNombre() + " " + factura.getEmpleado().getApellido());
        System.out.println("    CUIT: " + factura.getEmpleado().getCuit());
        System.out.println("    DNI: " + factura.getEmpleado().getDni());
        System.out.println("    LEGAJO: " + factura.getEmpleado().getNroLegajo());
        System.out.println("    FECHA INGRESO: " + factura.getEmpleado().getFechaIngreso());

    }
}