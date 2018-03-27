package com.nisum.java8features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Temployee{
	String name;
	int salary;
	public Temployee() {
		//super();
	}
	public Temployee(String name, int salary) {
		//super();
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
	
	
	
}

public class ComparatorExample {
	
	public static void main(String[] args) {
		List<Temployee> employees = new ArrayList<>();
		employees.add(new Temployee("Harish", 100000));
		employees.add(new Temployee("Suresh", 90000));
		employees.add(new Temployee("Ramesh", 75000));
		employees.add(new Temployee("Girish", 120000));
		employees.add(new Temployee("Mahesh", 40000));
		
		Comparator<Temployee> comparator = (Temployee e1,Temployee e2)->{
			return e1.name.compareTo(e2.name);
		};
		
		Collections.sort(employees,comparator);
		employees.forEach(e->System.out.println(e.toString()));
	}

}
