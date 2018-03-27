package com.nisum.java8features;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

class DAOException extends Exception{
	
	/*public DAOException(String message) {
		super(message);
	}*/
	
	public DAOException(String message,Throwable throwable) {
		super(message, throwable);
	}
	
	
}

class StudentException extends Exception{
	
	public StudentException(String message) {
		super(message);
	}
	
	public StudentException(String message , Throwable throwable) {
		super(message, throwable);
	}
}

class DataBaseUtils{
	public static void executeQuery(String sql) throws SQLException{
		throw new SQLException("Syntax not correct");
	}
}

class StudentDAO{
	
	 public void list() throws DAOException {
	        try {
	 
	            DataBaseUtils.executeQuery("SELECT");
	 
	        } catch (SQLException ex) {
	            throw new DAOException("Error querying students from database", ex);
	        }
	    }
}

 class StudentManager {
	 
    private StudentDAO dao;
 
    public StudentManager(StudentDAO dao) {
        this.dao = dao;
    }
 
    public void findStudents(String keyword) throws StudentException {
        try {
            dao.list();
        } catch (DAOException ex) {
            throw new StudentException("Error finding students", ex);
        }
    }
}


public class ExceptionChainExample {
	
	//private static final Logger LOGGER = Logger.getLogger("ExceptionChainExample");
	//Logger logger = Logger.getLogger(ExceptionChainExample.class.getName());
	private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	public static void main(String[] args) {
		
		LOGGER.log(Level.INFO, "This is my first log");
		
		StudentManager manager=new StudentManager(new StudentDAO());
		
		try {
			manager.findStudents("tom");
		}
		catch (StudentException ex) {
			ex.printStackTrace();
		}
		
		
		
	}
}
