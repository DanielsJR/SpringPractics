package injecciones.C3;

import java.util.HashMap;
import java.util.Map;

public class ServicioLibro {

	private Map<String, String> libroMap;

	public ServicioLibro() {
		libroMap = new HashMap<>();
	}

	public void add(String key, String nombre) {
		libroMap.put(key, nombre);
	}

	public String buscarPorNombre(String key) {
		return libroMap.get(key);
	}

	public String buscarPorLLave(String nombre) {
		for (String key : libroMap.keySet()) {
			if (libroMap.get(key).equals(nombre)) {
				return key;
			}
		}
		return null;
	}

}
