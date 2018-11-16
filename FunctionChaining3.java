package com.function;

import java.util.function.Function;

public class FunctionChaining3 {
	
	public static void main(String[] args) {
		Function<String, String> f1= s -> s.toUpperCase();
		Function<String, String> f2= s-> s.substring(0, 9);
		System.out.println(f1.andThen(f2).apply("nisum hyderabad"));
		
		Function<Integer, Integer> f3= s -> s + s;
		Function<Integer, Integer> f4= s-> s*s*s;
		System.out.println(f3.andThen(f4).apply(5));
		System.out.println(f3.compose(f4).apply(5));
	}

}
