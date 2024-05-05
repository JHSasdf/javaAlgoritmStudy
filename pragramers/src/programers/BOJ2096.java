package programers;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ2096 {
    static int[][][] dp;
    static int[][] graph;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 0,1,2번째 값 (col)
        graph = new int[3][n];
        // 0: 최소값, 1: 최대값  / [3] col
        dp = new int[2][3][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                graph[j][i] = sc.nextInt();
            }
        }
        dp[0][0][0] = dp[1][0][0] = graph[0][0];
        dp[0][1][0] = dp[1][1][0] = graph[1][0];
        dp[0][2][0] = dp[1][2][0] = graph[2][0];
        for(int i = 1; i < n; i++) {
            dp[0][0][i] = graph[0][i] + Math.min(dp[0][0][i-1], dp[0][1][i-1]);
            dp[1][0][i] = graph[0][i] + Math.max(dp[1][0][i-1], dp[1][1][i-1]);
            dp[0][1][i] = graph[1][i] + Math.min(Math.min(dp[0][0][i-1], dp[0][1][i-1]), dp[0][2][i-1]);
            dp[1][1][i] = graph[1][i] + Math.max(Math.max(dp[1][0][i-1], dp[1][1][i-1]), dp[1][2][i-1]);
            dp[0][2][i] = graph[2][i] + Math.min(dp[0][1][i-1], dp[0][2][i-1]);
            dp[1][2][i] = graph[2][i] + Math.max(dp[1][1][i-1], dp[1][2][i-1]);
        }
        System.out.print(Math.max(Math.max(dp[1][0][n-1], dp[1][1][n-1]), dp[1][2][n-1]) + " ");
        System.out.print(Math.min(Math.min(dp[0][0][n-1], dp[0][1][n-1]), dp[0][2][n-1]));
    }
}
