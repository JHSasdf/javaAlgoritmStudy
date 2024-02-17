package _05_class._05_inheritance;

public class Cat extends Animal{
    public Cat(String species, String name, int age) {
        setSpecies(species);
        setName(name);
        setAge(age);
    }

    public void makeSound() {
        System.out.println(getSpecies() + " " + getName() + " " + getAge() + "세" + " : 야옹");
    }

    public void act() {
        System.out.println(getName() + " " + getAge() + "세의 할퀴기");
    }
}
