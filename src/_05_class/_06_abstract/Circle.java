package _05_class._06_abstract;

public class Circle extends Shape{
    private int radius;
    public Circle(String color, String type, int radius) {
        super(color, type);
        this.radius = radius;
    }

    // 추상 메소드 구현
    @Override
    public void draw() {
        System.out.println("원 그리기");
    }

    @Override
    public double calculateArea() {
        return radius*radius*Math.PI;
    }
    @Override
    public String toString() {
        return "=== " + getType() + "도형의 정보===\n도형의 색상: " + getColor() +"\n도형의 넓이: " + calculateArea() + "\n";
    }


}
