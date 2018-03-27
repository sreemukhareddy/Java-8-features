package com.nisum.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class Employee{
	String name;
	int salary;
	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public Employee() {
		super();
	}
	
	
}

public class ReduceMethodExample {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Harish", 70000));
		employees.add(new Employee("Manjari", 60000));
		employees.add(new Employee("Reddy", 50000));
		
		int totalSalary = employees.stream()
				.map(e->e.salary)
				.reduce(0,(a,b)->a+b);
		System.out.println(totalSalary);
		
	
		
		Optional<Employee> maxSalary = employees.stream().reduce(
																(Employee e1,Employee e2)->e1.salary>e2.salary?e1:e2
																);
		if(maxSalary.isPresent()){
		System.out.println("getting the employee with the highest salary " +maxSalary.get().name + " " + maxSalary.get().salary);
		}
		
	}
}
