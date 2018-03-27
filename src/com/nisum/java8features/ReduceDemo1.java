package com.nisum.java8features;

import java.util.Arrays;
import java.util.List;

public class ReduceDemo1 {
    public static void main(String[] args) {
    	 int[] array = {1,2,3,4,5};
    	 int start = 2;
    	 Arrays.stream(array).reduce((x,y)->x+y).ifPresent(s->System.out.println(s));
    	 
    	 
    	 int sum = Arrays.stream(array).reduce(start,(x,y) -> x+y);
    	 System.out.println(sum);
    	 
    	//int q = Arrays.parallelStream().reduce(start,(x,y) -> x+y , (p,q) -> p*q);
    	
    	
    	List<Integer> list2 = Arrays.asList(2, 3, 4);
        int res = list2.parallelStream().reduce(2, (s1, s2) -> s1 * s2, (p1, q1) -> p1 + q1);
        System.out.println(res);
    }
}  