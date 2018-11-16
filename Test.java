package com.lambda.examples3;

public class Test {

	public static void main(String[] args) {
		Interf1 i1= s -> s.length();
		System.out.println(i1.getLength("Hello"));
	}
}
