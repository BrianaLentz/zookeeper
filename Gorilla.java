package com.brianalentz.zookeeper;

public class Gorilla extends Mammal{
	
//	constructor
	public Gorilla() {
		super();
	}

	
	public void throwSomething() {
		System.out.println("Ah! The gorilla threw something!");
		this.energyLevel -=5;
	}
	
	public void eatBananas() {
		System.out.println("*Bangs on chest* Looks like it was a yummy banana!");
		this.energyLevel +=10;
	}
	
	public void climb() {
		System.out.println("Oh cool, the gorilla is climbing a tree!");
		this.energyLevel -=10;
	}
}
