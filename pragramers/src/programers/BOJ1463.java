package programers;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ1463 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] dp = new int[n+1];
    dp[n] = 0;
    dp[1] = 0;
    for(int i = 2; i <= n; i++) {
        dp[i] = Integer.MAX_VALUE;
    }
    for(int i = 1; i<=n; i++) {
        if(dp[i] == Integer.MAX_VALUE) continue;
        if(i * 3 <= n) {
        dp[i * 3] = Math.min(dp[i * 3], dp[i] + 1);
        }
        if(i * 2 <= n) {
        dp[i * 2] = Math.min(dp[i * 2], dp[i] + 1);
        }
        if(i <= n-1) {
        dp[i + 1] = Math.min(dp[i + 1], dp[i] + 1);
        }
    }
        System.out.println(dp[n]);
    }
}
