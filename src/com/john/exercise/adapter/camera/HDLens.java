package com.john.exercise.adapter.camera;

public class HDLens implements Lens{

	@Override
	public void capture() {
		System.out.println("Taking video...");
	}

}
