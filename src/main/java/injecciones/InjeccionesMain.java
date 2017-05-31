package injecciones;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import config.ConfigLibros1;
import config.ConfigLibros2;

public class InjeccionesMain {
	Logger logger = LogManager.getLogger(this.getClass().getName());

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigLibros1.class);
		//ApplicationContext context = new AnnotationConfigApplicationContext(ConfigLibros2.class);
		//ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"contextoAplicacion.xml"});
		
	    ManejadorLibro ml = context.getBean(ManejadorLibro.class);
		
		//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ConfLibros3.xml");
		//ManejadorLibro ml = (ManejadorLibro) context.getBean("manejadorLibro");
				
		ml.addLibro("0001","El Quijote");
		System.out.println(ml.findLibro("0001") + " En hora buena!!!)");
		((AbstractApplicationContext) context).close();
		
	}

}
