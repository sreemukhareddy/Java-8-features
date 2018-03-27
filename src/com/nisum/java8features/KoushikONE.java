package com.nisum.java8features;

interface Greet{
	public void greetingd();
	//public void greetingd(int a,int b);
}

class GreetTheGuests{
	public void greet(Greet greet) {
		greet.greetingd();
	}
}

public class KoushikONE {

	public static void main(String[] args) {
		GreetTheGuests greetTheGuests = new GreetTheGuests();
		
		// 1st way
		Greet greet=() -> {
			System.out.println("Hello Guests !!!");
		};
		
		greetTheGuests.greet(greet);
		
		// 2nd way
		
		/*greetTheGuests(() -> {
			System.out.println("Hey Man !!!!");
		});*/
	}
}
