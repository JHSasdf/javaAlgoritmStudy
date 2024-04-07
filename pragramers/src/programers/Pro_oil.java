package programers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Pro_oil {
    static int[][] graph;
    static boolean[][] visited;
    static int[] counts;
    static int[][] directions = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public static void initialize(int[][] land) {
        int n = land.length + 2;
        int m = land[0].length + 2;
        graph = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < m - 1; j++) {
                graph[i][j] = land[i-1][j-1];
            }
        }
    }

    // 첫 인덱스 끝 인덱스 카운트
    public static void bfs(int n, int m) {
        Queue<int[]> q = new LinkedList<>();
        int count = 0;
        int left = Integer.MAX_VALUE;
        int right = Integer.MIN_VALUE;
        q.add(new int[]{n, m});
        visited[n][m] = true;
        count++;
        while (!q.isEmpty()) {
            int[] now = q.poll();
            left = Math.min(now[1], left);
            right = Math.max(now[1], right);
            for (int[] direction : directions) {
                if (!visited[now[0] + direction[0]][now[1] + direction[1]] && graph[now[0] + direction[0]][now[1] + direction[1]] == 1) {
                    q.add(new int[]{now[0] + direction[0], now[1] + direction[1]});
                    visited[now[0] + direction[0]][now[1] + direction[1]] = true;
                    count++;
                    left = Math.min(now[1] + direction[1], left);
                    right = Math.max(now[1] + direction[1], right);
                }
            }
        }
        for(int i = left; i <= right; i++) {
            counts[i] += count;
        }
    }
    public static int solution(int[][] land) {
        initialize(land);
        counts = new int[land[0].length+1];

        for(int j = 1; j < land[0].length+1; j++) {
            for(int i = 1; i < land.length+1; i++) {
                if(graph[i][j] == 1 && !visited[i][j]) {
                    bfs(i,j);
                }
            }
        }

        return Arrays.stream(counts).max().getAsInt();
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{0, 0, 0, 1, 1, 1, 0, 0}, {0, 0, 0, 0, 1, 1, 0, 0}, {1, 1, 0, 0, 0, 1, 1, 0}, {1, 1, 1, 0, 0, 0, 0, 0}, {1, 1, 1, 0, 0, 0, 1, 1}}));
    }

}
