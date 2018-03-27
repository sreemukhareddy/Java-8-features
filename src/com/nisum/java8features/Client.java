package com.nisum.java8features;
import org.apache.log4j.Appender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;
 
public class Client {
 
  static Logger l = Logger.getLogger(Client.class.getName());
 
  public static void main(String[] args) {   
 
   Layout l1 = new SimpleLayout();
   Appender a;
   //Appender a = new ConsoleAppender(l1);
   try
   {
   a = new FileAppender(l1,"my.txt", false);
 
   // 3rd parameter is true by default
   // true = Appends the data into my.txt
   // false = delete previous data and re-write
 
   l.addAppender(a);
   }
   catch(Exception e) {}   
 
   l.fatal("This is the error message..");
   System.out.println("Your logic executed successfully....");
  }
}