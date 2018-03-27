package com.nisum.java8features;

import java.util.ArrayList;
import java.util.List;

public class UsingForEach {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("harish");
		list.add("sure");
		list.add("sree");
		list.add("mukha");
		list.add("reddy");
		
		list.forEach(
				n->System.out.println(n)	);
		
	}

}
