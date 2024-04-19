package programers;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ11054 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        int[][] dp = new int[2][n+1];
        // 0은 내려가는 수열의 최대값, 1은 올라가는 수열의 최대값
        for(int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
            dp[0][i] = 1;
            dp[1][i] = 1;
        }

        // i는 해당 dp, j는 비교값
        for(int i = 2; i<= n; i++) {
            for(int j = 1; j < i; j++) {
                if(arr[j] > arr[i]) {
                    dp[0][i] = Math.max(Math.max(dp[0][i], dp[0][j] + 1), dp[1][j] + 1);
                } else if( arr[j] < arr[i]) {
                    dp[1][i] = Math.max(dp[1][j] + 1, dp[1][i]);
                } else {
                    dp[0][i] = Math.max(dp[0][j], dp[0][i]);
                    dp[1][i] = Math.max(dp[1][j], dp[1][i]);
                }
            }
        }
        int result = 0;
        for(int i = 1; i <= n; i++) {
            result = Math.max(result, dp[0][i]);
            result = Math.max(result, dp[1][i]);
        }

        System.out.println(result);
    }
}
