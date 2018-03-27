package com.nisum.java8features;

import java.util.stream.Stream;

public class iterateExample {
	
	public static void main(String[] args) {
		
		Stream<Integer> ints=Stream.iterate(1, f->f*2).limit(5);
		ints.forEach(i->System.out.println(i));
		
		
	}

}
