package com.john.exercise.builder;

public class SugarCoating extends Coating{
	@Override
	public String name(){
		return getType()+"- Sugar Coat";
	}
	
	@Override
	public float price(){
		return 2.05f;
	}
}
