package com.john.exercise.decorator;

public class Coffee implements Drink{
	
	@Override
	public String name() {
		return "Coffee";
	}

	@Override
	public float getCost() {
		return 1.00f;
	}

}
