package com.john.exercise.flyweight;

public class FlyweightTest {
	public static void main(String args[]){
		for(int i=0; i < 20; ++i) {
			OakTree oak = (OakTree)TreeFactory.getOakTree();
			oak.setXPos(getRandomX());
			oak.setYPos(getRandomY());
			oak.setHeight(getRandomHeight());
			oak.sprout();
		}		
	}
	
	private static int getRandomX() {
		return (int)(Math.random()*100 );
	}	
	
	private static int getRandomY() {
		return (int)(Math.random()*100);
	}
	
	private static int getRandomHeight() {
		return (int)(Math.random()*100 );
	}	
}
