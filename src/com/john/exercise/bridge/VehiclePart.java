package com.john.exercise.bridge;

public class VehiclePart extends Vehicle{
	private int duration;
	
	public VehiclePart(int duration, Tester tester) {
		super(tester);
		this.duration = duration;
	}

	@Override
	public void test() {
		tester.testVPart(duration);
	}

}
