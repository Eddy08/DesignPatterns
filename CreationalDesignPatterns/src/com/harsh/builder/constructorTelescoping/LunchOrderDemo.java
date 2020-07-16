package com.harsh.builder.constructorTelescoping;

public class LunchOrderDemo {
	public static void main(String[] args) {
		LunchOrderBean lunch =new LunchOrderBean("brown","salad");
//		lunch.setBread("Brown Bread");
//		lunch.setButter("Low Cholestrol");
//		lunch.setDressing("Salad");
//		lunch.setJuice("Orange Juice");
		System.out.println(lunch);

	// Here the launchorder bean is immutable becuase
		//No Setters
		
	// Fixed configuration can run
		// no way to set any other configuratoin of object 
		
		}
}
