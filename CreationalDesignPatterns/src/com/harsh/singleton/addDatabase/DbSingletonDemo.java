package com.harsh.singleton.addDatabase;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

public class DbSingletonDemo {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		DbSingleton instance= DbSingleton.getInstance();
		long timeBefore=0;
		long timeAfter=0;
		System.out.println(instance);
		
		timeBefore=System.currentTimeMillis();
		Connection conn = DbSingleton.getConnection();
		timeAfter=System.currentTimeMillis();
		
		System.out.println(timeAfter-timeBefore);
		
		Statement sta;
		try {
			sta=conn.createStatement();
			int count= sta.executeUpdate("CREATE TABLE Address (ID INT,StreetName VARCHAR(20),City VARCHAR(20))");
			System.out.println("Table Crated");
			sta.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		timeBefore=System.currentTimeMillis();
		conn = DbSingleton.getConnection();
		timeAfter=System.currentTimeMillis();
// very Optimized Code --> nearly 0 seconds for creating new object
		System.out.println(timeAfter-timeBefore);
		
		
	// Use of Reflection API to test whether it will call the Constructor or not;
	
		Class<?> clss= Class.forName("com.harsh.singleton.addDatabase.DbSingleton");
		Constructor<?>[] constructors=clss.getDeclaredConstructors();
		System.out.println(Arrays.toString(constructors));
		
			for(Constructor<?>c: constructors) {
				c.setAccessible(true);
				Object ob=c.newInstance();
			}
	}

}
