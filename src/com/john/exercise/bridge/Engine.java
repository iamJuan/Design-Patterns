package com.john.exercise.bridge;

public class Engine implements Tester{

	@Override
	public void testVPart(int duration) {
		System.out.println("Testing Engine for "+duration+" seconds.");
	}

}
