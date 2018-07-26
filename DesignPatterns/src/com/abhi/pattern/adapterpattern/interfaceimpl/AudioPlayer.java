package com.abhi.pattern.adapterpattern.interfaceimpl;

import com.abhi.pattern.adapterpattern.interfaces.MediaPlayer;

public class AudioPlayer implements MediaPlayer {
	
	MediaAdapter mediaAdapter;
	
	@Override
	public void play(String audioType, String fileName) {
		
		//inbuilt mp3 support
		if(audioType.equalsIgnoreCase("mp3")) {
			System.out.println("Playing mp3 file. Name : " + fileName);
		}else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);
		}else {
			System.out.println("Invald media. " + audioType + " not supported.");
		}
		
	}
	
}
