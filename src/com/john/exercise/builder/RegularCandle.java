package com.john.exercise.builder;

public class RegularCandle extends Candle{

	@Override
	public String name() {
		return getType() + "- Regular Candle";
	}

	@Override
	public float price() {
		return 0.70f;
	}

}
