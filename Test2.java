package com.lambda.examples3;

class MyThread implements Runnable{

	@Override
	public void run() {
		
		for(int i=0; i< 10; i++)
			System.out.println("Child Thread");
	}
	
}

public class Test2 {
	
	public static void main(String[] args) {
//		Runnable myRunnable= new MyThread();
//		Thread thread= new Thread(myRunnable);
//		thread.start();
//		for(int i=0; i< 10; i++)
//			System.out.println("Main Thread");
		Runnable r= () -> {
			for(int i=0; i< 10; i++)
				System.out.println("Child Thread");
		};
		
		Thread t= new Thread(r);
		t.start();
		for(int i=0; i< 10; i++)
			System.out.println("Main Thread");
	}
}
