package programers;

import java.util.Scanner;

public class BOJ1916 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int INF = 1000000000;
        int n = sc.nextInt(), e = sc.nextInt();
        int[][] graph = new int[n+1][n+1];
        int[] cost = new int[n+1];
        boolean[] visitied = new boolean[n+1];
        for(int i = 0; i <= n; i++) {
            cost[i] = INF;
            for(int j = 0; j <= n; j++) {
                graph[i][j] = INF;
            }
        }
        for(int i = 0; i < e; i++) {
            int src = sc.nextInt();
            int dist = sc.nextInt();
            int c = sc.nextInt();
            if(graph[src][dist] > c) {
                graph[src][dist] = c;
            }
        }
        int start = sc.nextInt();
        int end = sc.nextInt();
        cost[start] = 0;
        for(int i = 1; i <=n; i++) {
            int min = INF;
            int minIndex = -1;
            for(int j = 1; j <=n; j++) {
                if(cost[j] < min && !visitied[j]) {
                    min = cost[j];
                    minIndex = j;
                }
            }
            if(minIndex == -1) break;
            visitied[minIndex] = true;
            for(int j = 1; j <=n; j++) {
                if(cost[j] > cost[minIndex] + graph[minIndex][j]) {
                    cost[j] = cost[minIndex] + graph[minIndex][j];
                }
            }
        }
        System.out.println(cost[end]);
    }
}
