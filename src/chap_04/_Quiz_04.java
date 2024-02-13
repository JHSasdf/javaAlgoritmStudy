package chap_04;

import java.lang.reflect.Array;

public class _Quiz_04 {
    public static void main(String[] args) {
        String car1 = "장애인";
        int hour = 5;
        int price = 4000*hour;
        if (car1.equals("일반차")) {
            price = Math.min(price, 30000);
        } else if (car1.equals("경차") || car1.equals("장애인")) {
            price = Math.min(price/2, 15000);
        }
        System.out.println("금액은 " + price +"원");


    }
}
