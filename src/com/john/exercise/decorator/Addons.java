package com.john.exercise.decorator;

public abstract class Addons implements Drink{
	public Drink drink;
	
	public Addons(Drink drink){
		this.drink = drink;
	}
	
	@Override
	public abstract String name();
	
	@Override
	public abstract float getCost();
}
