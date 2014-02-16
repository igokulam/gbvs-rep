package com.igokulam.zoo;

public class Cat extends Animal {

	public Cat(String aName) {
		super(Constants.ANIMAL_TYPE_CAT, aName);
		
		}
	
	public String getImageFile(){
		return Constants.PICTURE_FILE_CAT;
	
	}
	
	public void sound(){
		Helper.playWavSound(Constants.SOUND_FILE_CAT);
	}

}
