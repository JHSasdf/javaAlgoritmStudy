package _06_wrapper;

// 포장 클래스는 문자열을 기본 타입 값으로 변환할 때도 사용함
// 대부분의 포장 클래스에는 "parse + 기본타입" 명으로 된 static method가 존재
// : 해당 메소드는 해당 기본타입 값으로 변환해줌

// 포장 값 비교
// - 포장 객체는 내부 값을 비교하기 위해 ==, != 연산자 사용 불가능. equals 이용해야함
// - why? 내부 값을 비교 하는 게 아니라 포장 객체의 주소값을 비교하기 때문

// - byte, short, int: -128 ~ 127
// - boolean: true, false
// - char: \u0000 ~ ~\u007f
// 위 범위에 포함되는 값은 이미 default로 만들어져 있음.
// 그래서 여러개 만들어도 포장 객체 공유 (같은 참조). 주소지가 같음. 이외의 값을 갖는다면 다른 참조
public class ValueCompare {
    public static void main(String[] args) {
        // -128 ~ 127
        Integer obj1 = 10;
        Integer obj2 = 11;
        Integer obj3 = 10;
        System.out.println("obj2 == obj1: " + (obj2 == obj1)); // false
        System.out.println("obj1 == obj3: " + (obj1 == obj3)); // true
        System.out.println("obj1 equals obj3: " + obj1.equals(obj3)); // true

        // 초과
        System.out.println();
        Integer obj4 = 1000;
        Integer obj5 = 1100;
        Integer obj6 = 1000;
        System.out.println("obj4 == obj5: " + (obj4 == obj5)); // false
        System.out.println("obj4 == obj6: " + (obj4 == obj6)); // false
        System.out.println("obj6 equals obj6: " + obj6.equals(obj6)); // true
    }
}
