package injecciones.C3;

public class ManejadorLibro {

	private ServicioLibro servicioLibro1;
	private ServicioLibro servicioLibro2;

	public void setServicioLibro1(ServicioLibro servicioLibro1) {
		this.servicioLibro1 = servicioLibro1;
	}

	public void setServicioLibro2(ServicioLibro servicioLibro2) {
		this.servicioLibro2 = servicioLibro2;
	}

	public void addLibro(String key, String nombre) {
		servicioLibro1.add(key, nombre);
	}

	public String findLibro(String key) {
		return servicioLibro2.buscarPorNombre(key);
	}

}
