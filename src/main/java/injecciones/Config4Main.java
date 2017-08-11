package injecciones;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import config.PackageNames;
import injecciones.C1C2C4.ManejadorLibro;

public class Config4Main {
	Logger logger = LogManager.getLogger(this.getClass().getName());

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan(PackageNames.INJECCIONES124);
		context.refresh();

		ManejadorLibro ml = context.getBean(ManejadorLibro.class);
		ml.addLibro("0001", "El Quijote");
		System.out.println(ml.findLibro("0001") + " En hora buena!!!)");
		((AbstractApplicationContext) context).close();

	}
}