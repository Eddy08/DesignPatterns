package com.harsh.prototype.Prototype;

public abstract class Item implements Cloneable{
private String title;
private double price;
private String url;

@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

public final String getTitle() {
	return title;
}
public final double getPrice() {
	return price;
}
public final String getUrl() {
	return url;
}
public final void setTitle(String title) {
	this.title = title;
}
public final void setPrice(double price) {
	this.price = price;
}
public final void setUrl(String url) {
	this.url = url;
}

@Override
public String toString() {
	return "Item [title=" + title + ", price=" + price + ", url=" + url + "]";
}

}
