package _05_class._04_final;

public class FinalPractice {
    private final double radius;
    private final double PI = Math.PI;

    public FinalPractice(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double calculateArea() {
        return radius*radius*PI;
    }

}
