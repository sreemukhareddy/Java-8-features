package com.defaultmethods;

interface Employee{
	default void printName() {
		System.out.println("Default Employee");
	}
}

public class Default1 implements Employee{
	public static void main(String[] args) {
		Default1 default1= new Default1();
		default1.printName();
	}
}
