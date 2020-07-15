package com.harsh.singelton.threadSafe;

import javax.management.RuntimeErrorException;

public class DbSingleton {

	// Use of Keyword of Volatile
	// remain singleton in any other change inside jvm
	private static volatile DbSingleton instance=null;
	
	// We want to reassure no use of Java.Reflection API
	private DbSingleton() {
			if(instance != null) {
				throw new RuntimeException("Use getInstance() for Creating new Object (Z+ Protection)");
			}
	}

	// If two threads are in lock then using this if statement
	// Double Checking
	// Multiple thread cannot access the singleton object at same time
	public static DbSingleton getInstance() {
		if(instance==null) {
				synchronized (DbSingleton.class) {
					if(instance == null) {
						instance= new DbSingleton();
					}
					
				}
		}
		return instance;
	}
	
}
