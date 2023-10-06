package logging;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Main {

	
private static final Logger log  = LogManager.getLogger(Main.class);
	
	public static void main(String[] args) {

		PropertyConfigurator.configure("log4j.properties");

				log.debug("hello world");
				log.debug("thank you");
				log.info("hi friends");
				log.error("some error");
				log.warn("warning..");
		

	}

}
