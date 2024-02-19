package _05_class._07_interface;

public class Airplane extends Vehicle implements Flyable{
    public Airplane(String name, int maxSpeed) {
        super(name, maxSpeed);
    }

    @Override
    public void fly() {
        System.out.println(getName() + " 고도 10000 피트에서 비행 중");
    }

    @Override
    public void move() {
        System.out.println("하늘을 날아가는 중");
    }
}
