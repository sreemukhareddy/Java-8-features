package com.bifunctions;

import java.util.function.BiConsumer;

public class BiConsumer3 {
	
	public static void main(String[] args) {
		BiConsumer<String, String> b= (s1, s2) -> System.out.println(s1+ " " + s2);
		b.accept("Hello", "Nisum");
		b.accept("Dell", "Laptop");
	}

}
