package com.nisum.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Student{
	String name;
	String marks;
	public Student(String name, String marks) {
		
		this.name = name;
		this.marks = marks;
	}
	public Student() {
		
	}	
	
	public boolean equals(final Object obj) {
	      if (obj == null) {
	         return false;
	      }
	      final Student student = (Student) obj;
	      if (this == student) {
	         return true;
	      } else {
	         return (this.name.equalsIgnoreCase(student.name) && this.marks == student.marks);
	      }
	    }
	    @Override
	    public int hashCode() {
	      int hashno = 7;
	      hashno = 13 * hashno + (name == null ? 0 : name.hashCode());
	      return hashno;
	    }
}

public class ConcatListDemo {
	
	public static void main(String[] args) {
		List<Student> students1 = new ArrayList<Student>();
		students1.add(new Student("Harish","100"));
		students1.add(new Student("harish","90"));
		students1.add(new Student("Manjari","100"));
		students1.add(new Student("manjari","90"));
		students1.add(new Student("sree mukha","100"));
		
		List<Student> students2 = new ArrayList<Student>();
		students2.add(new Student("Harish","100"));
		students2.add(new Student("harish","100"));
		students2.add(new Student("Manjari","100"));
		students2.add(new Student("manjari","100"));
		students2.add(new Student("sree mukha","100"));
		
		List<Student> streamOfStudents1 = Stream.concat(students1.stream(), students2.stream()).collect(Collectors.toList());
		streamOfStudents1.forEach(s->System.out.println("Student Name " + s.name + " Student Marks " + s.marks));
		
		System.out.println("-------------------------------------------------------------------------------------------------");
		
		List<Student> streamOfStudents2 = Stream.concat(students1.stream(), students2.stream()).distinct().collect(Collectors.toList());
		streamOfStudents2.forEach(s->System.out.println("Student Name " + s.name + " Student Marks " + s.marks));
	}

}
