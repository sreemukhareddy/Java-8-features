package com.lamba.examples1;

public class LambdaTest1 {

	public static void main(String[] args) {
		Interf i= () -> System.out.println("I'm from the interface interf which has m1() method");
		i.m1();
	}
}
