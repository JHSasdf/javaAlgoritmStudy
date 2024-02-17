package _05_class._06_abstract;

public class Rectangle extends Shape{
    private int width;
    private int height;
    public Rectangle(String color, String type, int width, int height) {
        super(color, type);
        this.width = width;
        this.height = height;
    }

    // 추상 메소드 구현
    @Override
    public void draw() {
        System.out.println("원 그리기");
    }

    @Override
    public double calculateArea() {
        return width*height;
    }

    @Override
    public String toString() {
        return "=== " + getType() + "도형의 정보===\n도형의 색상: " + getColor() +"\n도형의 넓이: " + calculateArea() + "\n";
    }

}
