package chap_02;

public class _05_operator5 {
    public static void main(String[] args) {
        // 삼항 연산자
        // 결과 = (조건) ? (참의 경우 결과값) : (거짓의 경우 결과값)
        int x = 5;
        int y = 7;
        int max = (x >= y) ? x : y;
        System.out.println(max);

        int min = (x <= y) ? x : y;
        System.out.println(min);

        x = 3;
        y = 3;
        String s = (x != y) ? "not same" : "same";
        System.out.println(s);
    }
}
