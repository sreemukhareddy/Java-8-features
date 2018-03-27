package com.nisum.java8features;

interface say {
	public void sayyable(String name);
}

public class ReferenceToaStaticMethod {
	
	public static void saySomeThing(String name) {
		System.out.println("hello " + name);
	}
	
	public static void main(String[] args) {
		
		say s = name->saySomeThing("Harish");
		s.sayyable("sree");
		
	}

}
