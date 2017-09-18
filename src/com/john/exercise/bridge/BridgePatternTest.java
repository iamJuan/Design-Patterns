package com.john.exercise.bridge;

public class BridgePatternTest {
	public static void main(String args[]){
		
		Vehicle engine = new VehiclePart(300, new Engine());
		Vehicle brakes = new VehiclePart(100, new Brakes());
		Vehicle headlights = new VehiclePart(20, new HeadLights());
		
		engine.test();
		brakes.test();
		headlights.test();
	}
}
