package programers;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ10971 {
    static int[][] graph;
    static boolean[] visited;
    static int answer = Integer.MAX_VALUE;
    static int[] order;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        graph = new int[n][n];
        order = new int[n];
        visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                graph[i][j] = sc.nextInt();
            }
        }
        recur(0, 0);
            System.out.println(answer);
    }

    public static boolean canGo(int a, int b) {
        return graph[a][b] != 0;
    }

    public static void recur(int depth, int sum) {
        if (depth == visited.length) {
            for (int i = 0; i < order.length - 1; i++) {
                if (!canGo(order[i], order[i + 1])) {
                    return;
                }
            }
            if (canGo(order[depth - 1], order[0])) {
                sum += graph[order[depth - 1]][order[0]];
                answer = Math.min(answer, sum);
            }
            return;
        }
        for (int i = 0; i < visited.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                order[depth] = i;
                int price = 0;
                if (depth > 0) {
                    price = graph[order[depth - 1]][order[depth]];
                }
                recur(depth + 1, sum + price);
                visited[i] = false;
            }
        }
    }
}
