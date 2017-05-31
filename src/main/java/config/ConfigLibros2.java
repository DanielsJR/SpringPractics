package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import injecciones.ManejadorLibro;
import injecciones.ServicioLibro;

@Configuration
public class ConfigLibros2 {
	
	@Bean
	public ServicioLibro servicioLibro(){
		return new ServicioLibro();
	}
	
	@Bean
	public ManejadorLibro manejadorLibro() {
		return new ManejadorLibro();
	}

}
