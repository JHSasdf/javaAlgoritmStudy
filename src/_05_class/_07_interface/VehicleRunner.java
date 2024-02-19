package _05_class._07_interface;

import java.util.List;

public class VehicleRunner {
    public static void main(String[] args) {
        List<Vehicle> vehicleList = List.of(new Car("honda", 130), new Airplane("boeing", 1000));
        for (Vehicle vehicle: vehicleList) {
            vehicle.move();
            if (vehicle instanceof Flyable) {
                ((Flyable) vehicle).fly(); // 명시적 형변환
            }
            System.out.println();
        }
    }
}
