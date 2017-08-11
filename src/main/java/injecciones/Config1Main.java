package injecciones;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import config.ConfigLibros1;
import injecciones.C1C2C4.ManejadorLibro;

public class Config1Main {

	Logger logger = LogManager.getLogger(this.getClass().getName());

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigLibros1.class);
		
		ManejadorLibro ml = context.getBean(ManejadorLibro.class);
		ml.addLibro("0001", "El Quijote");
		System.out.println(ml.findLibro("0001") + " En hora buena!!!)");
		((AbstractApplicationContext) context).close();

	}

}
