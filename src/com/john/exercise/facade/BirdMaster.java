package com.john.exercise.facade;

public class BirdMaster {
	private Bird eagle;
	private Bird hawk;
	private Bird raven;
	
	public BirdMaster(){
		eagle = new Eagle();
		hawk = new Hawk();
		raven = new Raven();
	}
	
	public void releaseEagle(){
		eagle.fly();
	}
	
	public void releaseHawk(){
		hawk.fly();
	}
	
	public void releaseRaven(){
		raven.fly();
	}
}
