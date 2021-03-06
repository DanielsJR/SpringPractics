package injecciones;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import injecciones.C1C2C4.ServicioLibro;

//test normal sin inyeccion
public class ServicioLibroTest {

	private ServicioLibro servicioLibro;

	@Before
	public void before() {
		this.servicioLibro = new ServicioLibro();
	}

	@Test
	public void testAddLibro() {
		servicioLibro.add("1", "El Quijote");
		assertEquals("El Quijote", servicioLibro.buscarPorLLave("1"));
	}

	@Test
	public void testbuscarPorLLave() {
		servicioLibro.add("2", "El QuijoteII");
		servicioLibro.add("3", "El QuijoteIII");
		servicioLibro.add("4", "El QuijoteIV");
		assertEquals("El QuijoteII", servicioLibro.buscarPorLLave("2"));
		assertEquals("El QuijoteIV", servicioLibro.buscarPorLLave("4"));
		assertEquals("4", servicioLibro.llave("El QuijoteIV"));
		assertEquals("3", servicioLibro.llave("El QuijoteIII"));
	}

}
