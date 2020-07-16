package com.harsh.abstractFactory.AbstractFactory;

public class RupayGoldValidator implements Validator {

	@Override
	public boolean isValid(CreditCard creditCard) {
		if(creditCard.getCardNumberLength()==13) {
			return true;
		}else {
		return false;
		}
	}

}
