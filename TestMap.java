package com.lambda.collections;

import java.util.Map;
import java.util.TreeMap;

public class TestMap {
	
	public static void main(String[] args) {
		Map<Integer, String> map1= new TreeMap<Integer, String>();
		map1.put(5, "Five");
		map1.put(10, "Ten");
		map1.put(0, "Zero");
		map1.put(20, "Twenty");
		map1.put(15, "Fivteen");
		System.out.println(map1);
		
		Map<Integer, String> map2= new TreeMap<Integer, String>( (i1, i2)-> (i1 > i2) ? -1 : (i1 < i2) ? +1 : 0	);
		map2.put(5, "Five");
		map2.put(10, "Ten");
		map2.put(0, "Zero");
		map2.put(20, "Twenty");
		map2.put(15, "Fivteen");
		System.out.println(map2);
	}

}
