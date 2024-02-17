package _05_class._05_inheritance;

public class VehicleRunner {
    public static void main(String[] args) {
    Bus bus = new Bus(4,2022, 30, "toyota");
        System.out.println(bus);
        bus.setEngine();
        bus.dash();
        bus.stop();
        System.out.println("--------------------------------------------");
        Bycycle bycycle = new Bycycle(4, 2023, 2, "SamSung");
        System.out.println(bycycle);
        bycycle.setEngine();
        bycycle.dash();
        bycycle.stop();
    }
}
