package programers;

import java.util.Scanner;

public class BOJ15651 {
    static int[] output;
    static StringBuilder sb= new StringBuilder();
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        output = new int[m];
        recur(0, m, n);
        System.out.println(sb);
    }
    private static void recur(int depth, int length, int n) {
        if(depth == length) {
            for(int i = 0; i < length; i++) {
                sb.append(output[i] + " ");
            }
            sb.append("\n");
            return;
        }
        for(int i = 1; i <=n; i++) {
            output[depth] = i;
            recur(depth+1, length, n);

        }
    }
}
