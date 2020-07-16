package com.harsh.factory;

public class FactoryDemo {
	public static void main(String[] args) {
		Website site = WebsiteFactory.getWebsite(WebsiteTypes.BLOG);
		
		System.out.println(site.getPages());
		
		site= WebsiteFactory.getWebsite(WebsiteTypes.SHOP);
		
		System.out.println(site.getPages());
	}
}
