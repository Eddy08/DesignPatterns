package com.harsh.abstractFactory.AbstractFactory;

public abstract class CreditCardFactory {
	public static CreditCardFactory getCreditCard(int creditScore) {
		if(creditScore>100) {
			return new VisaFactory();
		}
		else {
			return new RupayFactory();
		}
	}
	public abstract CreditCard getCreditCard(CardType cardType);
	
	public abstract Validator getValidator(CardType cardType);
}
