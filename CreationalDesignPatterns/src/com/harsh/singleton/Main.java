package com.harsh.singleton;

public class Main {

	public static void main(String[] args) {
		
		Runtime singletonRuntime = Runtime.getRuntime();
		singletonRuntime.gc();
		System.out.println(singletonRuntime);
		
		Runtime anotherInstance= Runtime.getRuntime();
		System.out.println(anotherInstance);
	
		if(singletonRuntime==anotherInstance) {
			System.out.println("They are Same!");
		}
	}

}
