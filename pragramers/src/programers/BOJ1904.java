package programers;

import java.util.Scanner;

public class BOJ1904 {
    public static void main(String[] args) {
        int[] dp = new int[1000002];
        dp[1] =1;
        dp[2] = 2;

        for(int i = 3; i < 1000000; i++) {
            dp[i] = (dp[i-1] + dp[i-2]) % 15746;
        }
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(dp[n]);
    }
}
