package injecciones;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import injecciones.C3.ManejadorLibro;

public class Config3Main {
	Logger logger = LogManager.getLogger(this.getClass().getName());

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"META-INF/ConfLibros3.xml"});
		
		ManejadorLibro ml = context.getBean(ManejadorLibro.class);
		ml.addLibro("0001", "El Quijote");
		System.out.println(ml.findLibro("0001") + " En hora buena!!!)");
		((AbstractApplicationContext) context).close();


	}

}
