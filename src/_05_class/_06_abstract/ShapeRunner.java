package _05_class._06_abstract;

import java.util.ArrayList;

public class ShapeRunner {
    public static void main(String[] args) {
        // Shape 객체는 new 연산자로 직접 생성할 수 없지만,
        // 자식 클래스인 Circle, Square에서 new 연산자로 객체 생성 가능

//        Circle circle = new Circle("blue");
//        Square square = new Square("red");
//
//        circle.start();
//        circle.draw();
//        System.out.println("원 색상은" + circle.getColor());
//
//        square.start();
//        square.draw();
//        System.out.println("원 색상은" + square.getColor());

        ArrayList<Shape>shapes = new ArrayList<>();
        shapes.add(new Circle("red", "circle", 5 ));
        shapes.add(new Rectangle("blue", "rectangle", 4, 8));
        shapes.forEach(System.out::println);

    }
}
