package com.john.exercise.builder.hero;

public class ManaRegen extends Passive{
	
	@Override
	public String name() {
		return "Mana Regeneration : "+getType();
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
