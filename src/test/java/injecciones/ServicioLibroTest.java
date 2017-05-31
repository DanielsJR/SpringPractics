package injecciones;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ServicioLibroTest {
	
	 private ServicioLibro servicioLibro ;
	    
	    @Before
	    public void before(){
	        this.servicioLibro= new ServicioLibro();
	    }

	    @Test
	    public void testAddLibro() {
	    	servicioLibro.add("1", "uno");
	        assertEquals("uno", servicioLibro.buscarPorNombre("1"));
	    }

	    @Test
	    public void testbuscarPorLLave() {
	    	servicioLibro.add("2", "dos");
	    	servicioLibro.add("3", "tres");
	    	servicioLibro.add("4", "cuatro");
	        assertEquals("2", servicioLibro.buscarPorLLave("dos"));
	        assertEquals("4", servicioLibro.buscarPorLLave("cuatro"));
	    }

}
