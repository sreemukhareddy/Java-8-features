package com.nisum.java8features;

import java.util.function.Function;

public class FunctionInterfaceTest {
	
	public static void main(String[] args) {
		
		Function<String, Integer> function = name -> name.length();
		
		System.out.println("Hello world's length is " + function.apply("Hello World"));
		
	}

}
