package com.harsh.singleton.addDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.management.RuntimeErrorException;

public class DbSingleton {

	// Use of Keyword of Volatile
	// remain singleton in any other change inside jvm
	private static volatile DbSingleton instance=null;
	private static volatile Connection conn=null;
	
	// We want to reassure no use of Java.Reflection API
	private DbSingleton() {
		try {
			DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			if(instance != null) {
				throw new RuntimeException("Use getInstance() for Creating new Object (Z+ Protection)");
			}
			if(conn != null) {
				throw new RuntimeException("Use getConnection() for Creating new Connection to Database(Z+ Protection)");
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
	
	
	public static Connection getConnection() {
		if(conn==null) {
				synchronized (DbSingleton.class) {
					if(conn == null) {
					String dbUrl ="jdbc:derby:memory:codejava/webdb;create=true";
					try {
						conn = DriverManager.getConnection(dbUrl);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					}
					
				}
		}
		return conn;
	}
	
}
