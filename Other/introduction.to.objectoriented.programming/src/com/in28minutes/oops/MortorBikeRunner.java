package UDEMY_JAVA.javaWorkSpace.introduction.to.objectoriented.programming.src.com.in28minutes.oops;

public class MortorBikeRunner {
	public static void main(String[] args) {
		MotorBike ducati = new MotorBike(100);
		MotorBike honda = new MotorBike(200);
		MotorBike suzuki = new MotorBike();
		System.out.printf("suzuki의 속력은 %d", suzuki.getSpeed()).println();
		System.out.printf("ducati의 속력은 %d", ducati.getSpeed()).println();
		System.out.printf("honda의 속력은 %d", honda.getSpeed()).println();
		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());

//		ducati.setSpeed(100);
//		honda.setSpeed(80);

		ducati.increaseSpeed(100);
		ducati.decreaseSpeed(30);
		ducati.decreaseSpeed(50);
		honda.decreaseSpeed(100);
		ducati.start();
		honda.start();
		System.out.println(ducati.getSpeed());
	}
}
