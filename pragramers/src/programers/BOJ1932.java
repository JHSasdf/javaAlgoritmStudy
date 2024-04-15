package programers;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ1932 {
    public static void main(String[] args) {
        int[][] graph = new int[501][501];
        int[][] dp = new int[501][501];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                graph[i][j] = sc.nextInt();
            }
        }
        dp[1][1] = graph[1][1];

        for(int i = 2; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                if(j == 1) {
                    dp[i][j] = dp[i-1][j] + graph[i][j];
                } else if (j == i) {
                    dp[i][j] = dp[i-1][j-1] + graph[i][j];
                } else {
                    dp[i][j] = Math.max(dp[i-1][j-1], dp[i-1][j]) + graph[i][j];
                }
            }
        }

        System.out.println(Arrays.stream(dp[n]).max().getAsInt());

    }
}
