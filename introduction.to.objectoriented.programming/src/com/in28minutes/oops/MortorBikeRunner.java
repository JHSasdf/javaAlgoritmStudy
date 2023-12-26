package com.in28minutes.oops;

public class MortorBikeRunner {
	public static void main(String[] args) {
		MotorBike ducati = new MotorBike();
		MotorBike honda = new MotorBike();

		ducati.setSpeed(100);
		honda.setSpeed(80);

		ducati.start();
		honda.start();

		System.out.println(ducati.getSpeed());

	}
}
