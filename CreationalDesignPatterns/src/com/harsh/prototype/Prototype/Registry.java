package com.harsh.prototype.Prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {
	private Map<String, Item>items =new HashMap<>();

	public Registry() {
		loadItems();
	}

	public Item createItem(String type) {
		Item item = null;
		try {
			item = (Item)(items.get(type)).clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return item;
	}
	
	private void loadItems() {
		Movie movie=new Movie();
		movie.setPrice(20d);
		movie.setRuntime("2hr");
		movie.setTitle("Welcome");
		movie.setUrl("www.google.com");
		items.put("Movie", movie);
		
		Book book = new Book();
		book.setNumberOfPages(20);
		book.setPrice(100d);
		book.setTitle("How to live Life");
		
		items.put("Book",book);
	}
	
	
}
