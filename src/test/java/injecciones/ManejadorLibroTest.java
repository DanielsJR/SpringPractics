package injecciones;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import config.ConfigLibrosTest1;
import injecciones.C1C2C4.ManejadorLibro;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConfigLibrosTest1.class) // S utilizan Mocks
public class ManejadorLibroTest {

	@Autowired
	private ManejadorLibro manejadorLibro;

	@Autowired
	private ServicioLibroMock servicioLibroMock;

	@Test
	public void testAddLibro() {
		manejadorLibro.addLibro("1", "El Quijote");
		assertEquals("1", servicioLibroMock.getLlave());
		assertEquals("El Quijote", servicioLibroMock.getNombre());
	}

	@Test
	public void testFindLibro() {
		assertEquals("El Quijote", manejadorLibro.findLibro("1"));
		servicioLibroMock.setLlave("2");
		servicioLibroMock.setNombre("El QuijoteMock");
		assertEquals("El QuijoteMock", manejadorLibro.findLibro("2"));
		
	}
}
