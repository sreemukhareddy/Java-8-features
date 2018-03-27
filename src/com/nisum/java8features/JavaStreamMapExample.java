package com.nisum.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamMapExample {

	
	public static void main(String[] args) {

		List<Emp> allEmpList = getAllEmps();
		System.out.println(allEmpList);
		
		List<Emp> empForHR = new ArrayList<>();
		for(Emp e : allEmpList){
			Emp temp = new Emp(e.getId(),e.getName(),e.getSalary(),e.getDesignation());
			temp.setSalary(0);
			empForHR.add(temp);
		}
		System.out.println(empForHR);
		
		empForHR = allEmpList.stream().map(e -> {
			e.setSalary(0L);
			return e;
		}).collect(Collectors.toList());
		System.out.println(empForHR);
	}

	private static List<Emp> getAllEmps() {
		List<Emp> el = new ArrayList<>();
		Emp e1 = new Emp(1, "Pankaj", 100L, "SE");
		el.add(e1);
		Emp e2 = new Emp(2, "David", 200L, "QE");
		el.add(e2);
		
		Emp e3 = new Emp(3, "Lisa", 300L, "CEO");
		el.add(e3);
		return el;
	}

}

