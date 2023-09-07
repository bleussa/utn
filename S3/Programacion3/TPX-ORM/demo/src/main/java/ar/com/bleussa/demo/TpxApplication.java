package ar.com.bleussa.demo;

import ar.com.bleussa.demo.entidades.*;
import ar.com.bleussa.demo.repositorios.*;
import ar.com.bleussa.demo.util.Estado;
import ar.com.bleussa.demo.util.FormaPago;
import ar.com.bleussa.demo.util.TipoEnvio;
import ar.com.bleussa.demo.util.TipoProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.text.SimpleDateFormat;

@SpringBootApplication
public class TpxApplication {

	@Autowired
	FacturaRepositorio facturaRepo;

	@Autowired
	ClienteRepositorio clienteRepo;

	@Autowired
	DetallePedidoRepositorio detallePedidoRepo;

	@Autowired
	DomicilioRepositorio domicilioRepo;

	@Autowired
	PedidoRepositorio pedidoRepo;

	@Autowired
	ProductoRepositorio productoRepo;

	@Autowired
	RubroRepositorio rubroRepo;

	@Autowired
	UsuarioRepositorio usuarioRepo;

	public static void main(String[] args) {

		SpringApplication.run(TpxApplication.class, args);


	}

	@Bean
	CommandLineRunner init(){
		return args -> {

			// DEFINIMOS UN FORMATO PARA LOS DATES
			SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
			SimpleDateFormat formatoHora = new SimpleDateFormat("dd-MM-yyyy hh:mm");

			try {
				// CLASES FACTURA
				// Crear el primer objeto Factura
				Factura factura1 = new Factura();
				factura1.setFecha(formato.parse("07-09-2023"));
				factura1.setNumero(5658);
				factura1.setFormaPago(FormaPago.TARJETA_CREDITO);
				factura1.setDescuento(0);
				factura1.setTotal(26548);


				// Crear el segundo objeto Factura
				Factura factura2 = new Factura();
				factura2.setFecha(formato.parse("15-10-2023"));
				factura2.setNumero(7892);
				factura2.setFormaPago(FormaPago.EFECTIVO);
				factura2.setDescuento(100);
				factura2.setTotal(15000);

				// Crear el tercer objeto Factura
				Factura factura3 = new Factura();
				factura3.setFecha(formato.parse("25-11-2022"));
				factura3.setNumero(1234);
				factura3.setFormaPago(FormaPago.TARJETA_DEBITO);
				factura3.setDescuento(50);
				factura3.setTotal(7500);

				// CLASES PRODUCTO
				// Crear el primer objeto Producto
				Producto producto1 = new Producto();
				producto1.setTipoProducto(TipoProducto.MANUFACTURADO);
				producto1.setTiempoEstimadoCocina(20);
				producto1.setDenominacion("Lomo 2 Personas");
				producto1.setPrecioVenta(6500.00);
				producto1.setPrecioCompra(3650.00);
				producto1.setStockActual(10);
				producto1.setStockMinimo(2);
				producto1.setUnidadMedida("CM");
				producto1.setFoto("PATH");
				producto1.setReceta("Lorem ipsum");

				// Crear el segundo objeto Producto
				Producto producto2 = new Producto();
				producto2.setTipoProducto(TipoProducto.MANUFACTURADO);
				producto2.setTiempoEstimadoCocina(15);
				producto2.setDenominacion("Pizza Margarita");
				producto2.setPrecioVenta(8000.00);
				producto2.setPrecioCompra(4500.00);
				producto2.setStockActual(20);
				producto2.setStockMinimo(5);
				producto2.setUnidadMedida("CM");
				producto2.setFoto("PATH2");
				producto2.setReceta("Tomate, mozzarella, albahaca");

				// Crear el tercer objeto Producto
				Producto producto3 = new Producto();
				producto3.setTipoProducto(TipoProducto.INSUMO);
				producto3.setTiempoEstimadoCocina(10);
				producto3.setDenominacion("Café Espresso");
				producto3.setPrecioVenta(2500.00);
				producto3.setPrecioCompra(1000.00);
				producto3.setStockActual(50);
				producto3.setStockMinimo(10);
				producto3.setUnidadMedida("ml");
				producto3.setFoto("PATH3");
				producto3.setReceta("Café molido, agua caliente");

				// Crear el cuarto objeto Producto
				Producto producto4 = new Producto();
				producto4.setTipoProducto(TipoProducto.MANUFACTURADO);
				producto4.setTiempoEstimadoCocina(25);
				producto4.setDenominacion("Sándwich de Pollo");
				producto4.setPrecioVenta(5500.00);
				producto4.setPrecioCompra(3200.00);
				producto4.setStockActual(15);
				producto4.setStockMinimo(3);
				producto4.setUnidadMedida("CM");
				producto4.setFoto("PATH4");
				producto4.setReceta("Pollo a la parrilla, lechuga, tomate");

				// CLASES RUBRO
				// Crear el primer objeto Rubro
				Rubro rubro1 = new Rubro();
				rubro1.setDenominacion("Comida");
				rubro1.getProductos().add(producto1);
				rubro1.getProductos().add(producto2);
				rubro1.getProductos().add(producto4);

				// Crear el segundo objeto Rubro
				Rubro rubro2 = new Rubro();
				rubro2.setDenominacion("Cafeteria");
				rubro2.getProductos().add(producto3);

				// CLASES DETALLE PEDIDO
				// Crear el primer objeto DetallePedido
				DetallePedido detallePedido1 = new DetallePedido();
				detallePedido1.setCantidad(4);
				detallePedido1.setProducto(producto1);
				detallePedido1.setSubtotal(126.25);

				// Crear el segundo objeto DetallePedido
				DetallePedido detallePedido2 = new DetallePedido();
				detallePedido2.setCantidad(2);
				detallePedido2.setProducto(producto2);
				detallePedido2.setSubtotal(351.58);

				// Crear el tercer objeto DetallePedido
				DetallePedido detallePedido3 = new DetallePedido();
				detallePedido3.setCantidad(3);
				detallePedido3.setProducto(producto3);
				detallePedido3.setSubtotal(3595.58);

				// Crear el cuarto objeto DetallePedido
				DetallePedido detallePedido4 = new DetallePedido();
				detallePedido4.setCantidad(1);
				detallePedido4.setProducto(producto4);
				detallePedido4.setSubtotal(6589.14);

				// Crear el quinto objeto DetallePedido
				DetallePedido detallePedido5 = new DetallePedido();
				detallePedido5.setCantidad(5);
				detallePedido5.setProducto(producto1);
				detallePedido5.setSubtotal(9588.20);

				// CLASES PEDIDO
				// Crear el primer objeto Pedido
				Pedido pedido1 = new Pedido();
				pedido1.setFecha(formato.parse("02-09-2023"));
				pedido1.setEstado(Estado.ENTREGADO);
				pedido1.setHoraEstimadaEntrega(formatoHora.parse("02-09-2023 14:15"));
				pedido1.setTipoEnvio(TipoEnvio.DELIVERY);
				pedido1.setFactura(factura1);
				pedido1.getDetallePedidos().add(detallePedido1);
				pedido1.getDetallePedidos().add(detallePedido2);

				// Crear el segundo objeto Pedido
				Pedido pedido2 = new Pedido();
				pedido2.setFecha(formato.parse("07-09-2023"));
				pedido2.setEstado(Estado.PREPARADO);
				pedido2.setHoraEstimadaEntrega(formatoHora.parse("07-09-2023 22:15"));
				pedido2.setTipoEnvio(TipoEnvio.RETIRA);
				pedido2.setFactura(factura2);
				pedido2.getDetallePedidos().add(detallePedido3);

				// Crear el segundo objeto Pedido
				Pedido pedido3 = new Pedido();
				pedido3.setFecha(formato.parse("09-09-2023"));
				pedido3.setEstado(Estado.PREPARADO);
				pedido3.setHoraEstimadaEntrega(formatoHora.parse("09-09-2023 10:15"));
				pedido3.setTipoEnvio(TipoEnvio.DELIVERY);
				pedido3.setFactura(factura3);
				pedido3.getDetallePedidos().add(detallePedido4);
				pedido3.getDetallePedidos().add(detallePedido5);

				// CLASES USUARIO
				// Crear el primer objeto Usuario
				Usuario usuario1 = new Usuario();
				usuario1.setNombre("Eduardo");
				usuario1.setPassword("Edux123");
				usuario1.setRol("01-USER");
				usuario1.getPedidos().add(pedido1);

				// Crear el segundo objeto Usuario
				Usuario usuario2 = new Usuario();
				usuario2.setNombre("Ana");
				usuario2.setPassword("Ana456");
				usuario2.setRol("02-ADMIN");
				usuario2.getPedidos().add(pedido2);


				// Crear el tercer objeto Usuario
				Usuario usuario3 = new Usuario();
				usuario3.setNombre("Carlos");
				usuario3.setPassword("Carlos789");
				usuario3.setRol("01-USER");
				usuario3.getPedidos().add(pedido3);

				productoRepo.save(producto1);
				productoRepo.save(producto2);
				productoRepo.save(producto3);
				productoRepo.save(producto4);

				rubroRepo.save(rubro1);
				rubroRepo.save(rubro2);

				usuarioRepo.save(usuario1);
				usuarioRepo.save(usuario2);
				usuarioRepo.save(usuario3);

				pedidoRepo.save(pedido1);
				pedidoRepo.save(pedido2);
				pedidoRepo.save(pedido3);

				facturaRepo.save(factura1);
				facturaRepo.save(factura2);
				facturaRepo.save(factura3);

				detallePedidoRepo.save(detallePedido1);
				detallePedidoRepo.save(detallePedido2);
				detallePedidoRepo.save(detallePedido3);
				detallePedidoRepo.save(detallePedido4);
				detallePedidoRepo.save(detallePedido5);












			} catch (Exception ex){
				System.out.println("[ERROR] " + ex.getMessage());
			}


		};
	}

}
