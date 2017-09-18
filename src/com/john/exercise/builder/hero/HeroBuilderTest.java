package com.john.exercise.builder.hero;

public class HeroBuilderTest {
	public static void main(String args[]){
		HeroBuilder heroBuilder = new HeroBuilder();
		
		System.out.println("Wizard");
		Hero wiz = heroBuilder.createWizard();
		wiz.showSkills();
		
		System.out.println();
		
		System.out.println("Knight");
		Hero knight = heroBuilder.createKnight();
		knight.showSkills();
	}
}
