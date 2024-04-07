package programers;

import java.util.*;

public class BOJ11724 {

    static int n, m;
    static int[][] graph;
    static boolean[] visited;
    static int cnt = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        graph = new int[n + 1][n + 1];
        visited = new boolean[n + 1];

        for (int i = 0; i < m; i++) {
            int src = sc.nextInt();
            int dst = sc.nextInt();
            graph[src][dst] = 1;
            graph[dst][src] = 1;
        }

        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                bfs(i);
                cnt++;
            }

        }

        System.out.println(cnt);

    }

    static void dfsRecursion(int node) {
        visited[node] = true;
        for (int i = 1; i <= n; i++) {
            if (!visited[i] && graph[node][i] == 1) {
                dfsRecursion(i);
            }

        }
    }

    static void dfs2(int node) {
        Stack<Integer> s = new Stack<Integer>();
        s.push(node);
        visited[node] = true;
        while (!s.isEmpty()) {
            int now = s.pop();
            visited[now] = true;
            for (int i = 1; i <= n; i++) {
                if (graph[now][i] == 1 && !visited[i]) {
                    s.push(i);
                }
            }
        }
    }

    static void bfs(int node) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(node);
        visited[node] = true;
        while (!q.isEmpty()) {
            int now = q.poll();
            for (int i = 1; i <= n; i++) {
                if (graph[now][i] == 1 && !visited[i]) {
                    q.offer(i);
                    visited[i] = true;
                }
            }
        }
    }
static void s(int node) {
    Stack<Integer> s = new Stack<>();
    s.add(node);
    visited[node] = true;
    while(!s.isEmpty()) {
        int now = s.pop();
        for (int i = 1; i<=n; i++) {
            if(graph[now][i] == 1 && !visited[i]) {
                s.add(i);
                visited[i] = true;
            }
        }
    }
}
}


