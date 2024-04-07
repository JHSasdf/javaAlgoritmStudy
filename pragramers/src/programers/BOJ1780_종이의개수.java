package programers;

import java.util.Scanner;

public class BOJ1780_종이의개수 {
    static int[][] graph;
    static int n;
    static int[] counts = new int[3];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        graph = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                graph[i][j] = sc.nextInt();
            }
        }
        solve(0,0, n);
        System.out.println(counts[0]);
        System.out.println(counts[1]);
        System.out.println(counts[2]);
    }

    public static void solve(int r, int c, int length) {
        if (isSame(r, c, length)) {
            if (graph[r][c] == -1) {
                counts[0]++;
            } else if (graph[r][c] == 0) {
                counts[1]++;
            } else {
                counts[2]++;
            }
            return;
        } else {
            int div = length / 3;
            for(int nr = 0; nr < 3; nr++) {
                for(int nc = 0; nc <3; nc++) {
                    solve(r + nr * div, c + nc * div, div);
                }
            }
        }
    }

    public static boolean isSame(int r, int c, int length) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (graph[r][c] != graph[r + i][c + j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
