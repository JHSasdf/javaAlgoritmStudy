package com.in28min;

public class Fan {

	// state
	private String make;
	private double radius;
	private String color;
	private boolean isOn;
	private byte speed; // 0 to 5

	// create;

	public Fan(String make, double radius, String color) {
		this.make = make;
		this.radius = radius;
		this.color = color;

	}

	public void toggleOn() {
		this.isOn = !this.isOn;
		if (!this.isOn) {
			setSpeed(0);
		} else {
			setSpeed(5);
		}
	}

	public void setSpeed(int speed) {
		if (this.isOn) {
			this.speed = (byte) speed;
		}
	}

	@Override
	public String toString() {
		return String.format("make - %s, radius- %f,  color-  %s, isOn - %b, speed - %d", make, radius, color, isOn,
				speed);
	}

}
