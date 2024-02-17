package _05_class._05_inheritance;

public class Bycycle extends Vehicle {
    private String brand;

    public Bycycle(int numberOfWheel, int year, int maxNumberOfPeopleWhoCanRide, String brand) {
        super(numberOfWheel, year, maxNumberOfPeopleWhoCanRide);
        this.brand = brand;
    }

    @Override
    public void setEngine() {
        System.out.println("튼튼한 다리가 시동이죠.");
    }

    @Override
    public void stop() {
        System.out.println("끼익");
    }
    @Override
    public String toString() {
        return "model: Bycycle, " + "brand: " + brand + ", year: " + getYear() + ", numberOfWheel: " + getNumberOfWheel() +
                ", maxNumberOfPeoPleWhoCanRide: " + getMaxNumberOfPeopleWhoCanRide();
    }

}
