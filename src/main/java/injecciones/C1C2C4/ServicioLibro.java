package injecciones.C1C2C4;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class ServicioLibro {

	private Map<String, String> libroMap;

	public ServicioLibro() {
		libroMap = new HashMap<>();
	}

	public void add(String key, String nombre) {
		libroMap.put(key, nombre);
	}

	public String buscarPorLLave(String key) {
		return libroMap.get(key);
	}

	public String llave(String nombre) {
		for (String key : libroMap.keySet()) {
			if (libroMap.get(key).equals(nombre)) {
				return key;
			}
		}
		return null;
	}

}
