package com.john.exercise.decorator;

public class Cappucino implements Drink{

	@Override
	public String name() {
		
		return "Cappucino";
	}

	@Override
	public float getCost() {
		return 2.25f;
	}

}
