package com.lamba.examples1;

@FunctionalInterface
public interface Interf {
	
	public void m1();
	
	default void m2() {
		
	}
	public static void m3() {
		
	}
}
