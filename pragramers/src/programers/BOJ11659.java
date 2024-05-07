package programers;

import java.util.Scanner;

public class BOJ11659 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] arr = new int[n+1];
        int[] sum = new int[n+1];
        for(int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
            sum[i] = sum[i-1] + arr[i];
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < m; i++) {
            int start = sc.nextInt(), end = sc.nextInt();
            sb.append(sum[end] - sum[start - 1] + "\n");
        }
        System.out.println(sb);
    }
}
