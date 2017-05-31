package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import injecciones.ServicioLibro;
import injecciones.ServicioLibroMock;

@Configuration
@ComponentScan(basePackages = { PackageNamesTest.INJECCIONES })
public class ConfigLibrosTest1 {

	@Bean
	public ServicioLibro servicioLibro() {
		return new ServicioLibroMock();
	}

}
