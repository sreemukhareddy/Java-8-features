package com.innerclasses.lambda;

interface Employee{
	public void printName();
}

public class AnonymousInnerclassWithLambdaExpression3 {
	
	String name= "Outer Class";
	
	public void m1() {
		String named= "Outer Class And M1()";
		Employee e= new Employee() {
			
			String name= "Inner Class";
			public void printName() {
				System.out.println(name);
				System.out.println(this.name);
				System.out.println(named);
				System.out.println(AnonymousInnerclassWithLambdaExpression3.this.name);
			}
		};
		
		e.printName();
	}

	public static void main(String[] args) {
		AnonymousInnerclassWithLambdaExpression3 a= new AnonymousInnerclassWithLambdaExpression3();
		a.m1();
	}
}
