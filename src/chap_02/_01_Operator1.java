package chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        // 산술 연산자
        // 일반연산
        System.out.println( 4 + 1);
        System.out.println((double) 4 / 3 );
        System.out.println(3 % 2);
        System.out.println(5 % 2);

        int a = 20;
        int b = 10;
        double c = (double) a / b;
        System.out.println(c);

        int val = 10;
        System.out.println(val++); // 10을 출력하고 1을 더함
        System.out.println(++val); // 1을 더하고 출력하기 때문에 위와 합쳐져서 12가 됨

        System.out.println(--val); // 11
        System.out.println((val--)); //11
        System.out.println(val); //10


    }
}
