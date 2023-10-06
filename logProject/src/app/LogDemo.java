package app;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LogDemo {
	
	
	 private static final Logger logger = LogManager.getLogger(LogDemo.class);
	 public static void main(String[] args) {
	 
	  PropertyConfigurator.configure("log4j.properties");
	  logger.info("Hello world");
	  logger.info("we are in logger info mode");
	 
	 }
}
