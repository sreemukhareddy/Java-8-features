package com.innerclasses.lambda;

public class AnonymousInnerclassWithLambdaExpression2 {

	public static void main(String[] args) {
		/*Runnable r= () -> {
				
				for(int i=0; i< 10; i++) {
					System.out.println("Child Thread");
				}
				
			
		};
		
		Thread t= new Thread(r);
		t.start();
		for(int i=0; i< 10; i++) {
			System.out.println("Main Thread");
		}*/
		
		Thread t2= new Thread( 
				
				() -> {
					for(int i=0; i< 10; i++) {
						System.out.println("Child Thread");
					}
				}
				
				);
		
		t2.start();
		
		for(int i=0; i< 10; i++) {
			System.out.println("Main Thread");
		}
		
		
	}
}
