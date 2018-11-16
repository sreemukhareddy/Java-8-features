package com.defaultmethods;

interface Right{
	default void m1() {
		System.out.println("I'm from Right");
	}
}

interface Left{
	default void m1() {
		System.out.println("I'm from Left");
	}
}

public class Default3 implements Right, Left{
	public void m1() {
		System.out.println("My own implementation...");
		Right.super.m1();
		Left.super.m1();
	}
}
