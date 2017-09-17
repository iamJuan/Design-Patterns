package com.tutorialspoint.pattern.adapter;

public class MP4Player implements AdvancedMediaPlayer{
	
	@Override
	public void playVLC(String filename){
		
	}
	
	@Override
	public void playMP4(String filename){
		System.out.println("Playing vlc file. Name: "+ filename);
	}

}
