package programers;

import java.util.Scanner;

public class BOJ2156_포도주시식 {
    static int[] vines;
    static int[][] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        vines = new int[n+3];
        dp = new int[3][n+3];

        for(int i = 1; i < n+1; i++) {
                vines[i] = sc.nextInt();
        }
        // 0: n번째를 고르지 않았을 경우
        // 1: n-1번째를 고르지 않고 n번째를 골랐을 경우
        // 2: n-1번째를 고르고     n번째도 골랐을 경우
        dp[0][1] = 0;
        dp[1][1] += vines[1];
        dp[2][1] += vines[1];
        dp[0][2] += dp[1][1];
        dp[1][2] += vines[2];
        dp[2][2] += dp[1][1] + vines[2];
        for(int i = 3; i < n+1; i++) {
            dp[0][i] = Math.max(Math.max(dp[0][i-1], dp[1][i-1]), dp[2][i-1]);
            dp[1][i] = dp[0][i-1] + vines[i];
            dp[2][i] = dp[1][i-1] + vines[i];
        }

        System.out.println(Math.max(Math.max(dp[0][n], dp[1][n]), dp[2][n]));
    }
}
