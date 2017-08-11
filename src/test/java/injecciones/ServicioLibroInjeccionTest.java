package injecciones;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import config.ConfigLibros1;
import injecciones.C1C2C4.ServicioLibro;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConfigLibros1.class)
public class ServicioLibroInjeccionTest {
	
	@Autowired
	private ServicioLibro servicioLibro ;
    

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
