package programers;

import java.util.Scanner;

public class BOJ1147_동전 {
    static int[] coins;
    static int k;
    static int count;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        coins = new int[n];
        k = sc.nextInt();
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }
        solve(n-1);
        System.out.println(count);
    }


    private static void solve(int idx) {
        if(k == 0) {
            return;
        }

        if(coins[idx] > k) {
            solve(idx-1);
        } else {
            count += k / coins[idx];
            k %= coins[idx];
            solve(idx-1);
        }
    }
}
