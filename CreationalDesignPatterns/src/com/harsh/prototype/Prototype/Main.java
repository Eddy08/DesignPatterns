package com.harsh.prototype.Prototype;

public class Main {
	 public static void main(String[] args) {
		Registry registry= new Registry();
		Movie movie2=(Movie)registry.createItem("Movie");
		movie2.setPrice(3d);
		movie2.setTitle("New Movie2");
		movie2.setRuntime("30min");
		movie2.setUrl("www.movie1.com");
		System.out.println(movie2);
		
		Movie movie3=(Movie) registry.createItem("Movie");
		movie3.setPrice(10000d);
		movie3.setTitle("New Movie3");
		movie3.setRuntime("3hr");
		System.out.println(movie3);
	}
}
