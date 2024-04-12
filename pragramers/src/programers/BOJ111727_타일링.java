package programers;

import java.util.Scanner;

public class BOJ111727_타일링 {
    static int[] dp = new int[1001];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solve(n));
    }
    public static int solve(int n) {
        dp[1] = 1;
        dp[2] = 3;
        for(int i = 3; i <= n; i++) {
            dp[i] = (dp[i-2] * 2 + dp[i-1]) % 10007;
        }
        return dp[n];
    }
}
