package com.nisum.java8features;

import org.apache.log4j.Appender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;

public class LoggerExampleWithProperties {
	
	static Logger log = Logger.getLogger(LoggerExampleWithProperties.class.getName());
	
	public static void main(String[] args) {
		
		 log.debug("This is debug message");
		 log.info("This is info message");
		 log.warn("This is warn message");
		 log.fatal("This is fatal message");
		 log.error("This is error message");
		System.out.println("please find the text in log file");
		
	}

}
