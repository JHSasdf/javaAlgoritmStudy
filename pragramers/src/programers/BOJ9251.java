package programers;

import java.util.Scanner;

public class BOJ9251 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] firArr = sc.next().toCharArray();
        char[] scdArr = sc.next().toCharArray();
        int[][] dp = new int[firArr.length+1][scdArr.length+1];
        for(int i = 0; i < firArr.length; i++) {
            for(int j = 0; j < scdArr.length; j++) {
                if(firArr[i] == scdArr[j]) {
                    dp[i+1][j+1] = dp[i][j] + 1;
                } else {
                    dp[i+1][j+1] = Math.max(dp[i][j+1], dp[i+1][j]);
                }
            }
        }
        System.out.println(dp[firArr.length][scdArr.length]);
    }
}
