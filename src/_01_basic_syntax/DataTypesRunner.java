package _01_basic_syntax;

import java.util.ArrayList;
import java.util.List;

public class DataTypesRunner {
    public static void main(String[] args) {
        // 식별자
        char name = 65; // 0;

        int name2; // 숫자 사용 가능
        // int 2name; // 불가능
        //char if; // 예약어 불가능
        char student_ID$; // 특수 기호는 '_', '$'가능

        // 기본형 Primitive type, 원시값
        // 사용되기 전에 선언이 되어야 함
        // - OS에 따라 자료형 길이 변하기 않음.
        // - "비객체 타입", null값을 가질 수 없음
        System.out.printf("%c 입니다만 \n", name);

        // 정수형 변수 선언

        int x = 10;
        long y = 10000000000L;
        short z = 100;
        byte b = 127;

        // 실수형 변수 선언
        float a = 3.14f; // float 타입은 뒤에 f or F가 붙어야 함
        double d = 3.14;

        // 문자형 변수 선언
        char ch = 'a';

        // 논리형 변수 선언
        boolean bool = true;

        // 출력
        System.out.println(bool);

        ///////////////////////////////////////////////////////////////////
        // 참조형 Reference Type
        // - java.lang.Object의 상속을 받음
        // 기본형이 아니면 모두 참조형
        System.out.println("---- 참조형 ----");

        // String 참조형 변수 선언과 초기화
        // -Java에서 String 타입은 특별함. 참조형이지만, 기본형처럼 사용함 (불변 객체)
        // - 기본 자료형은 "=="로 비교하지만, String 객체간 비교는 .equals()라는 메소드를 이용해서 비교함.
        String greeting = "Helli guys";

        // 배열 (Array) 참조형 변수 선언과 초기화
        int[] nums = {1,2,3,4,5,6,7};
        List<Integer> nums2 = List.of(1,3,4,5,7,9);
        ArrayList<Integer> nums3 = new ArrayList<Integer>(List.of(3,4,8,6,7));

        // class 참조형 변수 선언과 초기화
        Person myInfo = new Person("jihun", 14);
        System.out.println(myInfo);


        // for-each문
        for (int num: nums3) {
            System.out.print(num + ", ");
        }
    }
}

class Person {
    private final String name;
    private final int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "name: " + getName() + "/ and age: " + getAge();
    }
}