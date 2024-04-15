package programers;

import java.util.Scanner;

public class BOJ2579 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] stair = new int[n+2];
        int[][] dp = new int[2][n+2];
        for( int i = 1; i <= n; i++) {
            stair[i] = sc.nextInt();
        }
        dp[1][1] = stair[1];
        dp[0][2] = dp[1][1];
        dp[1][2] = dp[1][1] +stair[2];
        for(int i = 3; i <= n-2; i++) {
            dp[0][i] = dp[1][i-1];
            dp[1][i] = Math.max(dp[0][i-2] + stair[i-1], dp[0][i-1]) + stair[i];
        }
        if(n > 2) {
        dp[0][n-1] = dp[1][n-2];
        dp[1][n-1] = dp[0][n-2] + stair[n-1];
        }
        int result = Math.max(dp[0][n-1], dp[1][n-1]) + stair[n];
        System.out.println(result);
    }
}
