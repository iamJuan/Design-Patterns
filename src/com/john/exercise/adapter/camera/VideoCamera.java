package com.john.exercise.adapter.camera;

public class VideoCamera {
	
	public static void main(String args[]){
		
		DeviceAudioVisual vcam = new DeviceAudioVisual(new MegaMic());
		vcam.capture();
		
		DeviceStorage vsto = new DeviceStorage(new SDCardAdapter());
		vsto.store();
	}
	
}
