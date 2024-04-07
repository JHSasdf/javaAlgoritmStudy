package programers;

import java.util.Scanner;

public class BOJ6603 {
    static int[] arr;
    static boolean[] checked;
    static int[] output;

    public static void recur(int depth, int n, int m, int start) {

        if(depth == m) {
            StringBuilder sb = new StringBuilder();
            for(int out: output) {
                sb.append(out + " ");
            }
            System.out.println(sb);
            return;
        }
        for(int i = start; i < n; i++) {
            if(!checked[i]) {
                if(depth == 0 || output[depth-1] < arr[i]) {
                checked[i] = true;
                output[depth] = arr[i];
                recur(depth+1, n, m, start+1);
                checked[i] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            arr = new int[n];
            checked = new boolean[n];
            output = new int[6];

            for(int i =0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            recur(0, n, 6, 0);
            System.out.println();
        }
    }
}
