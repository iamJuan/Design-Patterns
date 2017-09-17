package com.john.exercise.builder;

public class ThinCoating extends Coating{
	@Override
	public String name(){
		return getType()+"- Thin Coat";
	}
	
	@Override
	public float price(){
		return 1.50f;
	}
}
