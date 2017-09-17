package com.john.exercise.builder;

public abstract class Decoration implements Addons{
	
	String type = "Decoration";
	
	@Override 
	public abstract float price();
	
	public String getType(){
		return type;
	}
}
