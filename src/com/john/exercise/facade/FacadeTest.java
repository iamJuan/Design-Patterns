package com.john.exercise.facade;

public class FacadeTest {
	public static void main(String args[]){
		BirdMaster birdMaster = new BirdMaster();
		birdMaster.releaseEagle();
		birdMaster.releaseHawk();
		birdMaster.releaseRaven();
	}
}
