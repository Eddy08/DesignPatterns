package com.harsh.abstractFactory.AbstractFactory;

public abstract class CreditCard {
	protected int cardNumberLength;
	protected int cvcNumber;
	public final int getCardNumberLength() {
		return cardNumberLength;
	}
	public final int getCvcNumber() {
		return cvcNumber;
	}
	public final void setCardNumberLength(int cardNumberLength) {
		this.cardNumberLength = cardNumberLength;
	}
	public final void setCvcNumber(int cvcNumber) {
		this.cvcNumber = cvcNumber;
	}
	
}
