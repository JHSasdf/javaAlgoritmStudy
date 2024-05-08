package programers;

import java.util.Scanner;

public class BOJ2559 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int max = 0;
        int now = 0;
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if(i < m) {
                now+= arr[i];
                max+= arr[i];
                continue;
            }
            now = now - arr[i-m] + arr[i];
            max = Math.max(now, max);
        }
        System.out.println(max);

    }
}
