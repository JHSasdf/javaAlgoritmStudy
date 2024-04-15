package programers;

import java.util.Scanner;

public class BOJ9461_파도반수열 {
    public static void main(String[] args) {
        long[] dp = new long[101];
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1;
        for(int i = 4; i <= 100; i++) {
            dp[i] = dp[i-2]+dp[i-3];
        }
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            int tc = sc.nextInt();
            System.out.println(dp[tc]);
        }
    }

}
