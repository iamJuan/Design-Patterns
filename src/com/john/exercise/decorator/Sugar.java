package com.john.exercise.decorator;

public class Sugar extends Addons{

	public Sugar(Drink drink) {
		super(drink);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String name() {
		return "Sugar";
	}

	@Override
	public float getCost() {
		return drink.getCost() + .1f;
	}

}
