package com.harsh.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {
	
	protected List<Page> pages=new ArrayList<Page>();

	public Website() {
	this.createWebsite();
	
	}

	public final List<Page> getPages() {
		return pages;
	}
	//this is a factory method that will be called 
	// for creating the objects;
	public abstract void createWebsite();
	
	
	
		
}
