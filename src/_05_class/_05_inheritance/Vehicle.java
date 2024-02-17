package _05_class._05_inheritance;

public class Vehicle {
    private int numberOfWheel;
    private int year;
    private int maxNumberOfPeopleWhoCanRide;

    public Vehicle(int numberOfWheel, int year, int maxNumberOfPeopleWhoCanRide) {
        this.numberOfWheel = numberOfWheel;
        this.year = year;
        this.maxNumberOfPeopleWhoCanRide = maxNumberOfPeopleWhoCanRide;
    }

    public int getNumberOfWheel() {
        return numberOfWheel;
    }

    public int getYear() {
        return year;
    }

    public int getMaxNumberOfPeopleWhoCanRide() {
        return maxNumberOfPeopleWhoCanRide;
    }

    public void setEngine() {
        System.out.println("시동을 걸었습니다.");
    }

    public void dash() {
        System.out.println("최고 속도로 가는 중");
    }

    public void stop() {
        System.out.println("멈췄습니다.");
    }

}
