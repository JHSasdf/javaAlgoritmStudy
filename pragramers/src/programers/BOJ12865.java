package programers;

import java.util.Scanner;

public class BOJ12865 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int limit = sc.nextInt();
        int[] w = new int[n + 1];
        int[] v = new int[n + 1];
        int[][] dp = new int[limit + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }
        for(int i = 1; i <=n; i++) {
            for(int j = 1; j <=limit; j++) {
                if(j - w[i] >= 0) {
                    dp[j][i] = Math.max(dp[j - w[i]][i-1] + v[i], dp[j][i-1]);
                } else {
                    dp[j][i] = dp[j][i-1];
                }
            }
        }
        System.out.println(dp[limit][n]);
    }
}


