package programers;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ2573 {
    static int[][] graph;
    static boolean[][] visited;
    static int[][] all = new int[][] {{-1,0}, {0,1}, {0,-1}, {1,0}};

    public static int[][] deepCopy(int[][] original) {
        if (original == null) return null;
        int[][] result = new int[original.length][];
        for (int i = 0; i < original.length; i++) {
            result[i] = new int[original[i].length];
            System.arraycopy(original[i], 0, result[i], 0, original[i].length);
        }
        return result;
    }

    public static int[][] oneYearsLater(int n, int m) {
        int[][] copy = deepCopy(graph);
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < m+1; j++) {
                int count = 0;
                for (int[] direction: all) {
                    if (graph[i + direction[0]][j + direction[1]] == 0) {
                        count++;
                    }
                }
                copy[i][j] -= count;
                copy[i][j] = Math.max(0, copy[i][j]);
            }
        }
        return copy;
    }

    public static int solution(int n, int m) {
        int count = 0;
        for(int i = 1; i < n+1; i++) {
            for (int j = 1; j < m+1; j++) {
                if (graph[i][j] > 0 && !visited[i][j]) {
                    Queue<int []> q = new LinkedList();
                    q.add(new int[] {i,j});
                    visited[i][j] = true;
                    count++;

                    while(!q.isEmpty()) {
                        int[] now = q.poll();


                        for (int[] direction: all) {
                            if (graph[now[0] + direction[0]][now[1] + direction[1]] > 0 && !visited[now[0] + direction[0]][now[1] + direction[1]]) {
                                q.add(new int[] {now[0] + direction[0],now[1] + direction[1]});
                                visited[now[0]+direction[0]][now[1]+direction[1]] =true;
                            }
                        }
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        graph = new int[n + 2 ][m + 2];
        visited = new boolean[n+2][m+2];

        for (int i = 1; i < n+1; i++) {
            for(int j = 1; j < m+1; j++) {
                graph[i][j] = sc.nextInt();
            }
        }
        int ans;
        int year = 0;
        while(true) {
            for (boolean[] vi: visited) {
                Arrays.fill(vi, false);
            }
                if (year > 0) {
                graph = oneYearsLater(n, m);
                }

            ans = solution(n,m);
            if (ans >= 2 || ans == 0) break;
            year++;
        }
        if(ans >= 2) {
        System.out.println(year);
        } else {
        System.out.println(ans);
        }
    }
}
