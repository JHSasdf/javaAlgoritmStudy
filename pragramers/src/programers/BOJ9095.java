package programers;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ9095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[11];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i <= 10; i++) {
            dp[i] = dp[i-3] + dp[i-2] + dp[i-1];
        }
        System.out.println(Arrays.toString(dp));
        for(int i = 0; i < n; i++) {
            int tc = sc.nextInt();
            System.out.println(dp[tc]);
        }
    }
}
