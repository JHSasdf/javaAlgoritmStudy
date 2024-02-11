package chap_04;

public class _02_else {
    public static void main(String[] args) {
        // 조건문 If Else
        int hour = 10;
        if (hour < 14) {
            System.out.println("아이스아메리카노 +1");
        }
        else {
            System.out.println("디카페인 아메리카노 +1");
        }
        System.out.println("커피 주문 완료 #1");

        hour = 14;
        boolean morningCoffee = true;
        if (hour >= 14 || morningCoffee) {
            System.out.println("디카페인 아메리카노 +1");
        }
        else {
            System.out.println("아이스아메리카노 +1");
        }
        System.out.println("커피 주문 완료 #2");
    }
}
