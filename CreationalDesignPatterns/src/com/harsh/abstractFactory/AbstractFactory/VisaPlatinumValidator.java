package com.harsh.abstractFactory.AbstractFactory;

public class VisaPlatinumValidator implements Validator {

	@Override
	public boolean isValid(CreditCard creditCard) {
		if(creditCard.getCardNumberLength()==16)
			return true;
		else			
		return false;
	}

}
