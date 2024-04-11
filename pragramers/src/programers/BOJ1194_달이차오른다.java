package programers;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ1194_달이차오른다 {

    static int n, m;
    static char[][] maze;
    static int[][][] distance;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};
    static final int DOOR = 1;
    static final int KEY = 2;
    static final int EXIT = 3;
    static final int WALL = 4;
    static final int NONE = 5;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        maze = new char[n][m];
        distance = new int[n][m][1 << 6];
        Queue<Point1194> q = new LinkedList<>();
        for (int r = 0; r < n; r++) {
            String line = sc.next();
            for (int c = 0; c < m; c++) {
                char temp = line.charAt(c);
                maze[r][c] = temp;
                if (temp == '0') {
                    q.add(new Point1194(r, c, 0));
                    distance[r][c][0] = 1;
                }
            }
        }
        while (!q.isEmpty()) {
            Point1194 now = q.poll();
            for (int i = 0; i < 4; i++) {
                int nr = now.r + dr[i];
                int nc = now.c + dc[i];
                if (isOutOfRange(nr, nc)) continue;
                int next = maze[nr][nc];
                switch (getType(next)) {
                    case WALL: {
                        continue;
                    }
                    case NONE: {
                        if (distance[nr][nc][now.key] == 0) {
                            distance[nr][nc][now.key] = distance[now.r][now.c][now.key] + 1;
                            q.add(new Point1194(nr, nc, now.key));
                        }
                        break;
                    }
                    case EXIT: {
                        System.out.println(distance[now.r][now.c][now.key]);
                        return;
                    }
                    case KEY: {
                        int nextKey = now.key | (1 << (next - 'A'));
                        if (distance[nr][nc][nextKey] == 0) {
                            distance[nr][nc][nextKey] = distance[now.r][now.c][now.key] + 1;
                            q.add(new Point1194(nr, nc, nextKey));
                        }
                        break;
                    }
                    case DOOR: {
                        if ((now.key & (1 << (next - 'A'))) == 0) continue; // 매치하는 열쇠가 없음
                        if (distance[nr][nc][now.key] == 0) {
                            distance[nr][nc][now.key] =
                                    distance[now.r][now.c][now.key] + 1;
                            q.add(new Point1194(nr, nc, now.key));
                        }
                        break;
                    }
                }
            }
        }
        System.out.println(-1);
    }

    static boolean isOutOfRange(int r, int c) {
        return r < 0 || r >= n || c < 0 || c >= m;
    }

    static int getType(int c) {
        if (c == '#') return WALL;
        else if (c == '.' || c == '0') return NONE;
        else if (c >= 'a' && c <= 'z') return KEY;
        else if (c >= 'A' && c <= 'Z') return DOOR;
        else if (c == '1') return EXIT;
        else return -1;
    }
}

class Point1194 {
    int r, c, key;

    public Point1194(int r, int c, int key) {
        this.r = r;
        this.c = c;
        this.key = key;
    }
}
