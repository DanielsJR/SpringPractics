package injecciones;

public class ServicioLibroMock extends ServicioLibro {
	
    private String llave;
    private String nombre;

    
	public String getLlave() {
		return llave;
	}
	public void setLlave(String llave) {
		this.llave = llave;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public void add(String key, String nombre) {
		this.llave=key;
		this.nombre=nombre;
	}
	@Override
	public String buscarPorNombre(String key) {
		return nombre;
	}
	@Override
	public String buscarPorLLave(String nombre) {
		return llave;
	}
	
    

}
