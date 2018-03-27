package com.nisum.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Person{
	String name;
	int salary;
	public Person(String name, int salary) {
		//super();
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", salary=" + salary + "]";
	}
	
	
}

public class PredicateInterfaceExample {
	
	public static void main(String[] args) {
		
		Predicate<Integer> checkForPositive = n -> n>0;
		
		System.out.println(checkForPositive.test(12));
		System.out.println(checkForPositive.test(-12));
		
		List<Person> persons = new ArrayList<Person>();
		
		persons.add(new Person("Harish",10000));
		persons.add(new Person("Girish",100000));
		persons.add(new Person("Suresh",1000));
		persons.add(new Person("Mahesh",20000));
		persons.add(new Person("mukhi",90000));
		
		Predicate<Person> nameCheck = person -> person.name.length() > 5;
		Predicate<Person> salaryCheck = person -> person.salary % 5 == 0;
		
		List<Person > p = persons.stream().filter(nameCheck.and(salaryCheck)).collect(Collectors.toList());
		p.forEach(System.out::println);
		
		// bipredicate 
		
		BiPredicate<Person, Person> p2 = (q1,q2)->q1.name.equals(q2.name);
		System.out.println(p2.test(new Person("monkey", 12000),new Person("monkey",7899)));
		
	}

}
