package com.innerclasses.lambda;

interface Student{
	public void printName();
}

public class AnonymousInnerclassWithLambdaExpression4 {
	
	String name= "Outer Class";
	
	public void m1() {
		String named= "Outer Class And M1()"; // local variables referenced from lamba expression area are final, but not outer class instance variables
		Student e= () -> {
			String name= "Lambda";
			System.out.println(name);
			System.out.println(this.name);
			System.out.println(named);
		};
		e.printName();
	}

	public static void main(String[] args) {
		AnonymousInnerclassWithLambdaExpression4 a= new AnonymousInnerclassWithLambdaExpression4();
		a.m1();
	}
}
