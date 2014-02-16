package com.igokulam.zoo;

public class Terrier extends Dog {
	

	public Terrier (String aname) {
		 super(Constants.ANIMAL_TYPE_TERRIER,aname);
	}
	
public String getImageFile() {
	return Constants.PICTURE_FILE_TERRIER;
}
public void sound() {
	Helper.playWavSound(Constants.SOUND_FILE_TERRIER);
	//Constants.SOUND_FILE_Terrier;
	
}
}