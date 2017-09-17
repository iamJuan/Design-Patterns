package com.john.exercise.builder;

public class SparkingCandle extends Candle{

	@Override
	public String name() {
		return getType()+"- Sparking Candle";
	}

	@Override
	public float price() {
		return 1.75f;
	}

}
