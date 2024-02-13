package _02_control_statement;

import java.util.Scanner;

public class Conditional_statement {
    public static void main(String[] args) {
        int number = 10;
        if (number % 2 == 0) {
            System.out.println("짝");
        }else {
            System.out.println("홀");
        }

        /////////////////////////
        // 문자열 (String) 객체 비교
        // == 연산자: 두 객체의 참조 비교 (동일한 메모리 위치를 가르키는지 확인)
        // equals() 메서드: 두 객체의 내용이 동일한지 비교
        Scanner scanner = new Scanner(System.in);
        String name;
//        do{
//        System.out.println("이름을 입력해");
//        name = scanner.next();
//        } while(! name.equals("홍길동"));
        // while(! name == "홍길동);
        System.out.println("what a coincidence!");


        // *문자열 리터럴의 경우, Java에서 특별 취급
        // 동일한 문자열 리터럴이 사용되는 경우, Java 컴파일러가 문자열 풀(String pool)이라는 영역에 해당 문자열을 저장
        // 문자열 리터럴이란 코드에서 하드코딩된 문쟈열
        String str1 = "hello";
        String str2 = "hello";
        System.out.println("Str1 == Str2: " + (str1 == str2));
        System.out.println("str1.equals(str2): " + str1.equals(str2));
        
        // 문자열을 동적으로 할당하는 경우, new String(...) 을 이용해서 새로운 문자열 객체를 생성
        // 이럴 경우에는 서로 다른 객체를 가리키게 됨
        Integer a = new Integer(30);
        Integer b = new Integer(30);
        System.out.println("thisis :" + (a == b));
        System.out.println("thisis :" + (a.equals(b)));

        ////////////////////////////////////////////
        // switch ~ case 문
        // 각 case 문의 braek 문으로 탈출, 생략시 바로 밑의 case 문으로 넘어감

        String dayOfWeek;
        int day = 45;
        switch (day) {
            case 1:
                dayOfWeek = "일요일";
                break;
            case 2:
                dayOfWeek = "월요일";
                break;
                case 3:
                dayOfWeek = "화요일";
                break;
            case 4:
                 dayOfWeek = "수요일";
                 break;
            case 5:
            case 6:
                dayOfWeek = "나머지";
                break;
            default:
                dayOfWeek = "잘못된 입력";

        }
        // Java 11버전 이상부터 가능한 향상된 switch문
//        String dayOfWeek;
//        int day = 45;
//        dayOfWeek = switch (day) {
//            case 1 -> "일요일";
//            case 2 -> "월요일";
//            case 3 -> "화요일";
//            case 4 -> "수요일";
//            case 5, 6 -> "나머지";
//            default -> "잘못된 입력";
//        };
        System.out.println(dayOfWeek);
    }
}
