package _05_class._05_inheritance;

public class Bus extends Vehicle {
    private String brand;

    public Bus(int numberOfWheel, int year, int maxNumberOfPeopleWhoCanRide, String brand) {
        super(numberOfWheel, year, maxNumberOfPeopleWhoCanRide);
        this.brand = brand;
    }

    @Override
    public void setEngine() {
        System.out.println("우웅.");
    }

    @Override
    public void stop() {
        System.out.println("끼이이이이이익");
    }

    @Override
    public String toString() {
        return "model: Bycycle, " + "brand: " + brand + ", year: " + getYear() + ", numberOfWheel: " + getNumberOfWheel() +
                ", maxNumberOfPeoPleWhoCanRide: " + getMaxNumberOfPeopleWhoCanRide();
    }

}
