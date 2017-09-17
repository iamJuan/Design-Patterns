package com.john.exercise.builder;

public abstract class Candle implements Addons{
	
	String type = "Candle";
	
	@Override
	public abstract float price();
	
	public String getType(){
		return type;
	}
}
