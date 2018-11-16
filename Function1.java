package com.function;

import java.util.function.Function;

public class Function1 {

	public static void main(String[] args) {
		Function<String, Integer> f= S -> S.length();
		System.out.println(f.apply("HELLO"));
	}
}
