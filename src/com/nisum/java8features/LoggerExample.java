package com.nisum.java8features;

import org.apache.log4j.Appender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;

public class LoggerExample {
	
	static Logger log = Logger.getLogger(LoggerExample.class.getName());
	
	public static void main(String[] args) {
		
		Layout layout = new SimpleLayout();
		Appender a;
		
		try {
			a=new FileAppender(layout,"logging.txt",false);
			log.addAppender(a);
		}
		catch(Exception e) {
			log.fatal("This is the error message");
			System.out.println("please find the text in log file");
		}
		log.fatal("This is the error message");
		System.out.println("please find the text in log file");
		
	}

}
