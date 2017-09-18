package com.john.exercise.builder.hero;

public class HeroBuilder {
	public Hero createWizard(){
		Hero hero = new Hero();
		hero.addSkill(new ManaRegen());
		hero.addSkill(new Amplification());
		hero.addSkill(new FireBlast());
		hero.addSkill(new HPRegen());
		
		return hero;
	}
	
	public Hero createKnight(){
		Hero hero = new Hero();
		hero.addSkill(new Bash());
		hero.addSkill(new DragonScale());
		hero.addSkill(new HPRegen());
		
		return hero;
	}
}
