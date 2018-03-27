package com.nisum.java8features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Human{
	
	String name;int age;

	public Human(String name, int age) {
		//super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + "]";
	}
	
	
	
}

public class MinAndMax {
	
	public static void main(String[] args) {
		List<Human> humans = new ArrayList<Human>();
		humans.add(new Human("Harish", 35));
		humans.add(new Human("Suresh", 30));
		humans.add(new Human("Naresh", 25));
		humans.add(new Human("Ramesh", 20));
		humans.add(new Human("Girish", 15));
		
		humans.stream().min(Comparator.comparing(Human::getAge)).ifPresent(youngest->System.out.println("Youngest is " + youngest.age + " " + youngest.name));
		// the above equation in other form
		Comparator<Human> comparator=(p1,p2)->Integer.compare(p1.age, p2.age);
		Human youngest=humans.stream().min(comparator).get();
		System.out.println(youngest);
		
		
		//
		humans.stream().max(Comparator.comparing(Human::getAge)).ifPresent(oldest->System.out.println("Oldest is " + oldest.age + " " + oldest.name ));
		// the above equation in other form
		Human oldest=humans.stream().max(comparator).get();
		System.out.println(oldest);
	}

}
