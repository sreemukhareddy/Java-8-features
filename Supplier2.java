package com.supplier;

import java.util.function.Supplier;

public class Supplier2 {
	
	public static void main(String[] args) {
		Supplier<String> s= () -> {
			String orderID= "";
			
			for(int i= 0; i<7; i++) {
				orderID += (int)Math.random()*7; 
			}
			System.out.println((int)Math.random()*7);
			return orderID;
		};
		System.out.println(s.get());
		System.out.println(s.get());
	}

}
