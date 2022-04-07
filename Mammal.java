package com.brianalentz.zookeeper;

public class Mammal {
	protected int energyLevel;
	
//	this will be where the constructor goes
	
	public Mammal() {
		this.energyLevel = 30;
	}
		
		
	
		
public int getEnergyLevel() {
		return energyLevel;
	}
	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	//	methods
	public int displayEnergy() {
		System.out.println(this.energyLevel);
		return this.energyLevel;
	}
	
}
