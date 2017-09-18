package com.john.exercise.builder.hero;

public class TrueSight extends Passive{

	@Override
	public String name() {
		return "True Sight : "+getType();
	}

	@Override
	public int getLvl() {		
		return lvl;
	}

	@Override
	public void setLvl(int lvl) {
		this.lvl = lvl;
	}

}
