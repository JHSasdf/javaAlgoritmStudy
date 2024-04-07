package programers;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ15655 {
        static int m;
        static int[] array;
        static boolean[] check;
        static int[] output;

        public static void recur(int depth, int n, int start) {
            if(depth == n) {
                StringBuilder sb = new StringBuilder();
                for(int out: output) {
                    sb.append(out + " ");
                }
                System.out.println(sb);
                return;
            }
            for(int i = start; i < m; i++) {
                if(!check[i]) {
                    check[i] = true;
                    output[depth] = array[i];
                    recur(depth+1, n, i+1);
                    check[i] = false;
                }
            }
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        int n = sc.nextInt();
        output = new int[n];
        array = new int[m];
        check = new boolean[m];
        for(int i = 0; i < m; i++) {
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        recur(0, n, 0);
    }
}
