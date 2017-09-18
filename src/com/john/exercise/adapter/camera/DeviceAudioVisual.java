package com.john.exercise.adapter.camera;

public class DeviceAudioVisual implements Lens{
	
	private Mic mic;
	
	public DeviceAudioVisual(Mic mic){
		this.mic = mic;
	}

	@Override
	public void capture() {
		System.out.println("Capturing the environment...");
		mic.record();
	}

}
