package com.lambda.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MyComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		
		return (o1 > o2) ? -1 : (o1 < o2) ? +1 : 0; 
		
	}
	
}

public class TestList {

	public static void main(String[] args) {
		ArrayList<Integer> list1= new ArrayList<Integer>();
		list1.add(5);
		list1.add(0);
		list1.add(10);
		list1.add(20);
		list1.add(15);
		System.out.println("List -> " + list1);
		
		System.out.println("Default sorting order"); 
		Collections.sort(list1);
		System.out.println(list1);
		
		System.out.println("sorting with Comparator");
		ArrayList<Integer> list2= new ArrayList<Integer>();
		list2.add(5);
		list2.add(0);
		list2.add(10);
		list2.add(20);
		list2.add(15);
		Collections.sort(list2, new MyComparator());
		System.out.println("After sorting with my own comparator " + list2 );
		
		Comparator<Integer> comparator= (Integer i1, Integer i2) -> {
			return (i1 > i2) ? -1 : (i1 < i2) ? +1 : 0;
		};
		
		ArrayList<Integer> list3= new ArrayList<Integer>();
		list3.add(5);
		list3.add(0);
		list3.add(10);
		list3.add(20);
		list3.add(15);
		
		Collections.sort(list3, comparator);
		Collections.sort(list3, (i1,i2) -> (i1 > i2) ? -1 : (i1 < i2) ? +1 : 0);
		System.out.println(list3);

	}
}
