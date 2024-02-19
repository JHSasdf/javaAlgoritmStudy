package _06_wrapper;

import java.util.stream.IntStream;

// Wrapper 객체: 기본 타입 값을 갖는 객체를 생성 가능
// - 포장 객체를 생성하기 위한 클래스는 'java.lang' 패키지에 포함되어 있음
// - 포장 객체는 포장하고 있는 기본 타입의 값을 변경할 수 없고, 단지 객체로 생성하는 데 목적이 있음
// - 컬렉션 객체 때문, ,기본 타입의 값은 저장할 수 없고, 객체만 저장 가능하기 때문
public class BoxingUnboxing {
    public static void main(String[] args) {
        // Boxing
        // - 기본 타입의 값을 Wrapper 객체로 만들어줌
        // - 포장 클래스 변수에 값이 대입될 때 발생
        Integer obj1 = 100;
        Double obj2 = 1.14;
        Character obj3 = 'A';
        System.out.println(obj1.intValue()); // intValue() : Integer 객체 내부의 int 값 리턴
        System.out.println(obj2.doubleValue());
        System.out.println(obj3.charValue());

        // Unboxing
        // - Wrapper 객체에서 원시 데이터를 얻는 과정
        // - 원시 타입 변수에 포장 객체가 대입될 때 생성
        int value1 = obj1;
        double value2 = obj2;
        char value3 = obj3;
        System.out.println(value1 + "   , " + value2 + "   , " + value3 );


        // 연산 시 boxing
        // - obj는 연산 시 unboxing 되어 연산됨
        int result1 = obj1 + 100;
        double result2 = obj2 + 1.5;
        char result3 = (char) (obj3 + 1);
        System.out.println(result1 + "   , " + result2 + "   , " + result3 );
    }
}
