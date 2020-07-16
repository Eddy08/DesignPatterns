package com.harsh.abstractFactory.AbstractFactory;

public class RupayFactory extends CreditCardFactory {

	@Override
	public CreditCard getCreditCard(CardType cardType) {
		switch (cardType) {
		case GOLD:
			return new RupayGoldCreditCard();
		case PLATINUM:
			return new RupayPlatinumCreditCard();

		default:
			break;
		}
		return null;
	}

	@Override
	public Validator getValidator(CardType cardType) {
		switch (cardType) {
		case GOLD:
			return new RupayGoldValidator();
		case PLATINUM:
			return new RupayPlatinumValidator();

		default:
			break;
		}
		return null;
	}

}
