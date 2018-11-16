package com.consumer;

import java.util.function.Consumer;

class Movie{
	String name;
	String result;
	
	public Movie(String name, String result) {
		this.name= name;
		this.result= result;
	}
}

public class ChainedConsumer2 {
	
	public static void main(String[] args) {
		Movie movie= new Movie("ABCD", "Average");
		Consumer<Movie> c1= m -> System.out.println("Movie name " + m.name);
		Consumer<Movie> c2= m -> System.out.println("Movie Result " + m.result);
		Consumer<Movie> c3= m -> System.out.println("Storing Movie Info into the DB");
		c1.andThen(c2).andThen(c3).accept(movie);
	}

}
