package programers;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

public class BOJ_11722 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n+1];
        int[] arr = new int[n+1];
        Arrays.fill(dp, 1);
        int max = 0;
        for(int i = 1; i <=n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i = 1; i <=n; i++) {
            for (int j = 1; j < i; j++) {
                if (arr[i] < arr[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            max = Math.max(max, dp[i]);
        }
        System.out.println(max);
    }
}
