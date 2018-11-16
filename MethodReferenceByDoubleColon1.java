package com.doubleOperator;

interface Interf{
	public void m1();
}

public class MethodReferenceByDoubleColon1 {

	public static void m2() {
		System.out.println("Hello...!!");
	}
	
	public void m3() {
		System.out.println("Hello...!!");
	}
	
	public static void main(String[] args) {
		Interf i= MethodReferenceByDoubleColon1::m2;
		i.m1();
		
		MethodReferenceByDoubleColon1 m= new MethodReferenceByDoubleColon1();
		Interf i2= m::m3;
		i2.m1();
	}
}
