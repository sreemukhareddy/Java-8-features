package com.nisum.java8features;

class StudentNotFoundException extends Exception{
	public StudentNotFoundException() {
		System.out.println("The given student with the id is not found");
	}
}

class Student1{
	
	int id;

	public Student1(int id) {
		//super();
		System.out.println("calling the student with the id =100");
		this.id = id;
	}	
}

class StudentManagement {
	
	public static Student1 getStudent(int id) throws StudentNotFoundException {
		
		if(id==100) {
			return new Student1(id);
		}
		else {
			throw new StudentNotFoundException();
		}
		
	}
	
}

public class CustomisedException {
	
	public static void main(String[] args) throws StudentNotFoundException {
		
		Student1 s1 = StudentManagement.getStudent(11);
		
	}

}
