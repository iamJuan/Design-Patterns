package com.john.exercise.bridge;

public class Brakes implements Tester{

	@Override
	public void testVPart(int duration) {
		System.out.println("Testing Brakes for "+duration+" seconds.");
	}

}
