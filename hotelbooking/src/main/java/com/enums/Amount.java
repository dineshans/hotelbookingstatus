package com.enums;

public enum Amount {

	PRICE(5000), Bonus_POINTS(1000);

	private int value;

	private Amount(int value) {

		this.value = value;

	}

	public int getValue() {
		return value;
	}

}
