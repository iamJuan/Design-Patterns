package com.john.exercise.builder.hero;

public class DragonScale extends Passive{

	@Override
	public void setLvl(int lvl) {
		this.lvl = lvl;
	}

	@Override
	public String name() {
		return "Dragon Scale : "+getType();
	}

	@Override
	public int getLvl() {
		return lvl;
	}

}
