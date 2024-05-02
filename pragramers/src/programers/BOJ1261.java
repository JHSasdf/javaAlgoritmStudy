package programers;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class BOJ1261 {
    static int[][] direction = new int[][] {{0,1},{0,-1},{1,0},{-1,0}};
    static int[][] graph;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int INF = 10001;
        int n = sc.nextInt(), m = sc.nextInt();
        int[][] cost = new int[m][n];
        graph = new int[m][n];
        for(int i = 0; i < m; i++) {
            String str = sc.next();
            char[] chars = str.toCharArray();
            for(int j = 0; j < n; j++) {
                graph[i][j] = chars[j] - '0';
                cost[i][j] = INF;
            }
        }
        cost[0][0] = graph[0][0];
        PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> {
            return graph[o1[0]][o1[1]] - graph[o2[0]][o2[1]];
        });
        pq.offer(new int[] {0,0});
        while(!pq.isEmpty()) {
            int[] now = pq.poll();
            if(now[0] == m && now[1] == n) break;
            for(int[] dir: direction) {
                int nextX = now[0] + dir[0];
                int nextY = now[1] + dir[1];
                if(!isValid(nextX,nextY) || cost[nextX][nextY] < graph[now[0]][now[1]]) continue;
                if(cost[nextX][nextY] > cost[now[0]][now[1]] + graph[nextX][nextY]) {
                    cost[nextX][nextY] = cost[now[0]][now[1]] + graph[nextX][nextY];
                    pq.offer(new int[] {nextX,nextY});
                }
            }
        }
            System.out.println(cost[m-1][n-1]);
    }

    public static boolean isValid(int x, int y) {
        return x > -1 && x < graph.length && y > -1 && y < graph[0].length;
    }
}
