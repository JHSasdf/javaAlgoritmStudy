package chap_05;

import java.util.Arrays;

public class _05_ASCII {
    public static void main(String[] args) {
        // 아스키 코드 (ANSI) :미국 표준 코드
        char c = 'A';
        System.out.println((int) c);
        String[] a = new String[26];
        char b = 'A';
        for (int i = 65; i < 91 ; i++) {
            a[i-65] = String.valueOf(b++) + (i-64);
        }
        for (String instances:a) {
            System.out.print(instances+" ");
        }
        System.out.println();
        System.out.println(Arrays.toString(a));
    }
}
