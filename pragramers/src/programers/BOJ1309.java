package programers;

import java.util.Scanner;

public class BOJ1309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] dp = new int[2][n+1];
        dp[0][1] = 1;
        dp[1][1] = 2;
        for(int i = 2; i<=n; i++) {
            dp[0][i] = (dp[0][i-1] + dp[1][i-1])%9901;
            dp[1][i] = (2*dp[0][i-1] + dp[1][i-1])%9901;
        }
        System.out.println((dp[0][n] + dp[1][n]) %9901);
    }
}
