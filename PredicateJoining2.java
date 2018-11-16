package com.predicate;

import java.util.function.Predicate;

public class PredicateJoining2 {
	
	public static void main(String[] args) {
		Predicate<Integer> p1= I -> I > 10;
		Predicate<Integer> p2= I -> I%2 == 0;
		Integer[] arr= {0,5,10,15,20,25};
		System.out.println("Checking for negate Condition...");
		m1(p1.negate(),arr);
		System.out.println("CHecking for AND Condition...");
		m1(p1.and(p2),arr);
		System.out.println("Checking for OR condition...");
		m1(p1.or(p2), arr);
		System.out.println("".length());
	}
	public static void m1(Predicate<Integer> p, Integer[] arr) {
		for(Integer i : arr) {
			System.out.println(i + " " + p.test(i));
		}
	}

}
