package com.john.exercise.adapter.camera;

public class SDCard implements Storage{
	@Override
	public void store() {
		System.out.println("Storing data...");
	}

}
