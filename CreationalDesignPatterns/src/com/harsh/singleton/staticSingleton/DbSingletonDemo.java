package com.harsh.singleton.staticSingleton;

public class DbSingletonDemo {

	public static void main(String[] args) {
		DbSingleton instance= DbSingleton.getInstance();
		// Because of Private Constructor
//		DbSingleton testConst= new DbSingleton();
		
		System.out.println(instance);
		DbSingleton instance2=DbSingleton.getInstance();
		// It will return same instance
		System.out.println(instance2);
		
	}

}
