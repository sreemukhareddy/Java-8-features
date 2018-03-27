package com.nisum.java8features;

interface MessageINF{
	Message getMessage(String msge);
}

class Message {
	Message(String msge){
		System.out.println("Helllo " + msge);
	}
}

public class referenceToaConstructor {
	
	public static void main(String[] args) {
		
		MessageINF messageINF = Message::new;
		messageINF.getMessage("sure");
	}

}
