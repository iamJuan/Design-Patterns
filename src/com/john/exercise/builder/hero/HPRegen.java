package com.john.exercise.builder.hero;

public class HPRegen extends Passive{

	@Override
	public void setLvl(int lvl) {
		this.lvl = lvl;
	}

	@Override
	public String name() {
		return "HP Regeneration";
	}

	@Override
	public int getLvl() {
		// TODO Auto-generated method stub
		return lvl;
	}

}
