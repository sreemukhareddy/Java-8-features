package com.nisum.java8features;

import java.util.function.Consumer;

class Animal{
	String name;
	int price;
	
	public Animal(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", price=" + price + "]";
	}
	
	
	
}

public class ConsumerInterfaceExample {
	
	public static void main(String[] args) {
		
		Consumer<Animal> print = animal -> {
			System.out.println(animal.name);
			System.out.println(animal.price);
		};
		
		print.accept(new Animal("Monkey",1000000));
		
	}

}
