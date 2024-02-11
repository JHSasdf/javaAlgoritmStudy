package chap_06;

public class _05_overloading {
    public static int getPower(int x) { // "4" 가 들어올 ㅅ있음
        return (int) Math.pow(x, 2);
    }
    public static int getPower(String strNumber) {
        int number = Integer.parseInt(strNumber);
        return (int) Math.pow(number, 2);
    }
    public static void main(String[] args) {
        // 메소드 오버로딩, 전달 값의 타입이 다르거나, parameter의 수가 다를 때 같은 함수 이름을 여러번 정의해서 사용 가능
        // 같은 이름의 메소드를 여러 번 선언, 반환값의 타입이 다른 것은 불가능
        // 1. 전달값의 타입이 다르거나
        // 2. 전달값의 개수가 다르거나
        System.out.println(getPower("3"));
        System.out.println(getPower(3));

    }
}
