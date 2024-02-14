package _02_control_statement;

public class Practice_2 {
    public static void getNumToInput(int x) {
        for (int i = 1; i <= x; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void addMinusMultiDiv(double x, double y) {
        System.out.println("덧셈 결과: " + (x + y));
        System.out.println("뺼셈 결과: " + (x - y));
        System.out.println("곱셈 결과: " + (x * y));
        System.out.println("나눗셈 결과: " + (x / y));
    }

    public static void doSomething(double x) {
        System.out.printf("반지름이  %.1f인 원의 넓이: %f \n", x, Math.PI*x*x);
    }
    public static void doSomething(char type, double x, double y) {
        if (type == 'r') {
        System.out.printf("가로 %.1f, 세로  %.1f인 직사각형의 넓이:  %.1f \n", x, y, x*y);
        } else if (type == 't') {
            System.out.printf("밑변  %.1f, 높이  %.1f인 삼각형의 넓이:  %.1f \n", x, y, x*y/2);
        } else {
            System.out.println("타입 입력해주세요. r or t");
        }
    }


    public static void main(String[] args) {
        getNumToInput(10);
        addMinusMultiDiv(10, 3);
        doSomething(5);
        doSomething('r', 4, 7);
        doSomething('t', 6, 3);
    }
}
