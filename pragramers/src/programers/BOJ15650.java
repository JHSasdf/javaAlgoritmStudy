package programers;

import java.util.Scanner;

public class BOJ15650 {
    static int[] output;
    static boolean[] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        visited = new boolean[n];
        output = new int[m];
        recur(0, 0, m);
    }

    static void recur(int depth, int next, int to) {
        if(depth == to) {
            for(int i = 0; i< output.length; i++) {
                System.out.print(output[i] + " ");
            }
            System.out.println();
            return;
        }
        for(int i = next; i < visited.length; i++) {
            if(!visited[i]) {
                visited[i] = true;
                output[depth] = i+1;
                recur(depth+1, i+1, to);
                visited[i] = false;
                output[depth] = 0;

            }
        }

    }
}
