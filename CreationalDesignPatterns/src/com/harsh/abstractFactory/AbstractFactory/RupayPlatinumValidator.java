package com.harsh.abstractFactory.AbstractFactory;

public class RupayPlatinumValidator implements Validator {

	@Override
	public boolean isValid(CreditCard creditCard) {
		if(creditCard.getCardNumberLength()==14)	
		return true;
		else
			return false;
	}

}
