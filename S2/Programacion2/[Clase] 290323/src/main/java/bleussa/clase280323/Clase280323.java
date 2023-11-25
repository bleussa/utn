package bleussa.clase280323;

public class Clase280323 {

    public static void main(String[] args) {
        
        Factura f1 = new Factura();
        f1.setFecha(new Fecha());
        f1.getFecha().setDia(28);
        f1.getFecha().setMes(3);
        f1.getFecha().setAnio(2023);
        f1.setTipo('A');
        f1.setNumero(155);
        
        f1.setCliente(new Cliente());
        f1.getCliente().setCodigo(15568);
        f1.getCliente().setRazonSocial("Monotributista");
        
        f1.addProducto(new Producto(25, "Agua", 25));
        f1.addProducto(new Producto(35, "Agua Gas", 75));
        f1.addProducto(new Producto(14, "Gaseosa", 150));
    
        imprimirFactura(f1);
        
    }
    
    public static void imprimirFactura(Factura f){
        System.out.println("Factura");
        System.out.println("Fecha: " + f.getFecha().toString());
        System.out.println("Tipo " + f.getTipo());
        System.out.println("Numero " + f.getNumero());
        System.out.println("Cliente " + f.getCliente().toString());
        System.out.println("Productos" + f.getProductos().toString());
        System.out.println("");
    }
}
