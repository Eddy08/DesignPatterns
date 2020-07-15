package com.harsh.singleton.eagrelyLoadedSingleton;

public class DbSingletonDemo {

	public static void main(String[] args) {
		DbSingleton instance= DbSingleton.getInstance();
		// Performance improvement 
		// here the instance is not Lazily Loaded
		// But Eagrely Loaded During Runtime
		// slow startup because of Lazily Loaded
		System.out.println(instance);
		DbSingleton instance2=DbSingleton.getInstance();
		// It will return same instance
		System.out.println(instance2);
		
	}

}
