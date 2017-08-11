package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import injecciones.C1C2C4.ManejadorLibro;
import injecciones.C1C2C4.ServicioLibro;

@Configuration
public class ConfigLibros2 {

	@Bean
	public ServicioLibro servicioLibro() {
		return new ServicioLibro();
	}

	@Bean
	public ManejadorLibro manejadorLibro() {
		return new ManejadorLibro();
	}

}
