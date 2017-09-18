package com.john.exercise.builder.hero;

import java.util.ArrayList;
import java.util.List;

public class Hero {
	private List<Skill> skills = new ArrayList<Skill>();
	
	public void addSkill(Skill skill){
		skills.add(skill);
	}
	
	public void showSkills(){
		System.out.println("Skills: ");
		for(Skill sk : skills){
			System.out.println("[LV."+ sk.getLvl() + " " +sk.name()+"]");
		}
	}
	
	public void increaseSkillLvl(String skillName){
		for(Skill sk : skills){
			if(sk.name().equals(skillName)){
				sk.setLvl(sk.getLvl()+1);
			}
		}
	}
}
