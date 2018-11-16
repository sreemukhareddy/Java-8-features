package com.defaultmethods;

interface Student{
	default void printName() {
		System.out.println("Default Employee");
	}
}

public class Default2 implements Student{
	public void printName() {
		System.out.println("Overridden Employee");
	}
	public static void main(String[] args) {
		Default2 default1= new Default2();
		default1.printName();
	}
}
