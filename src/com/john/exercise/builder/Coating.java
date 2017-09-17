package com.john.exercise.builder;

public abstract class Coating implements Addons{
	
	String type = "Coating";
	
	@Override
	public abstract float price();
	
	public String getType(){
		return type;
	}
}
