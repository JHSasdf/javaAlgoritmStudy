package programers;

import java.util.Scanner;

public class BOJ14889 {
    static int min = Integer.MAX_VALUE;
    static int[] team1;
    static int[] team2;
    static int[][] graph;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        graph = new int[n + 1][n + 1];
        team1 = new int[n / 2 ];
        team2 = new int[n / 2 ];
        visited = new boolean[n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                graph[i][j] = sc.nextInt();
            }
        }
        recur(0,1, n/2);
        System.out.println(min);
    }

    private static void recur(int depth, int start, int to) {
        if (depth == to) {
            int sum1 = 0;
            int sum2 = 0;
            int idx = 0;
            for(int i = 1; i < visited.length; i++) {
                if(!visited[i]) {
                    team2[idx] = i;
                    idx++;
                }
            }

            for (int i = 0; i < to; i++) {
                for (int j = 0; j < to ; j++) {
                    sum1 += graph[team1[i]][team1[j]];
                    sum2 += graph[team2[i]][team2[j]];
                }
            }
            min = Math.min(min, Math.abs(sum1 - sum2));
            return;
        }
        for (int i = start; i < visited.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                team1[depth] = i;
                recur(depth +1, i+1, to);
                visited[i] = false;

            }
        }
    }
}
