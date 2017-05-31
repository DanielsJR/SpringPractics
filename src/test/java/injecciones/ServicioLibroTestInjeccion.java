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
public class ServicioLibroTestInjeccion {
	
	private ServicioLibro servicioLibro ;
    
	@Autowired
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
