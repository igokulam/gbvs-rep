package com.igokulam.zoo;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Helper {
	
	public static void playWavSound(String wavFileName) {
	    try {
	    	System.out.println(new File(wavFileName).getAbsoluteFile());
	    	AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(wavFileName).getAbsoluteFile());
	        Clip clip = AudioSystem.getClip();
	        clip.open(audioInputStream);
	        clip.start();
	    } catch(Exception ex) {
	        System.out.println("Error with playing sound.");
	        ex.printStackTrace();
	    }
	}
	
	public static void waitForSecs(int secs) {
		try {
		    Thread.sleep(secs*1000);
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
	}
	
}
