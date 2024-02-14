package _02_control_statement;

// Method, 객체가 갖는 기능 (동작)

// 메서드 정의

/*
접근제한자 리턴타입 메서드_이름(인자1, 인자2...) {
    // 메서드 행위
    return 반환값;
}
* */

import java.util.List;

public class MethodRunner {

    public static void hello() {
        System.out.println("hello!");
    }

    public static String sum2(int x, int y) {
        return "X + y = " + (x+y);
    }

    // call by value (값 전달)
    public static int multifly(int x, int y) {
        return x * y;
    }

    // call by reference (참조 전달)
    public static int mul2(int[] nums) {
        int result = 1;
        for (int num: nums) {
            result *= num;
        }
        return result;
    }

    public static void main(String[] args) {
        hello();
        System.out.println(sum2(10,5));

        int[] lst = {10,20,2,3,5};
        System.out.println(mul2(lst));
        System.out.println(mul2(new int[] {10, 30})); // 배열 바로 생성 후 인자로 넣기
    }
}
