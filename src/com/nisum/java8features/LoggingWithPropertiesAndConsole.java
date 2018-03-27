package com.nisum.java8features;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LoggingWithPropertiesAndConsole {
	
	 static Logger l = Logger.getLogger(Client.class.getName());
	 
	  public static void main(String[] args) {          
	      
		  PropertyConfigurator.configure("log4j-Both.properties");
	      
	      l.debug("This is debug message");
	      l.info("This is info message");
	      l.warn("This is warn message");
	      l.fatal("This is fatal message");
	      l.error("This is error message");
	      
	      System.out.println("Your logic executed successfully....");
	      
	  }

}
