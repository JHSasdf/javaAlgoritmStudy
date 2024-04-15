package programers;

import java.util.Scanner;

public class BOJ24416 {
        private static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        recur(n);
        System.out.println(count);
        System.out.println(n-2);
    }
    private static void recur(int n) {
        if(n == 1 || n == 2) {
            count++;
            return;
        }
        recur(n-1);
        recur(n-2);
    }
}
