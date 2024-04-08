package programers;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class BOJ2178_미로탐색 {
    static int[][] graph;
    static boolean[][] visited;
    static int[][] directions = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        graph = new int[n][m];
        visited = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            for (int j = 0; j < m; j++) {
                graph[i][j] = str.charAt(j) - '0';
            }
        }
        System.out.println(bfs(0, 0));

    }

    public static int bfs(int r, int c) {
        visited[r][c] = true;
        Queue<int[]> q = new ArrayDeque<>();
        q.add(new int[]{r, c});
        int[][] distance = new int[graph.length][graph[0].length];
        distance[r][c] = 1;
        while (!q.isEmpty()) {
            int[] now = q.poll();

            for (int[] direction : directions) {
                int nextRow = now[0] + direction[0];
                int nextCol = now[1] + direction[1];
                if (canGo(nextRow, nextCol)) {
                    q.add(new int[]{nextRow, nextCol});
                    distance[nextRow][nextCol] = distance[now[0]][now[1]]+1;
                    visited[nextRow][nextCol] = true;
                    if (nextRow == graph.length - 1 && nextCol == graph[0].length - 1) {
                        return distance[nextRow][nextCol];
                    }
                }
            }
        }
        return -1;
    }

    public static boolean canGo(int nr, int nc) {
        return nr >= 0 && nr < graph.length && nc >= 0 && nc < graph[0].length && !visited[nr][nc] && graph[nr][nc] == 1;
    }

}
