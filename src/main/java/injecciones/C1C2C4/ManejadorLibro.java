package injecciones.C1C2C4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//bean anotacion
@Component
public class ManejadorLibro {

	private ServicioLibro servicioLibro1;
	private ServicioLibro servicioLibro2;

	// Se inyecta un objeto de la clase indicada
	// @Autowired(required = true) por defecto
	// @Qualifier("libroServicio") Se inyecta un objeto del tipo indicado

	// injeccion anotacion en los setters
	@Autowired
	public void setServicioLibro1(ServicioLibro servicioLibro1) {
		this.servicioLibro1 = servicioLibro1;
	}

	@Autowired
	public void setServicioLibro2(ServicioLibro servicioLibro2) {
		this.servicioLibro2 = servicioLibro2;
	}

	public void addLibro(String key, String nombre) {
		servicioLibro1.add(key, nombre);
	}

	public String findLibro(String key) {
		return servicioLibro2.buscarPorLLave(key);
	}

}
