package _05_class._05_inheritance;

public class AnimalRunner {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat1 = new Cat("cat", "navi", 3);
        Dog dog1 = new Dog("dog", "Michel", 5);
        animal.makeSound();
        cat1.makeSound();
        dog1.makeSound();

        cat1.act();
        dog1.act();
    }
}
