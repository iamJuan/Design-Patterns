package com.john.exercise.builder;

public class SprinklesDecor extends Decoration{

	@Override
	public String name(){
		return getType() + "- Sprinkles";
	}
	
	@Override
	public float price(){
		return 0.50f;
	}
}
