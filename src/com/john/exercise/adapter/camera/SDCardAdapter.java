package com.john.exercise.adapter.camera;

public class SDCardAdapter implements Adapter{

	@Override
	public void attach() {
		System.out.println("Storage attached to device...");
	}

}
