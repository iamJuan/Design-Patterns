package com.john.exercise.bridge;

public abstract class Vehicle {
	public Tester tester;
	
	public Vehicle(Tester tester){
		this.tester = tester;
	}
	
	public abstract void test();
}
