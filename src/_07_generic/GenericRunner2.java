package _07_generic;

// 참고. Number class
// - Java에서 모든 숫자 형식의 부모 클래스
// - 정수형, 실수형 데이터타입 포함
// - Byte, Short, Integer 등등

// 제네릭 제한 Case1
// - Box 클래스는 제네릭 타입 T를 받지만 제한을 두어 Number를 상속한 클래스만 허용


class Box<T extends Number> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}


// movable interface
interface Movable {
    void move();
}

class Car implements Movable {

    @Override
    public void move() {
        System.out.println("자동차 출발");
    }
}
// 제네릭 제한 타입 2
// Container 클래스는 제네릭 타입 T를 받지만 제한을 두어서 Movable interface를 구현한 클래스만 허용
// - makeItMove 메서드는 해당 객체의 move 메서드를 호출할 수 있음.
class Container<T extends Movable> {
    private T item;
    
    public Container(T item) {
        this.item = item;
    }
    
    public void makeItMove() {
        item.move();
    }
}


public class GenericRunner2 {
    public static void main(String[] args) {
    Box<Double> doubleBox = new Box<>();
       doubleBox.setItem(3.456);
        System.out.println(doubleBox.getItem());
    Container<Car> carContainer = new Container<>(new Car());
    carContainer.makeItMove();
    }



}
