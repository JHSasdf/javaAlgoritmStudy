package com.in28min;

public class FanRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fan fan = new Fan("Manufacturer 1", 0.34567, "red");
		fan.setSpeed(3);
		fan.toggleOn();
//		fan.toggleOn();
		System.out.println(fan.toString());
	}

}
