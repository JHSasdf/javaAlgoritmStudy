package programers;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ5427_불 {
    static int[][] visited;
    static int[][] fire;
    static int n, m;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, 1, -1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int t = 0; t< tc; t++) {
            m = sc.nextInt();
            n = sc.nextInt();
            visited = new int[n][m];
            fire = new int[n][m];
            Queue<Point> q = new LinkedList<>();
            Queue<Point> fireQ = new LinkedList<>();
            for(int i = 0; i < n; i++) {
                String line = sc.next();
                for(int j = 0; j < m; j++) {
                    char c = line.charAt(j);
                    if(c == '#') {
                        fire[i][j] = visited[i][j] = -1;
                    } else if(c == '@') {
                        q.add(new Point(i,j));
                        visited[i][j] = 1;
                    } else if(c == '*') {
                        fireQ.add(new Point(i,j));
                        fire[i][j] =1;
                    }
                }
            }
        // 불을 먼저 질러서 언제 불이 전파되는지 기록한다
        while(!fireQ.isEmpty()) {
            Point now = fireQ.poll();
            for(int i = 0; i < 4; i++) {
                int nr = now.r + dr[i];
                int nc = now.c + dc[i];
                if(isOutOfRange(nr, nc)) continue;
                if(fire[nr][nc] == 0) {
                    fire[nr][nc] = fire[now.r][now.c] +1;
                    fireQ.add(new Point(nr, nc));
                }
            }
        }
        boolean isEscaped = false;
        while(!q.isEmpty()) {
            Point now = q.poll();
            if(isExit(now.r, now.c)) {
                System.out.println(visited[now.r][now.c]);
                isEscaped = true;
                break;
            }
            for(int i = 0 ; i < 4 ; i++) {
                int nr = now.r + dr[i];
                int nc = now.c + dc[i];
                if(isOutOfRange(nr, nc)) continue;
                if(visited[nr][nc] !=0 ) continue;
                if(fire[nr][nc] == 0 || fire[nr][nc] > visited[now.r][now.c] + 1) {
                    visited[nr][nc] = visited[now.r][now.c] +1;
                    q.add(new Point(nr, nc));
                }
            }
        }

        if(!isEscaped) {
            System.out.println("IMPOSSIBLE");
        }
        }

    }
    static boolean isOutOfRange(int r, int c) {
        return r < 0 || r >= n || c < 0 || c>=m;
    }
    static boolean isExit(int r, int c) {
        return r == 0 || r == n-1 || c == 0 || c==m-1;
    }
}

class Point {
    int r, c;

     Point(int r, int c) {
        this.r = r;
        this.c = c;
    }
}