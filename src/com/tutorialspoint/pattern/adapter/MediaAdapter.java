package com.tutorialspoint.pattern.adapter;

public class MediaAdapter implements MediaPlayer{
	
	private AdvancedMediaPlayer advancedMediaPlayer;
	
	public MediaAdapter(String audioType) {
		if(audioType.equalsIgnoreCase("VLC"))
			advancedMediaPlayer = new VLCPlayer();
		else
			advancedMediaPlayer = new MP4Player();
	}
	
	@Override
	public void play(String audioType, String filename) {
		if(audioType.equalsIgnoreCase("VLC"))
			advancedMediaPlayer.playVLC(filename);
		else
			advancedMediaPlayer.playMP4(filename);
	}
}
