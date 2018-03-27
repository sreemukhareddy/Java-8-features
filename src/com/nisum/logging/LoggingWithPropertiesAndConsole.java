package com.nisum.logging;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LoggingWithPropertiesAndConsole {
	
	 static Logger l = Logger.getLogger(LoggingWithPropertiesAndConsole.class.getName());
	 
	  public static void main(String[] args) {          
	      
		  PropertyConfigurator.configure("log4jBoth.properties");
	      
	      l.debug("This is debug message");
	      l.info("This is info message");
	      l.warn("This is warn message");
	      l.fatal("This is fatal message");
	      l.error("This is error message");
	      
	      System.out.println("Your logic executed successfully....");
	      
	  }

}
