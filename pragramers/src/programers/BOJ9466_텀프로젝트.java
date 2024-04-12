package programers;

import java.util.Scanner;
import java.util.Stack;

public class BOJ9466_텀프로젝트 {
    static int[] graph;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int i = 0 ; i < tc; i++) {
            int n = sc.nextInt();
            graph = new int[n+1];
            visited = new boolean[n+1];
            for(int j = 1; j < n+1; j++) {
                graph[j] = sc.nextInt();
            }
            int count = 0;
            for(int j = 1; j < n+1; j++) {
                visited = new boolean[n+1];
                    count += dfs(j)? 1:0;
            }
            System.out.println(count);
        }
    }
    public static boolean dfs(int node) {
        Stack<Integer> s = new Stack<>();
        s.add(node);
        visited[node] = true;
        while(!s.isEmpty()) {
            int now = s.pop();

            int nextNode = graph[now];
            if(!visited[nextNode]) {
                s.add(nextNode);
                visited[nextNode] = true;
                if(node == nextNode) {
                    return false;
                }
            }
        }
        return true;
    }
}
