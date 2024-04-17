package programers;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ11053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n+1];
        int[] nums = new int[n+1];
        for(int i = 1; i <= n; i++) {
            nums[i] = sc.nextInt();
            dp[i] = 1;
        }

        for(int i = 2; i <=n; i++) {
            for(int j = 1; j <= i; j++) {
                if(nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
        }
        System.out.println(Arrays.stream(dp).max().getAsInt());
    }
}
