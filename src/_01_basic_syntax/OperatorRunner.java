package _01_basic_syntax;

public class OperatorRunner {
    public static void main(String[] args) {
        int x, y;
        float a, b;
        x = 10;
        y = 20;
        a = 5.0f;
        b = 10.0f;
        System.out.println(x/y);
        System.out.println(x%y);
        System.out.println(a/b);
        System.out.println(a%b);

        System.out.printf("a %% b = %f \n", a%b);

        // 증감 연산자
        int c = 10;
        int d = 10;
        System.out.println("c++: "+ c++);
        System.out.println("++d: "+ ++d);
        System.out.println("c--: "+ c--);
        System.out.println("--c: "+ --d);

        // 산술 연산자
        System.out.println("c += 5 = " + (c += 5));
        // 비교 연산자
        System.out.println("a > b = ? " + (a > b));
        System.out.println("a == b = ? " + (a == b));
        System.out.println("c > d = ? " + (c > d));

        // 논리연산자: 연산 결과 불리언
        boolean j = true;
        boolean k = false;
        System.out.println("j && k = " + (j && k)); // 둘 다 참이라면 참
        System.out.println("j || k = " + (j || k)); // 둘 중 하나가 참이라면 참
        System.out.println("j && !k = " + (j && !k));
        
        // 삼항 연산자
        System.out.println(x > y ? "x는 y보다 크다" : "x는 y보다 작다");
    }
}
