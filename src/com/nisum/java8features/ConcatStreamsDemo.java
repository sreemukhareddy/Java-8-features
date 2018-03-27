package com.nisum.java8features;

import java.util.stream.Stream;

public class ConcatStreamsDemo {
	
	public static void main(String[] args) {
		Stream<String> s1= Stream.of("AA","BB","CC");
		Stream<String> s2= Stream.of("aa","bb","cc","AA","CC");
		// concating the two streams using the concat method which returns a Stream
		Stream<String> streamConcat1=Stream.concat(s1, s2);
		streamConcat1.forEach(s->System.out.println(s));
		
		System.out.println("-------------------------------------------------------------------");
		
		Stream<String> s3= Stream.of("AA","BB","CC");
		Stream<String> s4= Stream.of("aa","bb","cc","AA","CC");
		// concating the two streams using the concat method which returns a Stream
		Stream<String> streamConcat2=Stream.concat(s3, s4).distinct();
		streamConcat2.forEach(s->System.out.println(s));
	}

}
