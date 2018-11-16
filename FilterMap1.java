package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterMap1 {
	
	public static void main(String[] args) {
		ArrayList<Integer> l= new ArrayList<>();
		
		l.add(0);
		l.add(5);
		l.add(10);
		l.add(25);
		l.add(20);
		l.add(15);
		
///////////////////////////////////////////////////////////////////////////////////////////////////		
		List<Integer> l2 = l.stream().filter(i -> i%2==0).collect(Collectors.toList());
		System.out.println(l2);
		
///////////////////////////////////////////////////////////////////////////////////////////////////
		List<Integer> l3= l.stream().map( i -> i*2 ).collect(Collectors.toList());
		System.out.println(l3);
		
///////////////////////////////////////////////////////////////////////////////////////////////////		
		ArrayList<String> s= new ArrayList<>();
		s.add("Hello...");
		s.add("hello");
		s.add("asdf");
		s.add("qwerty");
		s.add("mnbvcx");
		s.add("z");
		s.add("axdfg");
		
		long w= s.stream().filter(st -> st.length() > 5).count();
		System.out.println("No of words whose length is greater than 5 is  " + w);
		
///////////////////////////////////////////////////////////////////////////////////////////////////
		List<Integer> l4= l.stream().sorted().collect(Collectors.toList());
		System.out.println(l);
		System.out.println(l4);
		
		List<Integer> l5= l.stream().sorted((i1, i2) -> -i1.compareTo(i2) ).collect(Collectors.toList());
		System.out.println(l5);
		
///////////////////////////////////////////////////////////////////////////////////////////////////
		Integer min= l.stream().min((i1,i2) -> i1.compareTo(i2)).get();
		System.out.println(min);
		
		Integer max= l.stream().max((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println(max);
		
///////////////////////////////////////////////////////////////////////////////////////////////////
		l.stream().forEach(st -> System.out.println(st));
		
///////////////////////////////////////////////////////////////////////////////////////////////////
	Stream<Integer> si= Stream.of(9,99,999,9999,99999);
	si.forEach(System.out::println);
	
	Double[] d= {10.0,20.1,30.2,40.3,50.4,60.5,70.6,8.7,90.8};
	Stream<Double> sd= Stream.of(d);
	sd.forEach(System.out::println);
		
	}

}
