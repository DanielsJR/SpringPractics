package injecciones;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import config.ConfigLibrosTest1;



//S utilizan Mocks
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConfigLibrosTest1.class)
public class ManejadorLibroTest {
	
	@Autowired
	private ManejadorLibro manejadorLibro;
	
	@Autowired
	private ServicioLibroMock servicioLibroMock;
	
    @Test
    public void testAddMessage() {
    	manejadorLibro.addLibro("1", "El Quijote");
        assertEquals("1", servicioLibroMock.getLlave());
        assertEquals("El Quijote", servicioLibroMock.getNombre());
    }

    @Test
    public void testFindMessage() {
    	servicioLibroMock.setLlave("100");
    	servicioLibroMock.setNombre("mock");
        assertEquals("mock",manejadorLibro.findLibro("100"));
    }
}


