package com.igokulam.zoo;

public abstract class Animal implements LivingBeing {
	int    height;
	int    weight;
	int    color;
	String type;
	String name;
	
	abstract public String getImageFile();
	abstract public void sound();
	
	private String whoAmI() {
		return "I am " + this.type + " [" + this.name + "]";
	}
	
	public Animal(String aType, String aName) {
		type = aType;
		name = aName;
		System.out.println(whoAmI() + ".. Hello!");
	}
	
	public void eat() {
		System.out.println(whoAmI()+ " -- I am EATING!");
	}
	
	public void sleep() {
		System.out.println(whoAmI()+ " -- I am SLEEPING!");
	}
	
	public void play() {
		System.out.println(whoAmI()+ " -- I am PLAYING!");
		sound();
	}
	
	public void die() {
		System.out.println(whoAmI()+ " -- Bye bye to this world! I am DEAD.");
	}
	
}
