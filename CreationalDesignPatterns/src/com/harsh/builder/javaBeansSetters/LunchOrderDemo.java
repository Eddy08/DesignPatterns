package com.harsh.builder.javaBeansSetters;

public class LunchOrderDemo {
	public static void main(String[] args) {
		LunchOrderBean lunch =new LunchOrderBean();
//		lunch.setBread("Brown Bread");
//		lunch.setButter("Low Cholestrol");
//		lunch.setDressing("Salad");
//		lunch.setJuice("Orange Juice");
		System.out.println(lunch);

	// Here the launchorder bean is mutable becuase
		//of exposed setters
		
	// Any type of configuration can run
		// no way to know which object is valid
		
		
		/*		
				for example Inside String Builder We can easily
				add things 
				but cannot change the things
				for this we have to create another String builder
				object 
		*/
		}
}
