package programers;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ2758 {

    static long[][] memo;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            memo = new long[n + 1][m + 1];
            for (int p = 0; p <= n; p++) {
                for (int j = 0; j <= m; j++) {
                    memo[p][j] = -1;
                }
            }
            System.out.println(solve(n, m));
        }
    }

    public static long solve(int i, int last) {
        if (last <= 0) return 0;

        if (i == 1) return last;

        if (memo[i][last] == -1) {
            memo[i][last] = solve(i - 1, last / 2) + solve(i, last - 1);
        }
        return memo[i][last];
    }
}
