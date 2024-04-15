package programers;

import java.util.Scanner;

public class BOJ1912_연속합 {
    public static void main(String[] args) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            int num = sc.nextInt();
            sum += num;
            max = Math.max(max, sum);
            if(sum< 0) {
                sum = 0;
            }

        }
        System.out.println(max);
    }
}
