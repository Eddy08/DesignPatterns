package com.harsh.abstractFactory.AbstractFactory;

public class Main {
	public static void main(String[] args) {
		CreditCardFactory abstractFactory=CreditCardFactory.getCreditCard(110);
		CreditCard card =abstractFactory.getCreditCard(CardType.GOLD);
		
		System.out.println(card.getClass());
		
		
		abstractFactory=CreditCardFactory.getCreditCard(20);
		card=abstractFactory.getCreditCard(CardType.PLATINUM);
		
		System.out.println(card.getClass());
	}
}
