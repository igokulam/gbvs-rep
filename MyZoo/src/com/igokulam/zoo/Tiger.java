package com.igokulam.zoo;

public class Tiger extends Animal {
	
	public Tiger(String aName) {
		super(Constants.ANIMAL_TYPE_TIGER, aName);
	}
	
	public String getImageFile() {
		return Constants.PICTURE_FILE_TIGER;
	}
	
	public void sound() {
		Helper.playWavSound(Constants.SOUND_FILE_TIGER);
	}
}
