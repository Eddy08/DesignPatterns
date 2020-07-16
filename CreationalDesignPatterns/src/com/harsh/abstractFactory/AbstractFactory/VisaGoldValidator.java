package com.harsh.abstractFactory.AbstractFactory;

public class VisaGoldValidator implements Validator {

	@Override
	public boolean isValid(CreditCard creditCard) {
		if(creditCard.getCardNumberLength()==15)
			return true;
		else			
		return false;
	}

}
