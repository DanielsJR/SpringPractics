package injecciones;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import config.ConfigLibros1;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConfigLibros1.class)
public class ManejadorLibroIntegracion {
	
	 @Autowired
	    private ManejadorLibro manejadorLibro;

	    @Test
	    public void testAddFindLibro() {
	    	manejadorLibro.addLibro("1", "El Quijote I");
	    	manejadorLibro.addLibro("2", "El Quijote II");
	    	manejadorLibro.addLibro("3", "El Quijote III");
	        assertEquals("El Quijote I", manejadorLibro.findLibro("1"));
	        assertEquals("El Quijote III", manejadorLibro.findLibro("3"));
	    }

}
