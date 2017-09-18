package com.john.exercise.builder.hero;

public class Bash extends Active{

	@Override
	public int getLvl() {
		return lvl;
	}

	@Override
	public void setLvl(int lvl) {
		this.lvl = lvl;
	}

	@Override
	public String name() {
		return "Bash : "+getType();
	}

}
