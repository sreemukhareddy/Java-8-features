package com.supplier;

import java.util.Date;
import java.util.function.Supplier;

public class Supplier1 {
	
	public static void main(String[] args) {
		Supplier<Date> d = () -> new Date();
		System.out.println(d.get());
		System.out.println(d.get());
	}

}
