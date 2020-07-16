package com.harsh.prototype.statement;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
	// Example of Shallow Copy 
		// Dangerous Copy because it is returning the refernce of the objects that is stored inside it
		// if we change any of the object it will get generated again
		
		String sql = "select * from Movies where title = ?";
		List<String> parameters=new ArrayList<>();
		parameters.add("Drive");
		Record record=new Record();
		Statement firstStatement = new Statement(sql, parameters, record);
		System.out.println(firstStatement.getSql());
		System.out.println(firstStatement.getParameters());
		System.out.println(firstStatement.getRecord());
		System.out.println(firstStatement);
		//Here the objects are created with Unique Id
		/*
		 * firstStatement = new Statement(sql, parameters, record);
		 * System.out.println(firstStatement.getSql());
		 * System.out.println(firstStatement.getParameters());
		 * System.out.println(firstStatement.getRecord());
		 * System.out.println(firstStatement);
		 */
		/*
		 * Statement secondStatement = new Statement(sql, parameters, record);
		 * System.out.println(secondStatement.getSql());
		 * System.out.println(secondStatement.getParameters());
		 * System.out.println(secondStatement.getRecord());
		 */
	}
}
