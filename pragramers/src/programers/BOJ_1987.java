package programers;

import java.util.Scanner;

public class BOJ_1987 {
    static int[][] graph;
    static boolean[] visited;
    static int[][] direction = new int[][] {{-1,0}, {1,0}, {0,1}, {0,-1}};
    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        graph = new int[r][c];
        visited = new boolean[26];
        for (int i = 0; i < r; i++) {
            String str = sc.next();
            for (int j = 0; j < c; j++) {
                graph[i][j] = str.charAt(j) - 'A';
            }
        }
        visited[graph[0][0]] = true;
        recur(0,0,1);
        System.out.println(max);
    }
    public static void recur(int startX, int startY, int count) {
        boolean end = true;
        for(int[] dir : direction) {
            if(canGo(startX, startY, dir[0], dir[1])) {
                visited[graph[startX + dir[0]][startY + dir[1]]] = true;
                end = false;
                recur(startX + dir[0], startY + dir[1], count+1);
                visited[graph[startX + dir[0]][startY + dir[1]]] = false;
            }
        }
        if (end) {
             max = Math.max(max,count);
        }
    }

    public static boolean canGo(int row, int col, int x, int y) {
        return row + x > -1 && row + x < graph.length && col + y > -1 && col + y < graph[0].length && !visited[graph[row + x][col+y]];
    }
}
