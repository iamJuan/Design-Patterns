package com.john.exercise.adapter.camera;

public class MegaMic implements Mic{

	@Override
	public void record() {
		System.out.println("Recording environment sounds...");
	}

}
