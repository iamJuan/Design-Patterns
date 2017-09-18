package com.john.exercise.builder.hero;

public abstract class Active implements Skill{
	private String type = "Passive";
	protected int lvl = 1;
	
	@Override
	public abstract String name();
	
	public String getType(){
		return type;
	}
}
