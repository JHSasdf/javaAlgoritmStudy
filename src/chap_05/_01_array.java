package chap_05;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.SplittableRandom;

public class _01_array {
    public static void main(String[] args) {
        // 배열 선언 첫 번째 방법
//        String[] coffees = new String[4];

        // 두 번째
        // String coffees[] = new String[4];
//        coffees[0] = "아메리카노";
//        coffees[1] = "카페모카";
//        coffees[2] = "라떼";
//        coffees[3] = "카푸치노";

        //세 번째 방법
        //String[] coffees = new String[] {"아메리카노", "카페모카", "라떼", "카푸치노"};

        //네 번째 방법
        String[] coffees = {"아메리카노", "카페모카", "라떼", "카푸치노"};
        for (int i = 0; i < coffees.length ; i++) {
            System.out.println(coffees[i]);
        }

        // 다른 자료형
        int[] i = {1,2,3};
        double[] d = {10.0, 11.2, 13.5};
    }
}
