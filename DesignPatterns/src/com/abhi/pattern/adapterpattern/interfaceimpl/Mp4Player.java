package com.abhi.pattern.adapterpattern.interfaceimpl;

import com.abhi.pattern.adapterpattern.interfaces.AdvancedMediaPlayer;

public class Mp4Player implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String fileName) {
		// do nothing

	}

	@Override
	public void playMp4(String fileName) {
		System.out.println("Playing Mp4 file. Name : " + fileName);
	}

}
