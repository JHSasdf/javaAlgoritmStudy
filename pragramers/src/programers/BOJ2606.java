package programers;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ2606 {
    static boolean[] visited;
    static int[][] graph;
    static int count = 0;

    static int bfs(int node) {
        visited[node] = true;
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(node);
        while(!q.isEmpty()) {
            int now = q.poll();
            for(int i = 1; i <= graph.length-1; i++) {
                if(!visited[i] && graph[now][i] == 1) {
                    q.add(i);
                    visited[i] = true;
                    count++;
                }
            }
        }
        return count;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nodes = sc.nextInt();
        graph = new int[nodes+1][nodes+1];
        visited = new boolean[nodes+1];
        int line = sc.nextInt();
        for(int i = 0; i < line; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            graph[from][to] = 1;
            graph[to][from] = 1;
        }
        System.out.println(bfs(1));
    }
}
