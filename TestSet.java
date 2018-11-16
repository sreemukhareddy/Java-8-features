package com.lambda.collections;

import java.util.Set;
import java.util.TreeSet;

public class TestSet {
	
	public static void main(String[] args) {
		Set<Integer> set1= new TreeSet<Integer>();
		set1.add(0);
		set1.add(10);
		set1.add(5);
		set1.add(20);
		set1.add(15);
		System.out.println(set1);
		
		Set<Integer> set2= new TreeSet<Integer>( (i1, i2)-> (i1>i2) ? -1 : (i1<i2) ? +1 : 0);
		set2.add(0);
		set2.add(10);
		set2.add(5);
		set2.add(20);
		set2.add(15);
		System.out.println(set2);
	}

}


