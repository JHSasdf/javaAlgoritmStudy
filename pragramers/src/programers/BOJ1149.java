package programers;

import java.util.Scanner;

public class BOJ1149 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] house = new int[3][n];
        int[][] dp = new int[3][n];

        for(int i = 0; i < n; i++) {
            house[0][i] = sc.nextInt();
            house[1][i] = sc.nextInt();
            house[2][i] = sc.nextInt();
            dp[0][i] = Integer.MAX_VALUE;
            dp[1][i] = Integer.MAX_VALUE;
            dp[2][i] = Integer.MAX_VALUE;
        }
        dp[0][0] = house[0][0];
        dp[1][0] = house[1][0];
        dp[2][0] = house[2][0];
        for(int i = 1; i < n; i++) {
            dp[0][i] = Math.min(dp[1][i-1], dp[2][i-1]) + house[0][i];
            dp[1][i] = Math.min(dp[0][i-1], dp[2][i-1]) + house[1][i];
            dp[2][i] = Math.min(dp[0][i-1], dp[1][i-1]) + house[2][i];
        }
        System.out.println(
                Math.min(Math.min(dp[0][n-1], dp[1][n-1]), dp[2][n-1])
        );

    }
}
