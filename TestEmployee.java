package com.lambda.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee{
	int eNo;
	String eName;
	
	public Employee(int eNo, String eName) {
		this.eNo= eNo;
		this.eName= eName;
	}
	
	@Override
	public String toString() {
		return this.eNo+ "   " + this.eName; 
	}
}

public class TestEmployee {
	
	public static void main(String[] args) {
		List<Employee> employees= new ArrayList<Employee>();
		employees.add(new Employee(10, "Ten"));
		employees.add(new Employee(0, "Zero"));
		employees.add(new Employee(5, "Five"));
		employees.add(new Employee(15, "Fifteen"));
		System.out.println("Before sorting " );
		System.out.println(employees);
		
		Collections.sort(employees, 
				(e1, e2) -> (e1.eNo > e2.eNo) ? -1 : (e1.eNo < e2.eNo) ? +1 : 0
				);
		System.out.println(employees);
	}
}
