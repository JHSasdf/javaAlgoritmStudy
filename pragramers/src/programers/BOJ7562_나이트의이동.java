package programers;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class BOJ7562_나이트의이동 {
    static int[][] graph;
    static int[][] direcitons = new int[][] {{-2,-1}, {-2, 1}, {-1, -2}, {-1, 2}, {1, -2}, {1, 2}, {2, -1}, {2, 1}};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            int l = sc.nextInt();
            graph = new int[l][l];
            int startR = sc.nextInt();
            int startC = sc.nextInt();
            int endR = sc.nextInt();
            int endC = sc.nextInt();
            bfs(new int[] {startR, startC}, new int[] {endR, endC});
            System.out.println(graph[endR][endC]);
        }
    }

    public static void bfs(int[] start, int[] end) {
        Queue<int[]> q = new ArrayDeque<>();
        q.add(start);
        while(!q.isEmpty()) {
            int[] now = q.poll();
            int nowR = now[0];
            int nowC = now[1];
            if(nowR == end[0] && nowC == end[1]) {
                break;
            }
            for(int[] direction: direcitons) {
                int nextR = nowR + direction[0];
                int nextC = nowC + direction[1];
                if (isValid(nextR, nextC)) {
                    graph[nextR][nextC] = graph[nowR][nowC] +1;
                    q.add(new int[] {nextR, nextC});
                }
            }
        }
    }
    public static boolean isValid(int nr, int nc) {
        return nr>= 0 && nr < graph.length && nc >= 0 && nc < graph.length && graph[nr][nc] == 0;
    }
}
