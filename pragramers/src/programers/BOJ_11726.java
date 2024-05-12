package programers;

import java.util.Scanner;

public class BOJ_11726 {
    public static void main(String[] args) {
        int[] dp = new int[1001];
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i < 1001; i++) {
            dp[i] = (dp[i-2] + dp[i-1]) % 10007;
        }
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(dp[n]);
    }
}
