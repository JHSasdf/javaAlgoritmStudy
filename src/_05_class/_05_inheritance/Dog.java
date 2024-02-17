package _05_class._05_inheritance;

public class Dog extends Animal{
    public Dog(String species, String name, int age) {
        setSpecies(species);
        setName(name);
        setAge(age);
    }

    public void makeSound() {
        System.out.println(getSpecies() + " " + getName() + " " + getAge() + "세" + " : 멍!");
    }
    public void act() {
        System.out.println(getName() + " " + getAge() + "세의 물기");
    }
}
