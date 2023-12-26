package com.in28minutes.oops;

public class MotorBike {

	// state
	private int speed;

	// behaviour
	void start() {
		System.out.printf("Bike started! at speed %d", speed).println();
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed > 0) {
			this.speed = speed;
		}
	};

}
