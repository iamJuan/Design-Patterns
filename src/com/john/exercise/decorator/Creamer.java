package com.john.exercise.decorator;

public class Creamer extends Addons{

	public Creamer(Drink drink) {
		super(drink);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String name() {
		return "Creamer";
	}

	@Override
	public float getCost() {
		return drink.getCost() + .35f;
	}

}
