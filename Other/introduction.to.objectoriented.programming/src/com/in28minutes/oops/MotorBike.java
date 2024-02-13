package UDEMY_JAVA.javaWorkSpace.introduction.to.objectoriented.programming.src.com.in28minutes.oops;

public class MotorBike {

	// state
	private int speed;

	MotorBike() {
		this(5);
	}

	MotorBike(int speed) {
		this.speed = speed;
	}

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

	public void increaseSpeed(int howMuch) {
		setSpeed(this.speed + howMuch);
	}

	public void decreaseSpeed(int howMuch) {
		setSpeed(this.speed - howMuch);

	}
}
