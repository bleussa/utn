package bleussa;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setDniPersona(44247063);
        cliente.setNombrePersona("Alberto");
        cliente.setApellidoPersona("Bleuss");
        cliente.setNumeroCliente(1536);
        cliente.setDireccionCliente("Bandera de los Andes 3508");
        cliente.setTelefonoCliente("2616640600");

        Vendedor vendedor = new Vendedor();
        vendedor.setDniPersona(44247063);
        vendedor.setNombrePersona("Alberto");
        vendedor.setApellidoPersona("Bleuss");
        vendedor.setNumeroVendedor(15);

        Pedido pedido = new Pedido();
        cliente.setPedido(pedido);
        vendedor.setPedido(pedido);
        pedido.setNumeroPedido(136);
        pedido.setMonto(1597);

        pedido.setEstado(EstadoPedido.EN_PROCESO);
        pedido.setEntrega(new Entrega());
        pedido.getEntrega().setNumeroEntrega(154);
        pedido.getEntrega().setDescripcion("2 Milanesas");
        pedido.getEntrega().setPedido(pedido);

        pedido.getPago().setNumeroPago(468);
        pedido.getPago().setDescripcion("Pago Visa");
        pedido.getPago().setEstado(EstadoPedido.CERRADO);
        pedido.getPago().setMontoTotal(1600);

        pedido.getDocumentoVenta().setNumeroDocumentoVenta(599);
        pedido.getDocumentoVenta().setMonto(1600);
        pedido.getDocumentoVenta().setEstado(EstadoPedido.ABIERTO);

        pedido.getDetallesPedidos().add(new DetallePedido());
        pedido.getDetallesPedidos().get(0).setPedido(pedido);
        pedido.getDetallesPedidos().get(0).setCantidad(2);
        pedido.getDetallesPedidos().get(0).setPrecioVenta(1600);

        Producto producto = new Producto();
        producto.setNumeroProducto(195);
        producto.setMarca("Casero");
        producto.setPrecio(1600);
        producto.setStock(2);
        producto.getDetallesPedidos().add(pedido.getDetallesPedidos().get(0));

        // VARIABLE ALEATORIA DISCRETA
        //









        /*
        //Iniciamos con cliente
        Cliente cliente = new Cliente();
        //Datos Persona
        cliente.setDniPersona(12345678);
        cliente.setNombrePersona("Gonzalo");
        cliente.setApellidoPersona("Vega");
        // Datos Cliente
        cliente.setNumeroCliente(01);
        cliente.setDireccionCliente("Avenida Siempre Viva 123");
        cliente.setTelefonoCliente("2617894563");
        // Pedido
        cliente.setPedido(new Pedido());
        cliente.getPedido().setNumeroPedido(10);
        cliente.getPedido().setMonto(500.36);
        cliente.getPedido().setEstado(EstadoPedido.EN_PROCESO);
        // DocumentoVenta
        cliente.getPedido().getDocumentoVenta().setNumeroDocumentoVenta(456);
        //Se le suma IVA
        cliente.getPedido().getDocumentoVenta().setMonto(cliente.getPedido().getMonto() * 1.21);
        cliente.getPedido().getDocumentoVenta().setEstado(EstadoPedido.CERRADO);
        // Pago
        cliente.getPedido().getPago().setNumeroPago(963);
        cliente.getPedido().getPago().setDescripcion("Se Paga con tarjeta de Debito");
        cliente.getPedido().getPago().setEstado(EstadoPedido.CERRADO);
        cliente.getPedido().getPago().setMontoTotal(cliente.getPedido().getDocumentoVenta().getMonto() + 5);
        //Entrega
        cliente.getPedido().setEntrega(new Entrega());
        cliente.getPedido().getEntrega().setNumeroEntrega(852);
        cliente.getPedido().getEntrega().setDescripcion("Entrega en Domicilio");
        //Aplicando Bidireccionalidad Entrega -> Pedido
        cliente.getPedido().getEntrega().setPedido(cliente.getPedido());
        //Resoliviendo Muchos a Muchos Pedido-Producto
        //DetallePedido
        cliente.getPedido().getDetallesPedidos().add(new DetallePedido());
        cliente.getPedido().getDetallesPedidos().get(0).setCantidad(1);
        cliente.getPedido().getDetallesPedidos().get(0).setPrecioVenta(cliente.getPedido().getPago().getMontoTotal());
        //Producto
        cliente.getPedido().getDetallesPedidos().get(0).setProducto(new Producto());
        cliente.getPedido().getDetallesPedidos().get(0).getProducto().setNumeroProducto(7441);
        cliente.getPedido().getDetallesPedidos().get(0).getProducto().setMarca("Adidas");
        cliente.getPedido().getDetallesPedidos().get(0).getProducto().setPrecio(450);
        cliente.getPedido().getDetallesPedidos().get(0).getProducto().setStock(5000);
        //Aplicando Bidireccionalidad Producto ->DetallePedido
        cliente.getPedido().getDetallesPedidos().get(0).getProducto().getDetallesPedidos().add(cliente.getPedido().getDetallesPedidos().get(0));
        //Como se corta vamos a cargar Vendedor por separado
        Vendedor vendedor = new Vendedor();
        vendedor.setNumeroVendedor(753);
        //Persona
        vendedor.setNombrePersona("Adam");
        vendedor.setApellidoPersona("Smith");
        vendedor.setDniPersona(40960185);
        //Seteamos al mismo pedido desarrollado por cliente
        vendedor.setPedido(cliente.getPedido());

        //Como se corta vamos a cargar Delivery
        Delivery delivery = new Delivery();
        delivery.setPrecio(67.20);
        delivery.setEstado(EstadoPedido.EN_PROCESO);
        //Repartidor
        delivery.setRepartidor(new Repartidor());
        delivery.getRepartidor().setNumeroRepartidor(101);
        //Persona
        delivery.getRepartidor().setNombrePersona("Alberto");
        delivery.getRepartidor().setApellidoPersona("Bleuss");
        delivery.getRepartidor().setDniPersona(753951456);
        //Aplicando Bidireccionalidad Repartidor -> Delivery
        delivery.getRepartidor().getDeliverys().add(delivery);

        System.out.println("Todo Cargado");
        */
    }
}