package com.john.exercise.builder.hero;

public abstract class Passive implements Skill{
	private String type = "Passive";
	protected int lvl = 1;
	
	@Override
	public abstract String name();
	
	@Override
	public abstract int getLvl();
	
	public String getType(){
		return type;
	}
}
