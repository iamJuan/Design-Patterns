package com.john.exercise.bridge;

public class HeadLights implements Tester{
	@Override
	public void testVPart(int duration) {
		System.out.println("Testing Headlights for "+duration+" seconds.");
	}
}
