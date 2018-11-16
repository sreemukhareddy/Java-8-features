package com.predicate;

import java.util.function.Predicate;

public class Predicate1 {

	public static void main(String[] args) {
		Predicate<Integer> p= I -> I>10;
		System.out.println(p.test(12));
		System.out.println(p.test(5));
	}
}
