package com.qa.solid.liskov;

public class Owl extends FlyingBird{

	private int altitude;

	public void fly() {
		this.setAltitude(this.getAltitude() + 1000);
	}

	public int getAltitude() {
		return altitude;
	}

	public void setAltitude(int altitude) {
		this.altitude = altitude;
	}

}
