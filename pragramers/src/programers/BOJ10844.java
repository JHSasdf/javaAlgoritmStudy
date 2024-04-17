package programers;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ10844 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[][] dp = new long[10][101];
        for(int i = 1; i < 10; i ++) {
            dp[i][1] = 1;
        }
        for(int i = 1; i < n; i++) {
            for(int j = 0; j < 10; j++) {
                if(j == 0) {
                    dp[j+1][i+1] = (dp[j+1][i+1] + dp[j][i]) % 1000000000;
                } else if(j == 9) {
                    dp[j-1][i+1] = (dp[j-1][i+1] + dp[j][i]) % 1000000000;
                } else {
                    dp[j-1][i+1] = (dp[j][i] + dp[j-1][i+1]) % 1000000000;
                    dp[j+1][i+1] = (dp[j][i] + dp[j+1][i+1]) % 1000000000;
                }
            }
        }
        long result = 0;
        for(int i = 0; i < 10; i++) {
            result = (result + dp[i][n]) % 1000000000;
        }
        System.out.println(result);
    }
}
