package ar.com.bleussa.demo;

import ar.com.bleussa.demo.entidades.Factura;
import ar.com.bleussa.demo.repositorios.FacturaRepositorio;
import ar.com.bleussa.demo.util.FormaPago;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TpxApplication {

	@Autowired
	FacturaRepositorio facturaRepo;

	public static void main(String[] args) {

		SpringApplication.run(TpxApplication.class, args);


	}

	@Bean
	CommandLineRunner init(FacturaRepositorio facturaRepo){
		return args -> {
			System.out.println("[HARDCODE] Creamos una Factura");


		};
	}

}
