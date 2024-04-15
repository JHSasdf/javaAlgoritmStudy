package programers;

import java.util.Scanner;

public class BOJ9184 {
        static int [][][] dp = new int[22][22][22];
    public static void main(String[] args) {
        dp[0][0][0] = 1;
        dp[1][0][0] = 1;
        dp[0][1][0] = 1;
        dp[0][0][1] = 1;
        dp[1][1][0] = 1;
        dp[0][1][1] = 1;
        dp[1][0][1] = 1;
        dp[1][1][1] = 2;

        Scanner sc = new Scanner(System.in);
        while(true) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if( a == -1 && b == -1 && c == -1) {
            break;
        }
        if ( a <= 0 || b <= 0 || c <= 0) {
            System.out.printf("w(%d, %d, %d) = %d \n", a, b, c, 1);
        } else if( a > 20 || b > 20 || c > 20) {
            System.out.printf("w(%d, %d, %d) = %d \n", a, b, c, recur(20,20,20));
        }  else {
            System.out.printf("w(%d, %d, %d) = %d \n", a, b, c, recur(a,b,c));
        }
        }
    }

    private static int recur(int a, int b, int c) {
        if(a<=0 || b<=0||c<=0) return 1;

        if(dp[a][b][c] != 0) {
            return dp[a][b][c];
        } else {
        if(a < b && b < c) {
            dp[a][b][c] = recur(a,b,c-1) + recur(a,b-1,c-1) - recur(a,b-1,c);
        } else {
            dp[a][b][c] = recur(a-1,b,c) + recur(a-1,b-1,c) + recur(a-1,b,c-1) - recur(a-1,b-1,c-1);
        }
        return dp[a][b][c];
        }
    }
}
