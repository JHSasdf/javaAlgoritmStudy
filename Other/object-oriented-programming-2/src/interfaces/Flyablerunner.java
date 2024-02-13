package interfaces;

interface Flyable {
	public void fly();
}

class Bird implements Flyable {
	@Override
	public void fly() {
		System.out.println("fly with wings!");
	}
}

class Aeroplane implements Flyable {
	@Override
	public void fly() {
		System.out.println("fly with fuel");
	}
}

abstract class Animal {
	public abstract void bark();
}

class Dog extends Animal {
	@Override
	public void bark() {
		System.out.println("bow bow");
	}
}

class Cat extends Animal {
	@Override
	public void bark() {
		System.out.println("meow meow!");
	}
}

public class Flyablerunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 다형성은 상속개념에도, 인터페이스에서도 적용
		Flyable[] flyingObjects = { new Bird(), new Aeroplane() };
		for (Flyable object : flyingObjects) {
			object.fly();
		}

		Animal[] animals = { new Cat(), new Dog() };
		for (Animal animal : animals) {
			animal.bark();
		}

	}

}
