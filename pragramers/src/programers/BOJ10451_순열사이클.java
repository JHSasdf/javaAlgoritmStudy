package programers;

import java.util.Scanner;
import java.util.Stack;

public class BOJ10451_순열사이클 {
    static int[] visited;
    static int result;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            int m = sc.nextInt();
            visited = new int[m+1];
            int[] temp = new int[m+1];
            for(int j = 1; j < m+1; j++) {
                temp[j] = sc.nextInt();
            }
            result = 0;
            for(int j = 1; j < m+1; j++) {
                if(visited[j] == 0) {
                    dfs(temp, j);
                }
            }
            System.out.println(result);
        }
    }

    public static void dfs(int[] temp, int node) {

            result++;
            visited[node]++;
            Stack<Integer> s = new Stack<>();
            s.add(node);
            while(!s.isEmpty()) {
                int now = s.pop();
                int nextNode = temp[now];
                if(visited[nextNode] == 0) {
                    visited[nextNode]++;
                    s.add(nextNode);
                }
            }
        }
}
