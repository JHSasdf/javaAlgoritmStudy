package programers;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;

public class BOJ7576_토마토 {
    static int[][] graph;
    static int[][] days;
    static int col;
    static int row;
    static int[][] directions = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         col = sc.nextInt();
         row = sc.nextInt();
        graph = new int[row][col];
        days = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int status = sc.nextInt();
                graph[i][j] = status;
            }
        }
        bfs();
        int answer = -1;
        boolean out = false;
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                answer = Math.max(answer, days[i][j]);
                if(graph[i][j] == 0) {
                    answer = -1;
                    out = true;
                    break;
                }
            }
            if(out) {
                break;
            }
        }
        System.out.println(answer);
    }

    public static void bfs() {
        Queue<int[]> q= new ArrayDeque<>();
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if(graph[i][j] == 1) {
                    q.add(new int[] {i,j});
                }
            }
        }
            while(!q.isEmpty()) {
                int[] now = q.poll();
                int nowX = now[0];
                int nowY = now[1];
                for(int[] direction: directions) {
                    int nextX = nowX + direction[0];
                    int nextY = nowY + direction[1];
                    if(isValid(nextX, nextY)) {
                        days[nextX][nextY] = days[nowX][nowY]+1;
                        graph[nextX][nextY] = 1;
                        q.add(new int[]{nextX,nextY});
                    }
                }
            }
    }


    public static boolean isValid(int nr, int nc) {
        return nr >= 0 && nr < row && nc >= 0 && nc < col && graph[nr][nc] == 0;
    }
}
