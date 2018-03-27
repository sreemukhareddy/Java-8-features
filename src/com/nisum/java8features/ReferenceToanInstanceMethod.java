package com.nisum.java8features;

interface Mango{
	public void eat(String name);
}

class Eatery{
	public void eating(String name) {
		System.out.println("Eating the mangoes" + name);
	}
}

public class ReferenceToanInstanceMethod{
	public static void main(String[] args) {
		Eatery eatery=new Eatery();
		Mango mango=eatery::eating;
		mango.eat("asdfg");
	}
}