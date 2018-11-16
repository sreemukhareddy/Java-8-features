package com.defaultmethods;

interface Static{
	public static void m1() {
		System.out.println("Hello...");
	}
}

public class Static1 implements Static{

	public static void main(String[] args) {
		Static1 static1= new Static1();
		// static1.m1();
		// Static1.m1();
		Static.m1();
	}
}
