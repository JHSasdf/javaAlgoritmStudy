package chap_05;

import java.util.Arrays;

public class _Quiz_05 {
    public static void main(String[] args) {
        int [] lst = new int [10];
        String [] totalList = new String [10];
        int num = 250;
        for (int i = 0; i < lst.length; i++) {
            lst[i] = num + (5*i);
            totalList[i] = "사이즈 " + lst[i] + " (재고 있음)";
            System.out.println(totalList[i]);

        }

    }
}
