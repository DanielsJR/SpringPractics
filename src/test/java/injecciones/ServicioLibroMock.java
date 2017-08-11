package injecciones;

import injecciones.C1C2C4.ServicioLibro;

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
	public String buscarPorLLave(String key) {
		return nombre;
	}
	@Override
	public String llave(String nombre) {
		return llave;
	}
	
    

}
