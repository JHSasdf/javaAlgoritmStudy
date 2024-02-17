package _05_class._06_abstract;

public class Square extends Shape{
    public Square(String color) {
        super(color, "type");
    }

    // 추상 메소드 구현
    @Override
    public void draw() {
        System.out.println("사각형 그리기");
    }

    @Override
    public double calculateArea() {
        return 0;
    }
}
