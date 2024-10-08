package com.harsh.prototype.statement;

import java.util.List;

public class Statement implements Cloneable{
	private String sql;
	private List<String> parameters;
	private Record record;
	
	
	
	public Statement(String sql, List<String> parameters, Record record) {
	
		this.sql = sql;
		this.parameters = parameters;
		this.record = record;
	}
	
	public Statement clone() {
		try {
			return (Statement) super.clone();
		} catch (CloneNotSupportedException e) {
		
			e.printStackTrace();
		}
		return null;
	}
	
	public final String getSql() {
		return sql;
	}
	public final List<String> getParameters() {
		return parameters;
	}
	public final Record getRecord() {
		return record;
	}
	
	
	
}
