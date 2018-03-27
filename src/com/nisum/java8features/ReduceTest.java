package com.nisum.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ReduceTest {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("harish");
		list.add("sure");
		list.add("sree mukha");
		list.add("venkat");
		list.add("manoj choudhary");
		
		Optional<String> name=list.stream().reduce((s1,s2)->s1.length() > s2.length() ? s1:s2);
		
		name.ifPresent(s->System.out.println(s));
	}
}
