package com.doubleOperator;

interface Inter{
	public Sample get();
}

class Sample {
	public Sample() {
		System.out.println("Hello...!!!");
	}
}

public class ConstructorReferenceByDoubleColon2 {
	
	public static void main(String[] args) {
		Inter i= Sample::new;
		Sample s= i.get();
	}

}
