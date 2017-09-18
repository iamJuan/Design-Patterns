package com.john.exercise.builder.hero;

public class Amplification extends Passive{

	@Override
	public String name() {
		return "Magic Amplification : "+getType();
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
