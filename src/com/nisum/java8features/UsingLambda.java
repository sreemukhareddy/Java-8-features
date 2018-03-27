package com.nisum.java8features;

interface Sayyable{
	public String say(String name);
}



public class UsingLambda {
	
	public static void main(String[] args) {
		Sayyable s = (name)->{
			String name1="Hello " + name;
			return name1;
		};
		
		System.out.println(s.say("sree"));
	}

}
