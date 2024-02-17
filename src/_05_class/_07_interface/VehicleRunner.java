package _05_class._07_interface;

import java.util.List;

public class VehicleRunner {
    public static void main(String[] args) {
        List<Vehicle> vehicleList = List.of(new Car(), new Airplane());
        for (Vehicle vehicle: vehicleList) {
            vehicle.move();
            if (vehicle instanceof Flyable) {
                ((Flyable) vehicle).fly();
            }
            System.out.println();
        }
    }
}
