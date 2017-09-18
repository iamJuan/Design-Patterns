package com.john.exercise.decorator;

public class Frappe extends Addons{

	public Frappe(Drink drink) {
		super(drink);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String name() {
		return "Frappe";
	}

	@Override
	public float getCost() {
		return drink.getCost() + .7f;
	}

}
